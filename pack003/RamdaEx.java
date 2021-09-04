package pack003;

import java.util.*;




/*
// 람다 함수의 문법

interface Test1{
	void m1();
}

interface Test2{
	void m1(int num);		
}

// 인터페이스 안에서 함수를 한개만 지정할 때 사용
interface Test3{
	int m1();
}

interface Test4{
	String m1(int num, String str);		// 나중에 String형으로 반환해줄거임
}

interface Test5{
	void m1();
}



public class RamdaEx {

	public static void main(String[] args) {
		
		// ex1) 익명 클래스 생성 1
		Test1 t1 = new Test1() {
			@Override
			public void m1() {
				System.out.println(1);
			}
		};
		t1.m1();
		System.out.println();
		
		
		// ex2) 람다 함수의 기본형 만드는 방법
		// ex1)과 동일한 코드임
		Test1 t2 = ()->{
			System.out.println(2);
		};
		t2.m1();
		System.out.println();
		
		
		// ex3) 람다 함수에서 인수전달을 할 때
		// 두번째 인터페이스 Test2에서 인수 전달을 받음
		Test2 t3 = (n)->{
			System.out.println(n);
		};
		t3.m1(100);
		System.out.println();
		
		
		// ex4) 람다 함수에서 리턴값이 있을경우
		Test3 t4 = ()->{
			System.out.println(3);
			return 100;
		};
		System.out.println(t4.m1());
		System.out.println();
		
		// ex5) 람다 함수에서 리턴값을 두 개 이상 받을 때
		Test4 t5 = (n, s)->{
			return n+s;
		};
		System.out.println(t5.m1(5, "호랑이"));
		
		
		// ex6) 람다 함수 안에서 return 말고 코드가 없을 경우에는 '{}'와 "return"키워드를 생략 가능
		Test3 t6 = ()->{
			return 100;
		};
		// 위 아래 같음
//		Test3 t6 = ()-> 100;

		
	}

}
*/
















/*
// 람다 함수 예제1
interface Test1{
	void m1();
}

interface Test2{
	int m1();		//return이 int형임
}

class Tiger{
	void m2(Test1 t) {		// 함수를 Test1으로 전달받을 거임
		t.m1();				// main 함수의 t1.t1과는 관계 없음
	}
	void m3(Test2 t) {		// 함수를 Test2로 전달받을 거임
		System.out.println(t.m1());
	}
}


public class RamdaEx {

	public static void main(String[] args) {
		Test1 t1 = ()->{		// 람다 함수 생성
			System.out.println(1);
		};
		
		
		Tiger tiger = new Tiger();		// tiger 객체 생성
		
		tiger.m2(t1);			// 바로 위 main함수 안의 t1 람다 함수를 받을 수 있음
		
		// 실제 사용 모습
		tiger.m2(()->{			// 람다식을 바로 적는 방법
			System.out.println(2);
		});
		
		
		tiger.m3(()->100);		// 위 interface Test2의 리턴을 받는 함수를 호출했음
		
		
		
		
		// LinkedList와 람다 함수
		LinkedList<Integer> mm = new LinkedList<Integer>();
		mm.removeIf((lion)->lion % 2 == 0);
		
		// 위 코드와 아래 코드는 같음 
		mm.removeIf((lion)->{
			return lion % 2 == 0;
		});
		
	}

}
*/






















