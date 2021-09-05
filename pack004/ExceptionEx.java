package pack004;



// Exception(����ó��), try-catch���̶� ���� ���
// Exception�� ������ �߻��ߴٴ� �� ���α׷��� �˸��� ����
// �� �� try-catch������ ������ ����Ұ��� ������ �˷�����
// ���α׷��� �ߴܽ�Ű�°� ������ �ƴ�


/*
// 1)	Exception 3���� ����
public class ExceptionEx {

	public static void main(String[] args) {
		// 1��° Exception
		System.out.println(1);
		try {
			int a = 10/0;
		} catch (Exception e) {
			e.printStackTrace();	// ������ �߻� �ٿ����� ã�� �ܰ躰�� ������ �����
		}
		System.out.println(2);
		
		System.out.println("------------");
		
		// 2��° Exception
		// ArrayIndex(OutofBounds)Exception - ������ �Ѿ��� ���
		// try-catch���� ����ϸ� ��� ���α׷��� �ߴܵ����� ����
		int[]ar = {1,2,3};
		try {
			ar[3] = 10;
		} catch (Exception e) {
			e.toString();	// ������ Exception ����� ���� ���
		}
		System.out.println(3);
		
		System.out.println("------------");
		
		// 3��° Exception
		// (NullPointer)Exception
		String s = "����ȭ�����Ǿ����ϴ�.";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());	// s�� null���� �� �־� ���� ������
		} catch (Exception e) {		// Exception�� �Ⱦ��� ������ ���� ������ ����� �ȵ�
			// TODO: handle exception
		}
		System.out.println(4);
		
	}

}
*/



/*
// Exception, try-catch���� ����ϴ� ����
// throw�� try-catch���� �� ����
class Tiger{
	// 1��. try-catch��
	void m1() {
		System.out.println(1);
	
	try {
		throw new Exception();	// �Ϻη� Exception�� �߻���Ű�� �ڵ�
	} catch (Exception e) {		// throw���� �ݵ�� try-catch���� �Բ� �����
		System.out.println("Exception�� �߻���");
	}
	
}
	// 2��. try-catch�� ���� Exception ������ ���ִ� ���
	// �Լ� �̸� �ڿ� throws Exception ������ ����
	// �� ����� �� �Լ��� ����ϴ� ����� �˾Ƽ� try-catch���� ����� Ȯ���϶�� ��
	// ���ܶ��ѱ��, å������
	void m2() throws Exception{
		System.out.println(2);
		throw new Exception();
	}
}

public class ExceptionEx 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		
		// 1��
		t1.m1();
		
		// 2��
		try {
			t1.m2();
		} catch (Exception e) {
			System.out.println("2���� Excpetion�ߵ�");
		}
		System.out.println(3);
		
		// Thread
		// unhandle Exception ������ ��ٸ� try-catch������ �׷� ��
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try { Thread.sleep(2000); } catch (Exception e) {}
		}
		
		
	}
}
*/


/*
// try-catch�� finally�� ����ϴ� ����
class Tiger{
	void m1(int a, int b) {
		if(a>b) {
			System.out.println(1);
		}else {
			return;
		}
		System.out.println(2);
	}
	
	void m2(int a, int b) {
		if(a>b) {
			System.out.println(1);
		}else {
			return;
		}
		System.out.println(2);
		try {
			if(a>b) {
				System.out.println(1);
			} else {
				return;
			}
			System.out.println(2);			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println(2);
			
}
	}
}


public class ExceptionEx {
	public static void main(String[] args) {
		
		try {
			int a = 10 / 1;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {	// finally : try������ ������ ������ ����ǰ� �ϴ� �ڵ�
			System.out.println(2);
		}
		
		System.out.println("------------");
		
		
		Tiger t1 = new Tiger();
		t1.m1(3, 4);
		t1.m1(6, 1);
	}

}
*/














