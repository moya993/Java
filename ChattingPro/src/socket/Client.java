package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Client extends Application{
	
	////////////// UI 시작 ///////////////////
	
	
	@Override
		public void start(Stage arg0) throws Exception {
			VBox vBox = new VBox();
			vBox.setPrefSize(400, 300);		// UI창 크기
			vBox.setSpacing(15);		// 컨트롤의 수직 간격
			
			Button btn1 = new Button();		// 버튼1 객체 생성
			btn1.setText("접속 확인");			// 버튼 내용
			
			TextArea textArea1 = new TextArea();	// 출력창1 객체 생성
			TextArea textArea2 = new TextArea();	// 출력창2 객체 생성

			textArea2.setPrefSize(400, 5);		// 입력창 크기 조절
			
			
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					try {
				         Socket socket = null;
				         socket = new Socket("192.168.0.2", 5001); // 소켓 서버에 접속 
				         // 내 주소 : 220.119.26.14
				         // 반장님 주소 : 218.154.207.193
				         // 우주씨 주소 : 115.22.10.97
				         // 태훈씨 주소 : 211.221.45.233
				         System.out.println("서버에 접속 성공!"); // 접속 확인용
				         
				         ListeningThread t1 = new ListeningThread(socket); // 서버에서 보낸 메세지 읽는 Thread
				         WritingThread t2 = new WritingThread(socket); // 서버로 메세지 보내는 Thread

				         t1.start(); // ListeningThread Start
				         t2.start(); // WritingThread Start
				        
				         
				      } catch (IOException e) {
				         e.printStackTrace(); // 예외처리
				      }
				}
			});
			
			
		
			
			
			vBox.getChildren().addAll(btn1 ,textArea1, textArea2);

			// 창 사이즈 설정 적용
	        Scene scene = new Scene(vBox);

	        arg0.setScene(scene);

	        // 창 제목
	        arg0.setTitle("클라이언트");

	        // 창 보이기
	        arg0.show();
			
			
		}
	
	

	
	//////////////UI 끝 ///////////////////
	
	
	
   public static void main(String[] args) {
      
      ////////
      launch();
      ///////
      
      
   }
}
