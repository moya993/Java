package pack004;




/*
// �������̽�
class A {
	void m1() {
		System.out.println(1);
	}
}

interface B {
	void m2();		// �Լ����� or �Լ� ������Ÿ���̶���
}

interface C{
	void m3();
}

class D extends A implements B,C{
	@Override
	public void m2() {
		System.out.println("B�� ��ӹ޾����� ���⼭ �ٽ� �Լ� ���� �ؾ���");
	}
	@Override
	public void m3() {
		System.out.println("C�� ��ӹ޾����� ���⼭ �ٽ� �Լ� ���� �ؾ���");		
	}
}

@FunctionalInterface	// �Լ� ������ 1���� ������ ����
interface E{
	void m1();
}

public class InterfaceEx 
{
	public static void main(String[] args) 
	{	
		D t = new D();
		t.m1();
		t.m2();
		t.m3();
		Thread t2 = null;	// t2�� ��ü�� �ƴ϶�� ��
		String s = null;
		StringBuffer sf = null;
	}
}
*/














/*
// solid ��Ģ ���캸��
// �������̽� ����
interface �ѱ����� {
	void �Ա�();
	void ���();
	void ��ü();
	void ����();	
}

class �������� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 3�� �Դϴ�.");
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}

class �츮���� implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 10�� �Դϴ�.");
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ��ü() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		
	}
}


public class InterfaceEx {

	public static void main(String[] args) {
		�������� t1 = new ��������();
		
		t1.�Ա�();
	}

}
*/





