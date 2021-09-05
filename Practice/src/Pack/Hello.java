package Pack;

import java.util.*;










//ex46-1)		 Exception(����ó��), try-catch���� ����ϴ� ����
// throw�� try-catch���� �ѽ���
class Tiger{
	
	// 1��
	//try-catch��
	void m1() {
		System.out.println(1);
		
		try {
			throw new Exception();	// �Ϻη� Exception�� �߻���Ű�� �ڵ�
		} catch (Exception e) {		// throw���� �ݵ�� try-catch���� �Բ� �����
			System.out.println("Exception�� �߻���");
		}
	}

	// 2��
	// try catch�� ���� Exception ������ ���ִ� ���
	// �Լ� �̸� �ڿ� throws Exception�� �־���
	// �� ����� �� �Լ��� ����ϴ� ����� �˾Ƽ� try-catch���� ����� Ȯ���϶�� ��
	// ���ܶ��ѱ��, å������
	void m2() throws Exception{
		System.out.println(2);
		
		throw new Exception();
	}
	
}

public class Hello 
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
			
		}
		System.out.println(3);
		
		// Thread
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try { Thread.sleep(2000); } catch (Exception e) {}		// unhandle Exception ������ ��ٸ� try-catch������ �׷� ��
		}
		
	}

}






/*
//ex46)		Exception(����ó��), try-catch���̶� ���� ��
// Exception�� ������ �߻��ߴٴ°� ���α׷��� �˸��� ����
// �� �� try-catch������ ������ ����Ұ��� �ߴ��Ұ��� �����ؾ���
// ���α׷��� �ߴܽ�Ű�°� ������ �ƴ�
public class Hello 
{
	public static void main(String[] args) 
	{	
		// 1��° Exception
		System.out.println(1);
		try {
//			int a = 10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		
		System.out.println("------------");
		
		// 2��° Exception
		// ArrayIndex(OutOfBounds)Exception - ������ �Ѿ��� ���
		// try-catch���� ����ϸ� ��� ���α׷��� �ߴܵ����� ����
		int[]ar = {1,2,3};
		try {
			ar[3] = 10;
		} catch (Exception e) {
			
		}
		System.out.println(3);
		
		System.out.println("------------");
		
		// 3��° Exception
		// (NullPointer)Exception
		String s = "����ȭ�����Ǿ����ϴ�";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());		// ��ü�� �ƴ� null�� ���̸� ����Ϸ���
		} catch (Exception e) {		//Exception�� �Ⱦ��� ������ ���� �����Ű� ����� �ȵ�
			// TODO: handle exception
		}
		System.out.println(4);
		
		
	}

}
*/












/*
//ex45-5)	�������̽� ����
// ���� �� ������� �������̽�
class Baduk{
	
	Ai ai;
	
	Baduk(){
		System.out.println("�뱹�� �����մϴ�.");
	}
	Baduk(Ai ai){
		this.ai = ai;
	}
	void play() {
		ai.play();
	}
	void stop() {
		ai.stop();
	}
	
}

interface Ai{
	void play();
	void stop();
}


class Alphago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�ΰ������� ���İ� �Դϴ�.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("���İ� ���� ����� �Ѵ�.");
	}
}


class Betago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("�ΰ������� ��Ÿ�� �Դϴ�.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("��Ÿ�� ���� ����� �Ѵ�.");
	}
}




public class Hello 
{
	public static void main(String[] args) 
	{	
		
		Baduk baduk0 = new Baduk();
		Baduk baduk1 = new Baduk(new Alphago());
		Baduk baduk2 = new Baduk(new Betago());
		
		baduk1.play();
		baduk1.stop();
		baduk2.play();
		baduk2.stop();
		
	}

}
*/







/*
//ex44-2)	�ؿ��� �Ȱ��� �ڵ����� ���ֻ���ϴ� �ڵ�

// 1.
interface Animal{
	void m1();	
}

// 2.
class Zoo{
	void sound(Animal t) {
		t.m1();
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		// 1.
		// �μ����� �뵵�� ���� ���
		Animal t1 = new Animal() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(1);
			}
		};
		t1.m1();
		
		// 2.
		Zoo t2 = new Zoo();
		t2.sound(new Animal(){
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(1);
			}
		});
		
		
		
	}

}
*/







/*
//ex44-1)	�������̽� ����
class Zoo{
	void m1(Animal t) {
		t.m1();
	}
}

interface Animal{
	void m1();
}

class Tiger implements Animal{
	public void m1() {
		System.out.println(1);
	}
	
	public void m2() {
		System.out.println(2);
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		Animal t2 = new Tiger();
		
		// �͸�Ŭ������ �͸�ü �� �� ���� ���
		// 1. �͸� Ŭ����
		Animal t3 = new Animal() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		};	//ó������ �ȵǴ� �ڵ����� new Animal(); ���� ; �տ� �߰�ȣ ����� Ctrl + space�ؼ� �������̵� �ϱ�
		
		
		// 2. �͸� ��ü : ��ü�� ���� ģ���� ���
		new Animal() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(3);
			}
		}.m1();;	
		
		t1.m1();
		t2.m1();
		t3.m1();
		
		//�Լ��μ��� ��ü�� �̿��Ͽ� �ڵ带 �����Ѵ�.
		Zoo t4 = new Zoo();
		t4.m1(new Animal() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(4);
			}
		});
		
		
		
		
	}

}
*/







/*
//ex43-5)	this�� �� ��° ���
// ������ �ȿ��� �ʿ信 ���� �ٸ� �����ڸ� ȣ��
// super();�� �θ� ȣ��, this();�� �ڱ� Ŭ������ �ٸ� �����ڸ� ȣ��
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		// �ؿ� this�� �μ��� �����ʴ� ���� �����ڸ� ȣ����
		this();
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		// �ؿ� this�� �μ��� �ϳ��� �޴� ���� �����ڸ� ȣ����
		this(a+b);
		System.out.println(a+" "+b);
	}
	
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(1, 2);
		
	}

}
*/








/*
// ex43-4)	this�� �� ��° ���
// ���α׷����� ���� ��Ÿ�� 
// �ڱ� �ڽ��� �ٸ�Ŭ������ �μ� ������ �ϱ� ���� ���
// ������ �� �ڽ��� �ʿ�� �� ��, �ʿ��Է� �� �ڽ��� ����
class Tiger{
	void m1() {
		Lion t1 = new Lion();
		
		if(t1.merry(this) == true) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�Ф�");
		}
	}
	
	int m2() {
		return 100;
	}
	
	String m3() {
		return "����";
	}
	
	
}



class Lion{
	boolean merry(Tiger t) {
		if(t.m2() >= 80) {
			System.out.println("yes");
			return true;
		}else {
			String s = t.m3();
			
			switch(s) {
			case "�¼�":{
				return true;
			}
			
			case "����":{
				return false;
			}
			default:
				return false;
			}
		}
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		t1.m1();
		
	}

}
*/








/*
// ex43-3)	this�� �� ��° ���
// �Լ��ȿ��� ü�̴��ؼ� ȣ���ϱ� ����
// ���ֻ��
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger m1() {
		return this;
	}
	
	Tiger m2() {
		System.out.println(2);
		return this;
	}
	
	void m3() {
		System.out.println(3);
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		Tiger t2 = t1.m1();		

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		System.out.println("-------------");
		
		t2.m2().m1().m2().m2().m3();;
		t1.m1().m2();
		
		System.out.println("-------------");
		
		t1.m1().m2().m3();
		System.out.println("-------------");
		t1.m1();
		t1.m2();
		t1.m3();
		
		
	}

}
*/





















/*
// ex43-2)	this�� ù ��° ���
class Tiger{
//	Tiger this;			// �ڵ� ������
//	Tiger(Tiger t){		// Tiger t �ڵ�� �����Ǿ� ����
//		this = t;		// �ڵ� ������
//	}
	
	int a,b,size;	// �ʵ庯�� ����, �ؿ� ������ ���� ��������ʹ� ������
	
	Tiger(int a, int b, int size){	// �����ڸ� ����� ������ ��������� �ʱ�ȭ ��Ű�� ������, �ٸ� ����x
		this.a = a;
		this.b = b;
		this.size = size;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.size);
		System.out.println("--------");
		System.out.println(a);
		System.out.println(b);
		System.out.println(size);
	}

	void show() {
		System.out.println(a+" "+b+" "+size);	// �� ���� �տ� this.�� �����Ǿ� ����
	}
	

}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10, 20, 30);
		t1.show();
		
	}

}

*/






/*
// ex43-1)	this
class Tiger{
//	���� this��� ������ ������
//	Tiger this; 	���� ���� �ʾƵ� �˾Ƽ� �������	
//	Tiger(Tiger t, int a, int b) {		Tiger t�� �����Ǿ� ����
//		this = t;		�ڵ尡 �����Ǿ� ����
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode());
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10, 20);
		System.out.println(t1.hashCode());
		
		System.out.println("-------------");
		
		Tiger t2 = new Tiger(30, 40);
		System.out.println(t2.hashCode());
		
	}

}
*/













/*
// ex42)	 final
final class Animal{
	final int NUM = 10;		// final�� �����Ŵ� ���� ������ �� ����, ���� ������ �� ���°� ������ ��
	
	Animal(){}
	
	final void M1() {	// �Լ� �տ� final�� ������ �� �ڵ� ���ķκ��� �������̵��� �ȵ�
		
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
//		t1.NUM = 20;	������ final�� ������ �����Ͽ��� ������ �� �̻� �� ���� �Ұ���
		
		String s1 = null;	// StringŬ������ ��ӹ��� �� ����.
		
	}

}
*/




/*

// ex41)	�������̽� ����2
class A{
	void m1() {
		System.out.println(1);
	}
}


interface B{
	void m2();		// �Լ����� ^ �Լ�������Ÿ���̶�� ��
}


interface C{
	void m3();
}


class D extends A implements B,C{
	@Override
	public void m2() {
		System.out.println(2);
		
	}
	@Override
	public void m3() {
		System.out.println(3);
	}
}


@FunctionalInterface		// �Լ������� 1���� ������ ������ ��
interface E{
	void m1();
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		D t = new D();
		t.m1();
		t.m2();
		t.m3();
		Thread t2 = null;	// t2�� ��ü�� �ƴϴ�.
		String s = null;	
		StringBuffer sf = null;
		
		
	}

}
*/











/*
// ex40)	�������̽� ����
interface �ѱ�����{
	void �Ա�();
	void ���();
	void ��ü();
	void ����();
}



class ��������  implements �ѱ�����{
	@Override
	public void �Ա�() {
		System.out.println("�������� 3%�Դϴ�.");
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
		System.out.println("�������� 10% �Դϴ�.");
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


public class Hello 
{
	public static void main(String[] args) 
	{	
		�������� t1 = new ��������();
		�츮���� t2 = new �츮����();
		
		t1.�Ա�();
		t2.�Ա�();
		
	}

}
*/








/* 
// ex39)	abstract �������̵�
abstract class �������� {		// �Լ��տ� abstract�� ������ class �տ��� ������ abstract�� �پ�� ��
	void Į() {
		System.out.println("Į�� �� �����.");
	}
	abstract void ����();
}


class ���׳�1 extends ��������{
	void ����() {
		System.out.println("+5�� ����");
	}
}

class ���׳�2 extends ��������{		// �������̵� : �θ� ������ �Լ� �̸��� �ڽ��� ������ �Լ� �̸��� �Ȱ��� ����
	@Override
	void ����() {
		System.out.println("+10�� ����");
			
	}
}

public class Hello 
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








/*
// ex38)	abstract(�߻����) = �̿ϼ� & �������̽�

//abstract class Animal{		// �̿ϼ��� Ŭ����
//	abstract void m1() {}	// abstract �̿ϼ��� �Լ�
//}

interface Animal{	// �������̽�
	void m1();	// ������ �տ� abstract�� ����, �������̽��� ����� �ݵ�� �տ� abstract�� ����
}

class Tiger implements Animal{
	public void m1() {		// �θ�Ŭ������ abstract�̱� ������ �ݵ�� �Լ� ������ ����� ��
		System.out.println(2);
	}
}



public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal a = new Tiger();
		a.m1();
		
//		Animal t2 = new Animal();	Abstract�� �� Ŭ�����δ� ��ü���� �Ұ�
		
	}

}
*/




/*
// ex37)	�迭
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 10;
		
		// �迭 ����
		int[] ar = new int[5];	// �迭�� ÷�� "0 ~ �迭�Ǳ���-1" ���� ��밡��
		int[] br = new int[] {1,2,3,4,5};
		int[] cr = {10,20,30,40,50}; 	// ���� ���� ���, ������ �������x
		
		// �迭�� ���� ���
		System.out.println(ar.length);	
		
		System.out.println("-----------------");
		
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------");
		
		
		// ����ȭ ���� foreach ++ ������ �κ�
		// foreach ���� �����δ� x, data, value�� �ַ� ��
		for (int x : cr) {
			System.out.println(x+" ");
		}
		
		cr[0] = 100;
		cr[4] = 200;
		
//		cr[5] = 300;	��ȿ������ ����� ��� �Ұ� ,[5]�̻��� ���Ұ� 
//		cr[-1] = 100;
		
		
		int num = 3;
		ar[num] = 500;
		
//		ar[num*3-5]=0;	�����ؼ� ��밡��! ������ ��ȿ������ ����ߵ�
		
		ar[2] = 3;
		ar[ar[2]] = 999;	// ar[2]
		
		System.out.println(ar[2]+" "+ar[3]);
		ar[ar[3]-998] = 888;
		
		System.out.println("------------------");
		
		for (int x : ar) {
			System.out.println(x+"");
		}
		System.out.println();
		
		System.out.println("-----------------");
		
		boolean[] dr = {true, true, false, true};
		
		for (boolean b : dr) {
			System.out.println(b+" ");
		}
		System.out.println();
		
		System.out.println("------------------");
		
		
		String[] ss = new String[4];
		ss[0] = "ȣ����";
		ss[1] = "�޹���";
		ss[2] = "�ϸ�";
		ss[3] = "�䳢";
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]+" ");
		} 
		System.out.println("-----------------");
		

		String[] st = new String[] {"�عٶ��", "���޷�", "�ε鷹"};
		
		String s1 = "ȣ����";		// ������
		String s2 = new String("������");		// �������
		String [] su = new String[] {new String("�عٶ��"), new String("�ܴ���"), new String("�ε鷹")};
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]+" ");
	
		}System.out.println();
		
		
	}

}
*/
















/*
// ex36)	���� �߻� �ڵ�
public class Hello 
{
	public static void main(String[] args) 
	{	
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println("-------------------");
		
		for (int num = 0; num < rn.nextInt(2); num++) {
//			System.out.println(num);
			System.out.println(rn.nextInt(10));
		}
		
		
		
		
	}

}

*/







/*
// ex35)	��ĳ������ ����ϴ� ����, ������
class Animal{
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal{
void cry() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}

class Sneak extends Animal{
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Random rn = new Random();
		
		//////////////////////////
		
		Animal t0 = new Dog();
		Animal t1 = new Cat();
		Animal t2 = new Sneak();
		
		for (int i = 0; i < 10; i++) {
			int num = rn.nextInt(3);
			switch (num) {
			case 0:
				t0.cry();
				break;
			case 1:
				t1.cry();
				break;
			case 2:
				t2.cry();
				break;

			}
		
		}
		
		System.out.println("--------------------");
		
		// ��ĳ������ ����ϰ� �ȴٸ� 
		// �� switch���̶� �Ȱ��� ����� ��Ÿ��
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};	// �ڿ��� �����Ͱ� �ʱ�ȭ ��
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();
		}
		
		
		
	}

}
*/









/*
// ex34)	��ĳ���� ����
class Animal{
	void cry() {
		System.out.println("...");
	}
	
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
	}
	
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿�");
	}
}

class Sneak extends Animal{
	
}


class Zoo{
//	void sound(Dog t) {
//		t.cry();
//	}
//	
//	void sound(Cat t) {		// �����ε�
//		t.cry();
//	}
//	
//	void sound(Sneak t) {	// �����ε�
//		t.cry();
//	}
	
	void sound(Animal t) {		// ��ĳ������ ���� ������ �Լ��� ��� �߰� ���ϰ� Animal �μ��� �����鼭 �ѹ��� �߰��� �����ϱ� ����
		t.cry();
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Sneak();
		
		t1.cry();
		t2.cry();
		t3.cry();
		
		System.out.println("----------------");
		
		Dog t4 = new Dog();
		Cat t5 = new Cat();
		Sneak t6 = new Sneak();
		
		t4.cry();
		t5.cry();
		t6.cry();
		
		System.out.println("----------------");
		
		
		Zoo t7 = new Zoo();
		
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Sneak());
	
	}

}
*/









/*
// ex33)	��ĳ���� & �ٿ�ĳ����
class Animal{
	void m1() {
		System.out.println(1);
	}
	void m3() {
		System.out.println(31);
	}
}

class Tiger extends Animal{
	void m2() {
		System.out.println(2);
	}
	void m3() {
		System.out.println(32);
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Tiger t2 = new Tiger();
		Animal t3 = new Tiger();	// (��ĳ����) == (��-�� ����)
//		Tiger t4 = new Animal();	// �ٿ�ĳ����
		
		t1.m1();
		t1.m3();
		System.out.println("---------");
		t2.m1();
		t2.m2();
		t2.m3();
		System.out.println("---------");
		
		t3.m1();
//		t3.m2();	// m2 �޸𸮴� ���������� m2������ ������ ����
		t3.m3();	// �Լ��� ȣ���ϱ� ���� ������ �ڽĸ��� ���� �ڽ��� �Լ��� ������ ������ �ڽ�ȣ��, ������ �θ�ȣ��
		
		
	}

}
*/







/*
// ex32)	��ӿ����� ������
class Animal{
	Animal(){
		System.out.println("�θ������ ��");
	}
	Animal(int n){		// Animal������ �����ε�
		System.out.println("�θ������ �� "+n);
	}
	
}



class Tiger extends Animal{
	Tiger(){
		// ���� ���ο��� super();�ڵ尡 �����Ǿ� ����
		super();	// �θ��� �����ڸ� call, super();�� ������ �ȿ����� ��� ����
		System.out.println("ù ��° �ڽĻ�����");
	}
	Tiger(int num){
		super(num + 100);	// super�� �ݵ�� ù �ٿ� �;���
		System.out.println("2��° �ڽ� ������");
	}
	Tiger(int a, int b){
		super(a*b);
		System.out.println("3��° �ڽ� ������");
	}
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Animal t2= new Animal(5);
		
		Tiger t3 = new Tiger();
		System.out.println("----");
		Tiger t4 = new Tiger(50);
		System.out.println("----");
		Tiger t5 = new Tiger(5,3);
		
		
	}

}

*/















/*
// ex31)	���
class Animal{	// �θ�Ŭ������ Animal�� ����
	void m2() {
		System.out.println("Animal�� m2 ȣ��");
	}
	void m3() {
		System.out.println("Animal�� m3 ȣ��");
	}
	
}

class Tiger extends Animal{		// �ڽ�Ŭ������ Tiger�� ����
	void m1() {
		System.out.println("Tiger�� m1 ȣ��");
	}
	void m3() {
		System.out.println("Tiger�� m3 ȣ��");
	}
	void m4() {
		m3();	// Tiger�� ������ �ִ� m3�� ���
		// super�� �θ� Ŭ������ Ŭ������ �Լ��� ȣ���� �� ���, super()�� �ٸ�
		super.m3();		// �θ��Լ��� m3�� ȣ��, ���������� ��ȸ�ؼ� �θ� ȣ��
		System.out.println("Tiger�� m4 ȣ��");
	}
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Tiger t2 = new Tiger();
		
		t1.m2();
		t1.m3();
		
		t2.m1();
		t2.m2();	// ��ӹ޾ұ� ������ �θ��� m2�� ��� �θ��� m2�� ȣ���� �� ����
		t2.m3();	// ���� �Լ��� ������ ������ �ڱ� Ŭ������ �Լ��� ���� ȣ��
		
		System.out.println("------------------------");
		
		t2.m4();
		
	}

}

*/









/*
// ex30)	�����Լ�
public class Hello 
{
	public static void main(String[] args) 
	{	
		
		
	}

}
*/












/*
// ex29)	static ����1

// static �Լ� �ȿ����� static ����� ��� ����

class Tiger{
	static void myMain() {
		Tiger t = new Tiger();	// �ڱ� �Լ� �ȿ��� �ڽſ� ���� ��ü ���� ����
		t.m1();
	}
	
	void m1() {
		
	}
}


public class Hello 
{
	static int num = 10;
	
	Hello(){}
	
	static void m1() {
		System.out.println("1�� ��");
	}
	
	public static void main(String[] args) 	// void���� static�� ������ ��ü ������ ���� �ʴ� �̻� ȣ�� �Ұ�
	{	
		System.out.println(num);
		
		Hello h = new Hello();
		
		h.m1();
		h.m2();
		Hello.m1();
	}

	
	void m2() {
		System.out.println("2�� ��");
	}
	
	
}
*/











/*
// ex28)	static

// 1. static�� ��ü�� ������ �� cost ���� ���̱� ���� ���

class Tiger{
	int num1;
	static int num2 = 100;	// static�� ������ class ���ٵ� �� ���� �ö�(����ž ���)
	
	static void m1() {
		System.out.println("static �Լ� ��");
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println(Tiger.num2);		// static�� ������ Ŭ���� �ȿ� �ִ� ������ ������ �ٷ� ȣ�� �Ұ���
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.num1);
		System.out.println(t1.num2);
		
		t2.num2 = 200;
		System.out.println(t1.num2);
		
		System.out.println(Tiger.num2);		// ���� static�� ���� ��Ģ

		Tiger.m1();
		
		
		// static ����
		System.out.println(Math.abs(10));
	}

}
*/









/*
// ex27)	������ ����2
class Car{
	int fuel = 100;
	String name;
	
	Car(){
		name = "����";
	}
	
	Car(String n, int f){
		name = n;
		fuel = f;
	}
	
	void inject() {
		fuel += 100;
		System.out.println(fuel);
	}
	
	void inject(int f) {
		fuel = fuel + f;
		System.out.println(name+" ���� ����� "+fuel);
	}
	
	void move() {
		System.out.println(name+" ���� �����δ�.");
	}
	
	void stop() {
		fuel -= 10;
		System.out.println(name+" ���� �����.");
	}
	
	void show() {
		System.out.println(fuel);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Car car1 = new Car();
		Car car2 = new Car("����",200);
		
		car1.move();
		car1.show();
		car1.inject(10);
		car1.inject();
		car2.move();
		car2.show();
		
		
		
	}

}
*/














/*
// ex26)	������ ����
class Tiger{	// class�ȿ� �ƹ��͵� ������ �˾Ƽ� default �����ڸ� ����
	Tiger(int a, int b){
		
	}
	
	Tiger(){}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(20, 30);
		Tiger t2 = new Tiger();
		
	}

}
*/









/*
// ex25)	������

// 1. �����ڴ� �Լ��̴�. ������ (������ �Լ�)��� ��
// 2. �����ڴ� �ݵ�� Ŭ���� �̸��� �����ؾ� ��
// 3. ������ �Լ��� ���ϰ��� ���� �� ����. ������ void�� ���� �ʴ´�.
// 4. ������ �Լ��� �����ε��� �����ϴ�.
// 5. ��ü�� ������ �� �� �ѹ��� ȣ���(���Ƿ� ȣ�� �Ұ���)
// 6. �����ڸ� ����ϴ� ������ ��� �޼ҵ带 �ʱ�ȭ ��Ű�� �������� ���
// 7. ������ �Լ��� �ۼ����� �����ÿ��� �ڵ����� default �����ڰ� �������

class Tiger{
	int age = 20;
	String name = "ȫ�浿";
	
	// 1�� ������
	Tiger(){
		System.out.println("������ ��");
		System.out.println("�����ڰ� ȣ��Ǿ���. ");
		// age = 20;
		// name = "ȫ�浿";
		
	}
	
	// 2�� ������. �Ű������� �������� string������ ����
	Tiger(int a, String n){
		age = a;
		name = n;
	}
	
	void showInfo() {
		System.out.println(age+" "+name);
	}
	 
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		// 1�� ������ ȣ��
		Tiger t1 = new Tiger();
		// 1-1. ��ü�� �����Ǽ� �� �ٽ� Tiger�����ڸ� ȣ����
		Tiger t2 = new Tiger();
		
		System.out.println("----------------");
		
		// 2�� ������ ȣ��
		Tiger t3 = new Tiger(10, "������");
		t2.showInfo();	// �ڽĿ��� ������ ����, �θ��� ������ ������
		t3.showInfo();
		
	}

}
*/




/*
// ex23)
class Tiger{
	// �Լ� �����ε�, �Լ� �����Ƕ�� �Ҹ�
	// ���޵Ǵ� �Լ��� ������ �ٸ�����, Ÿ���� �ٸ� �� �Լ� �̸��� �ٸ��� ��� ����	
	void method01() {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(1);
	}	
	
	void method01(int a) {		// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(2);
	}
	
	void method01(int a, int b) {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(3);
	}
	
	void method01(String a, int b) {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(4);
	}
	
	
	// �Լ� �̸��� �Ȱ��� �����ȴٸ� �����ε�, ������
	int getAreaRect(int w, int h) {
		return w*h;
	}
	
	int getAreaRect(int length) {
		return length*length;
	}
	
	
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		t1.method01();
		t1.method01(10);
		t1.method01(1, 1);
		t1.method01("ȣ����", 1);
	}
}

*/