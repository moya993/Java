package pack004;



// 추상
/*
// abstract and 오버라이딩
abstract class 대장장이 {	// 함수 앞에 abstract가 붙으면 class앞에도 abstract가 붙어야 함
	void 칼() {
		System.out.println("칼을 잘 만듭니다.");
	}
	abstract void 방패() {
		
	}
}

class 나그네1 extends 대장장이 {
	@Override
	void 방패() {
		System.out.println("+5강 방패");
	}
}

class 나그네2 extends 대장장이 {
	@Override
	void 방패() {
		System.out.println("나그네2가 방패를 만든다.");
	}
}

public class AbstractEx 
{
	public static void main(String[] args) 
	{
		나그네1 t1 = new 나그네1();
		나그네2 t2 = new 나그네2();
		t1.칼();
		t1.방패();
		t2.칼();
		t2.방패();
	}
}
*/






//추상 메서드 and 인터페이스
//인터페이스를 통해 다중 상속을 지원, 일종의 추상 클래스를 의미
//인터페이스(interface)는 오로지 추상 메소드와 상수만을 포함
/*
//abstract class Animal{
//	abstract void m1(); {
//	}
//}

interface Animal{	// 인터페이스 생성
	abstract void m1();
	// 위 void m1()앞에는 원래 abstract가 붙음, 인터페이스 만들면 함수앞에 무조건 붙음
	
}

class Tiger implements Animal{
	@Override	
	public void m1() {	// 부모클래스가 abstract이기 때문에 반드시 함수 선언을 해주어야 함
		System.out.println(2);
	}
}



public class AbstractEx {

	public static void main(String[] args) {
		Animal a = new Tiger();
		a.m1();
		// abstract가 들어간 클래스로는 객체생성 불가
		
		
	}
}
*/