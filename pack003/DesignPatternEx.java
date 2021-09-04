package pack003;

import java.util.*;

// 디자인 패턴(Gof) 23가지





// 제너릭 문법
// 모든 타입을 전부 받아줄 수 있는 용법
// setter, getter
// 코드 내용은 같은데 사용되는 타입이 다를경우
// <T>, 컨테이너를 사용, main함수에서 객체 생성때 타입 정해주면 나머지<T>도 전부 바뀜
class A<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}

class B<T>{
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}


public class DesignPatternEx {

	public static void main(String[] args) {
		A<Integer>a = new A<Integer>();		// 제너릭 문법
		a.setData(100);
		System.out.println(a.getData());

		B<String>b = new B<String>();		
		b.setData("호랑이소굴");
		System.out.println(b.getData());
		
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		
	}

}

























/*
// getter, setter
// 코드 내용은 같은데 사용되는 타입이 다를경우
class A{
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}

class B{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}

class C{
	private Tiger data;

	public Tiger getData() {
		return data;
	}

	public void setData(Tiger data) {
		this.data = data;
	}
	
	
}

public class DesignPatternEx {

	public static void main(String[] args) {
		A a = new A();
		a.setData(100);
		System.out.println(a.getData());
		
		B b = new B();
		b.setData("호랑이소굴");
		System.out.println(b.getData());
		
	}

}
*/






















/*
// 데코레이션 패턴 예시1
class 커피{
	int 가격 = 30;
	int 계산() {
		System.out.println("커피주문");
		return 가격;
	}
}

class 설탕 extends 커피{
	int 가격 = 20;
	커피 a;	// 곧 사라지게 될 객체를 백업받음
	설탕(커피 a){
		this.a = a;
	}
	int 계산() {
		System.out.println("설탕추가");
		return 가격 + a.계산();
	}
}

class 프림 extends 커피{
	int 가격 = 20;
	커피 a;	// 곧 사라지게 될 객체를 백업받음
	프림(커피 a){
		this.a = a;
	}
	int 계산() {
		System.out.println("C Run");
		return 가격 + a.계산();
	}
}


public class DesignPatternEx {

	public static void main(String[] args) {
		커피 a = new 커피();
		a = new 설탕(a);
		System.out.println(a.계산());
		a = new 프림(a);
		System.out.println("------------");
		System.out.println(a.계산());
		
	}

}
*/













/*
// 데코레이션 패턴
class A{
	int num = 10;
	int run() {
		System.out.println("A Run");
		return num;
	}
}

class B extends A{
	int num = 20;
	A a;	// 곧 사라지게 될 객체를 백업받음
	B(A a){
		this.a = a;
	}
	int run() {
		System.out.println("B Run");
		return num + a.run();
	}
}

class C extends A{
	int num = 20;
	A a;	// 곧 사라지게 될 객체를 백업받음
	C(A a){
		this.a = a;
	}
	int run() {
		System.out.println("C Run");
		return num + a.run();
	}
}


public class DesignPatternEx {

	public static void main(String[] args) {
		A a = new A();
		a = new B(a);
		System.out.println(a.run());
		a = new C(a);
		System.out.println("------------");
		System.out.println(a.run());
		
	}

}
*/
















/*
// 싱글톤 패턴

// 객체가 한개만 만들어지도록 클래스를 작성하는 것
// 객체를 만드는데 비용이 많이 드는 경우 사용
// 객체가 두 개 이상 필요 없는 경우 사용

class Tiger{
	int num;
	private static Tiger instance = null;		// instance(변수 이름은 무조건 instance)=null은 객체가 아니다 라고 알려줌
	private Tiger() {}	// 생성자 앞에 private를 넣으면 객체를 못 만듬
	
	static Tiger getInstance() {	//Tiger형으로 생성자 생성, getInstance이름은 암묵적 룰
		if(instance == null) {
			System.out.println(1);
			instance = new Tiger();		// 하지만 객체가 없어서 호출을 못함. 그래서 static을 사용
		}
		return instance;
	}
	
	void m1() {
		System.out.println(1000);
	}
	
}

public class DesignPatternEx {

	public static void main(String[] args) {
		Tiger t1 = Tiger.getInstance();
		Tiger t2 = Tiger.getInstance();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		t1.m1();	
		t2.m1();
		System.out.println("-----------");
		System.out.println(t2.num);
	}

}
*/

















