package pack004;

import java.util.*;


// 다른 커맨드들




/*
// 1. final
// 주로 PI나 1년은 12개월 같은 값이 정해져 있는 것 쓸 때 사용

final class Animal{		// final이 붙은 클래스는 상속도 불가능
	final int num = 10;	// final이 붙은 변수는 값 변경을 못함, 값 변경을 못하는 걸 상수라고 함
	
	Animal(){}
	
	final void m1() {	// 함수 앞에 final이 붙으면 오버라이딩 불가
		
	}
}

//class Tiger extends Animal{
//	void m1() {
//		
//	}
//}


public class CommandEx {

	public static void main(String[] args) {
		Animal t1 = new Animal();
//		t1.num = 20;	위에서 final로 상수화 시켜서 값 변경 못함
		System.out.println(Math.PI);
		
		String s1 = null;	
	}

}
*/






/*
// 2. this
class Tiger{
//	Tiger this;	// 내가 안적어도 알아서 만들어줌
//	
//	Tiger(Tiger t, int a, int b){	// Tiger t 가 생략되어있음
//		this = t;
//	}
	
	Tiger(int a, int b){
		System.out.println(this.hashCode());
	}
	
	void m1(int a, String b, Tiger c) {
		System.out.println(1);
	}
	
}

public class CommandEx 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger(10,20);
		System.out.println(t1.hashCode());
		System.out.println();
		Tiger t2 = new Tiger(30, 40);
		System.out.println(t2.hashCode());
	}
}
*/


// 2-1. this의 첫 번째 용법











