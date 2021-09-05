package TeamSocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
// ChatServer가 1명의 Client와 통신을 하기 위해서 필요한 기능을 정의한 클래스
public class ChatHandler {
	
	//네트워크상에서 통신하기 위한 소켓
	Socket socket;
	
	//매개변수를 통해 넘어오는 것을 이용해서 소켓을 초기화하는 생성자
	public ChatHandler(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	// 클라이언트로부터 메시지를 전달 받는 메소드.
	public void receive() {
		Runnable thread = new Runnable() {
			
			//하나의 Thread 어떠한 모듈로써 동작을 할 것인지 run()에서 정의를 해준다.
			@Override
			public void run() {
				try {
					
					//클라이언트로부터 반복적으로 내용을 전달받을 수 있도록
					while(true) {
						// 내용을 전달받기 위한 InputStream 객체 생성
						InputStream in = socket.getInputStream();
						// 한 번에 512byte만큼 전달 받을 수 있는 버퍼 생성
						byte[] buffer = new byte[512];
						// 실제로 클라이언트로부터 어떠한 내용을 전달받아서 buffer에 담아주도록 한 것.
						// length는 담긴 메시지의 크기를 의미.
						int length = in.read(buffer);
						
						// 메시지를 읽어들일 때 오류가 발생했다면 알려줌.
						while(length== -1) throw new IOException();
						
						System.out.println("[메시지 수신 성공] "
								+ socket.getRemoteSocketAddress() // 클라이언트의 주소 정보 출력
								+ "; " + Thread.currentThread().getName()); // Thread의 고유한 정보(이름값) 출력
						
						// buffer에서 전달받은 내용을 message변수에 담아서 출력할 수 있도록 하는것, 한글을 포함하는 UTF-8로 인코딩.
						String message = new String(buffer, 0, length, "UTF-8");
						
						// 단순하게 메시지를 전달만 받는 것이 아니라, 전달받은 메시지를 다른 클라이언트에게도 보낼 수 있도록 만든다.
						for(ChatHandler client : ChatServer.clients) {
							client.send(message);
						}
						
					}
				}catch (Exception e) {
					// 오류가 발생했을 때 오류를 처리하는 부분
					// 이렇게 중첩된 형식으로 try-catch구문을 많이 사용함.
					try {
						System.out.println("[메시지 수신 오류] "
								+ socket.getRemoteSocketAddress() // 메시지를 보낸 클라이언트를 주소 출력
								+ ": " + Thread.currentThread().getName()); // 해당 Thread의 고유 이름도 출력.
					} catch (Exception e2) {
					}
				}
			}
		};
		// Thread를 안정적으로 관리하기 위해서 Thread를 ThreadPool에 등록해준다.
		ChatServer.threadPool.submit(thread) ;
	}
	
	
	// 클라이언트에게 메시지를 전송하는 메소드.
	public void send(String message) {
		Runnable thread = new Runnable() {
			
			@Override
			public void run() {
				try {
					// 메시지를 보낼 때는 OutputStream 이용
					OutputStream out = socket.getOutputStream();
					byte[] buffer = message.getBytes("UTF-8");
					
					// 오류가 발생하지 않았을 때는..
					// 버퍼에 담긴 내용을 서버에서 클라이언트로 전송해주겠다는 것.
					out.write(buffer);
					// 반드시 flush를 해줘야 여기까지 전송을 해줬다는 것을 알려줄 수 있음.
					out.flush();
				} catch (Exception e) {
					try {
						System.out.println("[메시지 송신 오류] "
								+ socket.getRemoteSocketAddress()
								+ ": " + Thread.currentThread().getName());
						
	
						ChatServer.clients.remove(ChatHandler.this);
						socket.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				};
			}
		};
		ChatServer.threadPool.submit(thread);
	}
	
	
}