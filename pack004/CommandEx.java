package pack004;

import java.util.*;


// �ٸ� Ŀ�ǵ��




/*
// 1. final
// �ַ� PI�� 1���� 12���� ���� ���� ������ �ִ� �� �� �� ���

final class Animal{		// final�� ���� Ŭ������ ��ӵ� �Ұ���
	final int num = 10;	// final�� ���� ������ �� ������ ����, �� ������ ���ϴ� �� ������ ��
	
	Animal(){}
	
	final void m1() {	// �Լ� �տ� final�� ������ �������̵� �Ұ�
		
	}
}

//class Tiger extends Animal{
//	void m1() {
//		
//	}
//}


public class CommandEx {

	public static void main(String[] args) {
		Animal t1 = new Animal();
//		t1.num = 20;	������ final�� ���ȭ ���Ѽ� �� ���� ����
		System.out.println(Math.PI);
		
		String s1 = null;	
	}

}
*/






/*
// 2. this
class Tiger{
//	Tiger this;	// ���� ����� �˾Ƽ� �������
//	
//	Tiger(Tiger t, int a, int b){	// Tiger t �� �����Ǿ�����
//		this = t;
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode());
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
	
}

public class CommandEx 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10,20);
		System.out.println(t1.hashCode());
		System.out.println();
		Tiger t2 = new Tiger(30, 40);
		System.out.println(t2.hashCode());
	}
}
*/


// 2-1. this�� ù ��° ���











