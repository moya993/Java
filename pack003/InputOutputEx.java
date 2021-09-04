package pack003;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.*;

// 파일 입출력
// 파일 깨질때는 인코딩에서 UTP-8이나 ANSII로 선택해서 저장하셈




/*
// 파일 입출력 프로그램 - 파일 read

public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Reader r = new FileReader("test02.txt");	//  파일을 만듬
			
			
			while(true) {
				int data = r.read();
					if(data == -1) {	// 음수값이 리턴되면 파일을 다 읽었다는 뜻임
						break;
					}
					System.out.println((char)data);
			}
//				System.out.println((char)data);
		
			r.close();			// 열었으니 닫아야죠?
			
			
			System.out.println("파일 입출력 종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(1000);
	}

}
*/

















/*
// 파일 입출력 프로그램 - 파일 write
public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	//  파일을 만듬
			
			for (int i = 0; i < 8; i++) {			// 세로 8
				for (int j = 0; j < 10; j++) {		// 가로 10
					w.write((i+j) % 2 == 0 ? "o ":"x ");		// 삼항연산자 연습좀 하셈 제발
				}w.write("\n");
			}
			
			
			
			w.close();			// 열었으니 닫아야죠?
			System.out.println("파일 입출력 종료");
			
		} catch (Exception e) {

		}
	}

}
*/















/*
// 파일 입출력
// 파일을 열었으면 닫아야함
class Lion{
	
}

public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	//  파일을 만듬
			
			w.write("apple");	// 출력 내용 집어넣기
			w.write("\n\n");
			w.write("무궁화");
			
			w.close();			// 열었으니 닫아야죠?
			System.out.println("파일 입출력 종료");
			
		} catch (Exception e) {

		}
	}

}
*/










/*
// 이중 for문
public class InputOutputEx {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {		// 세로
			for (int j = 0; j < 6; j++) {	// 가로
				if((i+j)%2==0) {
					System.out.print("o ");
				}else {
					System.out.print("x ");
				}
			}System.out.println();
		}System.out.println();
	}

}
*/