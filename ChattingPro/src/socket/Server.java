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
class WritingThread extends Thread { // ������ �޼��� ������ Thread
	Socket socket = null;
	Scanner scanner = new Scanner(System.in); // ä�ÿ� Scanner

	public WritingThread(Socket socket) { // ������
		this.socket = socket; // �޾ƿ� Socket Parameter�� �ش� Ŭ���� Socket�� �ֱ�
	}

	public void run() {
		try {
			// OutputStream - Ŭ���̾�Ʈ���� Server�� �޼��� �߼�
			OutputStream out = socket.getOutputStream(); // socket�� OutputStream ������ OutputStream out�� ���� ��
			PrintWriter writer = new PrintWriter(out, true); // PrintWriter�� �� OutputStream�� ��� ���

			while (true) { // ���ѹݺ�
				writer.println(scanner.nextLine()); // �Է��� �޼��� �߼�
			}

		} catch (Exception e) {
			e.printStackTrace(); // ����ó��
		}

	}

}



// ListeningThread
class ListeningThread extends Thread { // �������� ���� �޼��� �д� Thread
	Socket socket = null;

	public ListeningThread(Socket socket) { // ������
		this.socket = socket; // �޾ƿ� Socket Parameter�� �ش� Ŭ���� Socket�� �ֱ�
	}

	public void run() {
		try {
			// InputStream - Server���� ���� �޼����� Ŭ���̾�Ʈ�� ������
			InputStream input = socket.getInputStream(); // socket�� InputStream ������ InputStream in�� ���� ��
			BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // BufferedReader�� �� InputStream��
																						// ��� ���

			while (true) { // ���ѹݺ�
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
			int socketPort = 5001; // ���� ��Ʈ ������
			ServerSocket serverSocket = new ServerSocket(); // ���� ���� �����
			serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), socketPort));
			server.getTextArea1().appendText("socket : " + socketPort + "���� ������ ���Ƚ��ϴ�");
			System.out.println("socket : " + socketPort + "���� ������ ���Ƚ��ϴ�"); // ���� ���� Ȯ�ο�

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

	ArrayList<Socket> list = new ArrayList<Socket>(); // ArrayList�� ���� Ȯ���Ϸ���
	Socket socket = null;
	Server server = null;

	ConnectThread(Server server, Socket socket) {
		this.server = server; // ���� socket�� �Ҵ�
		this.socket = socket;
		list.add(socket); // ������ list�� �߰�
	}

	public void run() { // Thread ���� start() �޼ҵ� ��� �� �ڵ����� �ش� �޼ҵ� ���� (Thread���� ������ ����)
		try {
			String connect = "���� : " + socket.getInetAddress() + " IP�� Ŭ���̾�Ʈ�� ����Ǿ����ϴ�";
			System.out.println(server);
			server.getTextArea1().appendText(connect);
			System.out.println("���� : " + socket.getInetAddress() + " IP�� Ŭ���̾�Ʈ�� ����Ǿ����ϴ�"); // ���� Ȯ�ο�

			// InputStream - Ŭ���̾�Ʈ���� ���� �޼��� �б�
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input)); // Ŭ���̾�Ʈ ���� ������ "UTP-8" �־��ְ� ��ȯ

			// OutputStream - �������� Ŭ���̾�Ʈ�� �޼��� ������
			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(out, true);

			// Ŭ���̾�Ʈ���� ����Ǿ��ٴ� �޼��� ������
			writer.println("������ ����Ǿ����ϴ�! ID�� �Է��� �ּ���!");

			String readValue; // Client���� ���� �� ����
			String name = null; // Ŭ���̾�Ʈ �̸� ������
			boolean identify = false;

			while ((readValue = reader.readLine()) != null) { // Ŭ���̾�Ʈ�� �޼��� �Է½ø��� ����
				if (!identify) { // ���� �� �ѹ��� ����
					name = readValue; // �̸� �Ҵ�
					identify = true;
					System.out.println(name + "���� �����ϼ̽��ϴ�.");
					writer.println(name + "���� �����ϼ̽��ϴ�."); // �������� ���� �����ߴ��� �˷��� ����
					continue;
				}

				for (int i = 0; i < list.size(); i++) { // list �ȿ� Ŭ���̾�Ʈ ������ �������
					out = list.get(i).getOutputStream();
					writer = new PrintWriter(out, true);
					writer.println(name + " : " + readValue); // Ŭ���̾�Ʈ���� �޼��� �߼�
					System.out.println(name + " : " + readValue);
				}
			}

		} catch (Exception e) {
			e.printStackTrace(); // ����ó��
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
		//////////////UI ���� ///////////////////

		VBox vBox = new VBox();
		vBox.setPrefSize(400, 300); // UIâ ũ��
		vBox.setSpacing(15); // ��Ʈ���� ���� ����

		Button btn1 = new Button(); // ��ư1 ��ü ����
		btn1.setText("���� Ȯ��"); // ��ư ����


		
		
		TextArea textArea1 = new TextArea(); // ���â1 ��ü ����
		textArea1.setEditable(false);	//textArea1 �� ���� 
		
		TextField textField = new TextField();
		
		textField.setPrefSize(400, 10); // �Է�â ũ�� ����

		btn1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				new ConThread(Server.this).start();
				
			
				
				
			}
		});


		
		
		vBox.getChildren().addAll(btn1, textArea1, textField);
		
		// â ������ ���� ����
		Scene scene = new Scene(vBox);

		arg0.setScene(scene);

		// â ����
		arg0.setTitle("����");

		// â ���̱�
		arg0.show();

	}

	public static void main(String[] args) {
		launch();
	}
}
