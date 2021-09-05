package pack004;

import java.util.Random;


/*
// 업캐스팅 예시
class Animal{
	void cry() {
		System.out.println("...");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
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
		t3.cry();	// 자식 클래스에 cry함수가 없기 때문에 부모의 함수를 호출함
		
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
// 업캐스팅을 사용하는 이유, 다형성
// Animal안의 cry가 추후에 다른 내용을 출력할 때
class Animal{
	void cry() {
		System.out.println("...");
	}
	
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
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
		
		// 위에 switch문이랑 똑같은 결과가 나타남
		// 업캐스팅 사용한 것
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};		// 뒤에서 데이터가 초기화 됨
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();	
			
		}
		
		
	}
}
*/











