package TeamSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class ChatClient extends Application {
	Socket socket;
	TextArea textArea;
	
	// 클라이언트 프로그램 동작 메소드
	public void startClient(String IP, int port) {
		//서버프로그램과 다르게 여러개의 쓰레드가 동시다발적으로 생겨나는 경우가 없기 때문에
		//굳이 ThreadPool을 사용할 필요가 없다.
		//따라서 Runnable객체 대신에 단순하게 Thread객체를 사용한다.
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// 소켓 초기화
					socket = new Socket(IP, port);
					// 메시지를 전달받도록 receive 메소드 호출
					receive();
					
				} catch (Exception e) {
					//오류가 발생한 경우
					if(!socket.isClosed()) {
						//stopClient 메소드를 호출해서 클라이언트를 종료
						stopClient();
						System.out.println("[서버 접속 실패]");
						//프로그램 자체를 종료시킨다.
						Platform.exit();
					}
				}
			}
		};
		thread.start();
	}
	
	
	// 클라이언트 프로그램 종료 메소드
	public void stopClient() {
		try {
			// 소켓이 열려있는 상태라면
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 서버로부터 메시지를 전달받는 메소드
	// 계속 전달받기 위해서 무한loop를 돌려준다.
	public void receive() {
		while(true) {
			try {
				// 현재 서버로부터 어떠한 메시지를 전달받을 수 있도록.
				InputStream in = socket.getInputStream();
				// 512byte만큼 버퍼에 담아서 끊어서 계속 전달받을 것.
				byte[] buffer = new byte[512];
				// read함수로 실제로 입력을 받는다.
				int length = in.read(buffer);
				// 내용을 입력받는 도중에 오류가 발생하면 IOException을 발생시킨다.
				if(length == -1 ) throw new IOException();
				// message에 버퍼에 있는 정보를 담기.
				String message = new String(buffer, 0, length, "UTF-8");
				// 화면에 출력
				Platform.runLater(()->{
					// textArea는 GUI 요소중 하나로써 화면에 출력해주는 요소
					textArea.appendText(message);
				});
				
			} catch (Exception e) {
				//오류가 발생했을 때는 stopClient 호출 후 반복문 break;
				stopClient();
				break;
			}
		}
	}
	
	
	// 서버로 메시지를 전송하는 메소드
	public void send(String message) {
		// 여기서도 메시지를 전송할 때 Thread를 이용하는데,
		// 서버로 메시지를 전송하기 위한 Thread 1개
		// 서버로부터 메시지를 전달받는 Thread 1개
		// 이렇게 총 2개의 Thread가 각각 다른 역할을 가진다.
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream out = socket.getOutputStream();
					// 보내고자 하는 것을 UTF-8로 인코딩을 한다.
					// 서버에서 전달받을 때 UTF-8로 인코딩된 것을 받도록 해두었기 때문.
					byte[] buffer = message.getBytes("UTF-8");
					//메시지 전송
					out.write(buffer);
					//메시지 전송의 끝을 알림.
					out.flush();
					
				} catch (Exception e) {
					//오류가 발생했다면
					stopClient();
				}
			}
		};
		thread.start();
	}
	
	
	// 실제로 프로그램을 동작시키는 메소드
	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		
		// BorderPane위에 하나의 레이아웃을 더 넣어주기 위한 것.
		HBox hbox = new HBox();
		// 여백
		hbox.setSpacing(5);
		
		// 사용자 이름이 들어갈 수 있는 텍스트 공간
		TextField userName = new TextField();
		userName.setPrefWidth(150); // 너비
		userName.setPromptText("닉네임을 입력하세요.");
		// HBox내부에 TextField가 항상 출력되도록.
		HBox.setHgrow(userName, Priority.ALWAYS);
		
		TextField IPText = new TextField("211.221.45.85");
		TextField portText = new TextField("5001");
		portText.setPrefWidth(80);
		
		
		// hbox에 3개의 텍스트박스가 추가될 수 있도록.
		hbox.getChildren().addAll(userName, IPText, portText);
		
		// borderPane 상단에 위치
		root.setTop(hbox);
		textArea = new TextArea();
		// 내용을 수정할 수 없도록 설정
		textArea.setEditable(false);
		// 레이아웃(borderPane)의 중간에 위치
		root.setCenter(textArea);
		
		TextField input = new TextField();
		input.setPrefWidth(Double.MAX_VALUE);
		input.setDisable(true); // 접속하기 이전에는 어떠한 메시지를 전송할 수 없도록.
		input.setOnAction(event ->{
			// 서버로 어떠한 메시지를 전달할 수 있도록.
			send(userName.getText() + ": " + input.getText() +"\n");
			input.setText(""); // 전송했으니까 전송칸 비우기
			input.requestFocus(); // 다시 어떠한 메시지를 전송할 수 있도록 포커싱을 설정
		});
		
		Button sendButton = new Button("보내기");
		sendButton.setDisable(true); // 접속하기 이전에는 이용할 수 없도록 설정
		
		// 버튼을 누르는 이벤트가 발생했을 때 전송될 수 있도록
		sendButton.setOnAction(event ->{
			send(userName.getText() +": " + input.getText() + "\n");
			input.setText("");
			input.requestFocus();
		});
		
		Button connectionButton = new Button("접속하기");
		connectionButton.setOnAction(event ->{
			// 버튼이 현재 "접속하기"인 것을 클릭했다면
			if(connectionButton.getText().equals("접속하기")) {
				int port = 9876; // 포트번호 기본 설정
				try {
					// 포트번호 입력칸에 들어있는 텍스트 내용을 정수형태로 변환해서 다시 담을 수 있도록 한다.
					// 사용자가 직접 포트번호를 설정도 할 수 있도록.
					port = Integer.parseInt(portText.getText());
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 특정한 IP주소에 어떠한 port번호로 접속할 수 있도록.
				startClient(IPText.getText() , port);
				// runLater 함수로 실질적으로 화면에 관련된 내용이 출력될 수 있도록.
				Platform.runLater(() -> {
					textArea.appendText("[채팅방 접속]\n");
				});
				connectionButton.setText("종료하기"); // 버튼명 변경
				input.setDisable(false); // 버튼을 조작할 수 있도록 false로 처리
				sendButton.setDisable(false);
		 		input.requestFocus(); // 바로 입력할 수 있도록 포커싱
			} else {
				// 접속하기 버튼이 아니라 종료하기 버튼이었다면
				stopClient();
				Platform.runLater(()->{
					textArea.setText("[ 채팅방 퇴장 ]\n");
				});
				connectionButton.setText("접속하기");
				input.setDisable(true);
				sendButton.setDisable(true);
			}
		});
		
		//위에서 설정한 내용을 넣을 공간 생성
		BorderPane pane = new BorderPane();
		pane.setLeft(connectionButton);
		pane.setCenter(input);
		pane.setRight(sendButton);
		
		root.setBottom(pane);
		Scene scene = new Scene(root, 600, 600);
		primaryStage.setTitle("[ 채팅 클라이언트 ]");
		primaryStage.setScene(scene); // scene등록
		primaryStage.setOnCloseRequest(event -> stopClient()); // 화면닫기 버튼을 누르면 stopClient 수행 후 종료.
		primaryStage.show();
		
		connectionButton.requestFocus();		
	}
	
	// 프로그램의 진입접입니다.
	public static void main(String[] args) {
		launch(args);
	}
}
////		new Scanner(System.in).nextInt();
////		System.out.println("Client End");
////	}
////
////}