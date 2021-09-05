package pack004;




/*
// 인터페이스
class A {
	void m1() {
		System.out.println(1);
	}
}

interface B {
	void m2();		// 함수원형 or 함수 프로토타입이라함
}

interface C{
	void m3();
}

class D extends A implements B,C{
	@Override
	public void m2() {
		System.out.println("B를 상속받았지만 여기서 다시 함수 정의 해야함");
	}
	@Override
	public void m3() {
		System.out.println("C를 상속받았지만 여기서 다시 함수 정의 해야함");		
	}
}

@FunctionalInterface	// 함수 원형을 1개만 쓰도록 제한
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
		Thread t2 = null;	// t2는 객체가 아니라는 뜻
		String s = null;
		StringBuffer sf = null;
	}
}
*/














/*
// solid 원칙 살펴보기
// 인터페이스 예시
interface 한국은행 {
	void 입금();
	void 출금();
	void 이체();
	void 대출();	
}

class 국민은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 3퍼 입니다.");
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
}

class 우리은행 implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 10퍼 입니다.");
	}
	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 이체() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void 대출() {
		// TODO Auto-generated method stub
		
	}
}


public class InterfaceEx {

	public static void main(String[] args) {
		국민은행 t1 = new 국민은행();
		
		t1.입금();
	}

}
*/





