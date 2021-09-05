package socket;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



// WritiingTgread
class WritingThread extends Thread { // 서버로 메세지 보내는 Thread
	Socket socket = null;
	Scanner scanner = new Scanner(System.in); // 채팅용 Scanner

	public WritingThread(Socket socket) { // 생성자
		this.socket = socket; // 받아온 Socket Parameter를 해당 클래스 Socket에 넣기
	}

	public void run() {
		try {
			// OutputStream - 클라이언트에서 Server로 메세지 발송
			OutputStream out = socket.getOutputStream(); // socket의 OutputStream 정보를 OutputStream out에 넣은 뒤
			PrintWriter writer = new PrintWriter(out, true); // PrintWriter에 위 OutputStream을 담아 사용

			while (true) { // 무한반복
				writer.println(scanner.nextLine()); // 입력한 메세지 발송
			}

		} catch (Exception e) {
			e.printStackTrace(); // 예외처리
		}

	}

}



// ListeningThread
class ListeningThread extends Thread { // 서버에서 보낸 메세지 읽는 Thread
	Socket socket = null;

	public ListeningThread(Socket socket) { // 생성자
		this.socket = socket; // 받아온 Socket Parameter를 해당 클래스 Socket에 넣기
	}

	public void run() {
		try {
			// InputStream - Server에서 보낸 메세지를 클라이언트로 가져옴
			InputStream input = socket.getInputStream(); // socket의 InputStream 정보를 InputStream in에 넣은 뒤
			BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // BufferedReader에 위 InputStream을
																						// 담아 사용

			while (true) { // 무한반복
				System.out.println(reader.readLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}



class ConThread extends Thread {
	
	Server server;
	
	Socket socket;
	
	

	public Socket getSocket() {
		return socket;
	}

	public ConThread(Server server) {
		this.server = server;
	}

	@Override
	public void run() {
		try {
			int socketPort = 5001; // 소켓 포트 설정용
			ServerSocket serverSocket = new ServerSocket(); // 서버 소켓 만들기
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), socketPort));
			server.getTextArea1().appendText("socket : " + socketPort + "으로 서버가 열렸습니다");
			System.out.println("socket : " + socketPort + "으로 서버가 열렸습니다"); // 서버 오픈 확인용

			while (true) {
				socket = serverSocket.accept();
				new ConnectThread(server, socket).start();
			}

		} catch (Exception e) {
			// TODO: handle exception

		}
	}
}



class ConnectThread extends Thread {

	ArrayList<Socket> list = new ArrayList<Socket>(); // ArrayList로 유저 확인하려고
	Socket socket = null;
	Server server = null;

	ConnectThread(Server server, Socket socket) {
		this.server = server; // 유저 socket을 할당
		this.socket = socket;
		list.add(socket); // 유저를 list에 추가
	}

	public void run() { // Thread 에서 start() 메소드 사용 시 자동으로 해당 메소드 시작 (Thread별로 개별적 수행)
		try {
			String connect = "서버 : " + socket.getInetAddress() + " IP의 클라이언트와 연결되었습니다";
			System.out.println(server);
			server.getTextArea1().appendText(connect);
			System.out.println("서버 : " + socket.getInetAddress() + " IP의 클라이언트와 연결되었습니다"); // 연결 확인용

			// InputStream - 클라이언트에서 보낸 메세지 읽기
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // 클라이언트 글자 깨지면 "UTP-8" 넣어주고 언어변환

			// OutputStream - 서버에서 클라이언트로 메세지 보내기
			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(out, true);

			// 클라이언트에게 연결되었다는 메세지 보내기
			writer.println("서버에 연결되었습니다! ID를 입력해 주세요!");

			String readValue; // Client에서 보낸 값 저장
			String name = null; // 클라이언트 이름 설정용
			boolean identify = false;

			while ((readValue = reader.readLine()) != null) { // 클라이언트가 메세지 입력시마다 수행
				if (!identify) { // 연결 후 한번만 노출
					name = readValue; // 이름 할당
					identify = true;
					System.out.println(name + "님이 접속하셨습니다.");
					writer.println(name + "님이 접속하셨습니다."); // 서버에서 누가 접속했는지 알려줌 ㅎㅎ
					continue;
				}

				for (int i = 0; i < list.size(); i++) { // list 안에 클라이언트 정보가 담겨있음
					out = list.get(i).getOutputStream();
					writer = new PrintWriter(out, true);
					writer.println(name + " : " + readValue); // 클라이언트에게 메세지 발송
					System.out.println(name + " : " + readValue);
				}
			}

		} catch (Exception e) {
			e.printStackTrace(); // 예외처리
		}
	}

}

public class Server extends Application {
	
	TextArea textArea1;


	public TextArea getTextArea1() {
		return textArea1;
	}

	@Override
	public void start(Stage arg0) throws Exception {
		//////////////UI 시작 ///////////////////

		VBox vBox = new VBox();
		vBox.setPrefSize(400, 300); // UI창 크기
		vBox.setSpacing(15); // 컨트롤의 수직 간격

		Button btn1 = new Button(); // 버튼1 객체 생성
		btn1.setText("접속 확인"); // 버튼 내용


		
		
		TextArea textArea1 = new TextArea(); // 출력창1 객체 생성
		textArea1.setEditable(false);	//textArea1 글 차단 
		
		TextField textField = new TextField();
		
		textField.setPrefSize(400, 10); // 입력창 크기 조절

		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				new ConThread(Server.this).start();
				
			
				
				
			}
		});


		
		
		vBox.getChildren().addAll(btn1, textArea1, textField);
		
		// 창 사이즈 설정 적용
		Scene scene = new Scene(vBox);

		arg0.setScene(scene);

		// 창 제목
		arg0.setTitle("서버");

		// 창 보이기
		arg0.show();

	}

	public static void main(String[] args) {
		launch();
	}
}
