package pack003;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.*;

// ���� �����
// ���� �������� ���ڵ����� UTP-8�̳� ANSII�� �����ؼ� �����ϼ�




/*
// ���� ����� ���α׷� - ���� read

public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Reader r = new FileReader("test02.txt");	//  ������ ����
			
			
			while(true) {
				int data = r.read();
					if(data == -1) {	// �������� ���ϵǸ� ������ �� �о��ٴ� ����
						break;
					}
					System.out.println((char)data);
			}
//				System.out.println((char)data);
		
			r.close();			// �������� �ݾƾ���?
			
			
			System.out.println("���� ����� ����");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(1000);
	}

}
*/

















/*
// ���� ����� ���α׷� - ���� write
public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	//  ������ ����
			
			for (int i = 0; i < 8; i++) {			// ���� 8
				for (int j = 0; j < 10; j++) {		// ���� 10
					w.write((i+j) % 2 == 0 ? "o ":"x ");		// ���׿����� ������ �ϼ� ����
				}w.write("\n");
			}
			
			
			
			w.close();			// �������� �ݾƾ���?
			System.out.println("���� ����� ����");
			
		} catch (Exception e) {

		}
	}

}
*/















/*
// ���� �����
// ������ �������� �ݾƾ���
class Lion{
	
}

public class InputOutputEx {

	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("test01.txt");	//  ������ ����
			
			w.write("apple");	// ��� ���� ����ֱ�
			w.write("\n\n");
			w.write("����ȭ");
			
			w.close();			// �������� �ݾƾ���?
			System.out.println("���� ����� ����");
			
		} catch (Exception e) {

		}
	}

}
*/










/*
// ���� for��
public class InputOutputEx {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {		// ����
			for (int j = 0; j < 6; j++) {	// ����
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