package pack004;



// �߻�
/*
// abstract and �������̵�
abstract class �������� {	// �Լ� �տ� abstract�� ������ class�տ��� abstract�� �پ�� ��
	void Į() {
		System.out.println("Į�� �� ����ϴ�.");
	}
	abstract void ����() {
		
	}
}

class ���׳�1 extends �������� {
	@Override
	void ����() {
		System.out.println("+5�� ����");
	}
}

class ���׳�2 extends �������� {
	@Override
	void ����() {
		System.out.println("���׳�2�� ���и� �����.");
	}
}

public class AbstractEx 
{
	public static void main(String[] args) 
	{
		���׳�1 t1 = new ���׳�1();
		���׳�2 t2 = new ���׳�2();
		t1.Į();
		t1.����();
		t2.Į();
		t2.����();
	}
}
*/






//�߻� �޼��� and �������̽�
//�������̽��� ���� ���� ����� ����, ������ �߻� Ŭ������ �ǹ�
//�������̽�(interface)�� ������ �߻� �޼ҵ�� ������� ����
/*
//abstract class Animal{
//	abstract void m1(); {
//	}
//}

interface Animal{	// �������̽� ����
	abstract void m1();
	// �� void m1()�տ��� ���� abstract�� ����, �������̽� ����� �Լ��տ� ������ ����
	
}

class Tiger implements Animal{
	@Override	
	public void m1() {	// �θ�Ŭ������ abstract�̱� ������ �ݵ�� �Լ� ������ ���־�� ��
		System.out.println(2);
	}
}



public class AbstractEx {

	public static void main(String[] args) {
		Animal a = new Tiger();
		a.m1();
		// abstract�� �� Ŭ�����δ� ��ü���� �Ұ�
		
		
	}
}
*/