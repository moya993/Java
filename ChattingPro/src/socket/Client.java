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
	
	////////////// UI ���� ///////////////////
	
	
	@Override
		public void start(Stage arg0) throws Exception {
			VBox vBox = new VBox();
			vBox.setPrefSize(400, 300);		// UIâ ũ��
			vBox.setSpacing(15);		// ��Ʈ���� ���� ����
			
			Button btn1 = new Button();		// ��ư1 ��ü ����
			btn1.setText("���� Ȯ��");			// ��ư ����
			
			TextArea textArea1 = new TextArea();	// ���â1 ��ü ����
			TextArea textArea2 = new TextArea();	// ���â2 ��ü ����

			textArea2.setPrefSize(400, 5);		// �Է�â ũ�� ����
			
			
			btn1.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					try {
				         Socket socket = null;
				         socket = new Socket("192.168.0.2", 5001); // ���� ������ ���� 
				         // �� �ּ� : 220.119.26.14
				         // ����� �ּ� : 218.154.207.193
				         // ���־� �ּ� : 115.22.10.97
				         // ���ƾ� �ּ� : 211.221.45.233
				         System.out.println("������ ���� ����!"); // ���� Ȯ�ο�
				         
				         ListeningThread t1 = new ListeningThread(socket); // �������� ���� �޼��� �д� Thread
				         WritingThread t2 = new WritingThread(socket); // ������ �޼��� ������ Thread

				         t1.start(); // ListeningThread Start
				         t2.start(); // WritingThread Start
				        
				         
				      } catch (IOException e) {
				         e.printStackTrace(); // ����ó��
				      }
				}
			});
			
			
		
			
			
			vBox.getChildren().addAll(btn1 ,textArea1, textArea2);

			// â ������ ���� ����
	        Scene scene = new Scene(vBox);

	        arg0.setScene(scene);

	        // â ����
	        arg0.setTitle("Ŭ���̾�Ʈ");

	        // â ���̱�
	        arg0.show();
			
			
		}
	
	

	
	//////////////UI �� ///////////////////
	
	
	
   public static void main(String[] args) {
      
      ////////
      launch();
      ///////
      
      
   }
}
