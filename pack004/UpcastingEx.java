package pack004;

import java.util.Random;


/*
// ��ĳ���� ����
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

class Zoo {
	void sound(Dog t) {
		t.cry();
	}
	void sound(Cat t) {
		t.cry();
	}
	void sound(Sneak t) {
		t.cry();
	}
}


public class UpcastingEx {

	public static void main(String[] args) {
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Sneak();
		
		t1.cry();
		t2.cry();
		t3.cry();	// �ڽ� Ŭ������ cry�Լ��� ���� ������ �θ��� �Լ��� ȣ����
		
		System.out.println();
		
		Zoo t7 = new Zoo();
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Sneak());
		
	}

}
*/
///////////////////////////////////////////////


/*
// ��ĳ������ ����ϴ� ����, ������
// Animal���� cry�� ���Ŀ� �ٸ� ������ ����� ��
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

public class UpcastingEx
{
	public static void main(String[] args) 
	{	
		Random rn = new Random();
		
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
		
		// ���� switch���̶� �Ȱ��� ����� ��Ÿ��
		// ��ĳ���� ����� ��
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};		// �ڿ��� �����Ͱ� �ʱ�ȭ ��
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();	
			
		}
		
		
	}
}
*/











