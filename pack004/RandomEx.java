package pack004;

import java.util.Random;



// ���� �߻� �ڵ�
public class RandomEx {

	public static void main(String[] args) {
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		System.out.println();
		
		for (int num = 0; num < rn.nextInt(2); num++) {
			System.out.println(rn.nextInt(10));
		}
	}

}
