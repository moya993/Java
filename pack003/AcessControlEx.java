package pack003;

import java.util.*;


// 접근 제어자
// Private -> Default -> Protected -> Public
// private의 getter,setter






/*
// 
class Tiger{
	private int a;		// 이 Tiger 클래스 안에서만 사용 가능, "데이터를 은닉"한다고 함
	public int b;		// public은 누구든지 사용 가능
	
	// private 변수값을 밖에서 변경할 수 있게 하는 방법 : getter,setter함수
	// private 변수를 만들고 우클릭 -> source -> getter,setter
	
	private int num;	// 외부에서 num 값을 설정하려면 함수 앞에 public을 붙여 값을 설정하게 함
	// setNum과 getNum을 자바bin이라고 함

	public int getNum() {	// 함수 이름(get)과 변수 이름(num)을 합쳐서 사용해야 함, 국룰임
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	void m1() {
		a = 100;	// 위 a에 private가 걸려있어 클래스 내부 멤버로만 사용 가능
		b = 200;
	}
	
	// 함수 앞에 private를 붙이는 경우
	// 내부 클래스를 구성하는데만 사용 가능
	// 외부에서 호출해도 필요 없는 함수를 만들 떄 사용
	private void m2() {
		
	}
	
	
}


public class AcessControlEx {

	public static void main(String[] args) {
		
		Tiger t = new Tiger();
		t.b = 10;
		System.out.println(t.b);
//		t.a = 20;	불가능
		
		t.setNum(100);		// num은 private가 걸려있어도 getter,setter덕분에 값 변경 가능
		System.out.println(t.getNum());
	}

}
*/





















/*
// Private 예시
class Tiger{
	private String name;
	private int age;
	
	// name의 setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// age의 getter, setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}


public class AcessControlEx {

	public static void main(String[] args) {

	}

}
*/






