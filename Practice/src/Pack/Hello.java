package Pack;

import java.util.*;










//ex46-1)		 Exception(예외처리), try-catch문을 사용하는 이유
// throw랑 try-catch문은 한쌍임
class Tiger{
	
	// 1번
	//try-catch문
	void m1() {
		System.out.println(1);
		
		try {
			throw new Exception();	// 일부로 Exception을 발생시키는 코드
		} catch (Exception e) {		// throw에는 반드시 try-catch문과 함께 써야함
			System.out.println("Exception이 발생함");
		}
	}

	// 2번
	// try catch문 없이 Exception 에러를 없애는 방법
	// 함수 이름 뒤에 throws Exception을 넣어줌
	// 이 방법은 이 함수를 사용하는 사람이 알아서 try-catch문을 써봐서 확인하라는 말
	// 예외떠넘기기, 책임전가
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
		
		// 1번
		t1.m1();
		
		
		// 2번
		try {
			t1.m2();
		} catch (Exception e) {
			
		}
		System.out.println(3);
		
		// Thread
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try { Thread.sleep(2000); } catch (Exception e) {}		// unhandle Exception 에러가 뜬다면 try-catch문쓰셈 그럼 끝
		}
		
	}

}






/*
//ex46)		Exception(예외처리), try-catch문이랑 같이 씀
// Exception은 문제가 발생했다는걸 프로그램에 알리는 역할
// 이 때 try-catch문으로 실행을 계속할건지 중단할건지 결정해야함
// 프로그램을 중단시키는게 목적이 아님
public class Hello 
{
	public static void main(String[] args) 
	{	
		// 1번째 Exception
		System.out.println(1);
		try {
//			int a = 10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(2);
		
		System.out.println("------------");
		
		// 2번째 Exception
		// ArrayIndex(OutOfBounds)Exception - 범위를 넘었을 경우
		// try-catch문을 사용하면 적어도 프로그램이 중단되지는 않음
		int[]ar = {1,2,3};
		try {
			ar[3] = 10;
		} catch (Exception e) {
			
		}
		System.out.println(3);
		
		System.out.println("------------");
		
		// 3번째 Exception
		// (NullPointer)Exception
		String s = "무궁화꽃이피었습니다";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());		// 객체가 아닌 null의 길이를 출력하려함
		} catch (Exception e) {		//Exception을 안쓰면 오류가 떠서 다음거가 출력이 안됨
			// TODO: handle exception
		}
		System.out.println(4);
		
		
	}

}
*/












/*
//ex45-5)	인터페이스 연습
// 제일 잘 만들어진 인터페이스
class Baduk{
	
	Ai ai;
	
	Baduk(){
		System.out.println("대국을 시작합니다.");
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
		System.out.println("인공지능은 알파고 입니다.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("알파고가 점수 계산을 한다.");
	}
}


class Betago implements Ai{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("인공지능은 베타고 입니다.");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("베타고가 점수 계산을 한다.");
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
//ex44-2)	밑에와 똑같은 코드지만 자주사용하는 코드

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
		// 인수전달 용도로 자주 사용
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
//ex44-1)	인터페이스 문법
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
		
		// 익명클래스랑 익명객체 둘 다 자주 사용
		// 1. 익명 클래스
		Animal t3 = new Animal() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		};	//처음부터 안되는 코드지만 new Animal(); 에서 ; 앞에 중괄호 만들고 Ctrl + space해서 오버라이드 하기
		
		
		// 2. 익명 객체 : 객체가 없는 친구를 사용
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
		
		//함수인수의 객체를 이용하여 코드를 전달한다.
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
//ex43-5)	this의 네 번째 용법
// 생성자 안에서 필요에 따라 다른 생성자를 호출
// super();은 부모를 호출, this();는 자기 클래스의 다른 생성자를 호출
class Tiger{
	Tiger(){
		System.out.println(1);
	}
	
	Tiger(int a){
		// 밑에 this는 인수를 받지않는 위의 생성자를 호출함
		this();
		System.out.println(a);
	}
	
	Tiger(int a, int b){
		// 밑에 this는 인수를 하나만 받는 위의 생성자를 호출함
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
// ex43-4)	this의 세 번째 용법
// 프로그램에서 자주 나타남 
// 자기 자신을 다른클래스로 인수 전달을 하기 위해 사용
// 상대방이 나 자신을 필요로 할 때, 너에게로 나 자신을 보냄
class Tiger{
	void m1() {
		Lion t1 = new Lion();
		
		if(t1.merry(this) == true) {
			System.out.println("감사합니다.");
		} else {
			System.out.println("ㅠㅠ");
		}
	}
	
	int m2() {
		return 100;
	}
	
	String m3() {
		return "난폭";
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
			case "온순":{
				return true;
			}
			
			case "난폭":{
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
// ex43-3)	this의 두 번째 용법
// 함수안에서 체이닝해서 호출하기 위함
// 자주사용
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
// ex43-2)	this의 첫 번째 용범
class Tiger{
//	Tiger this;			// 코드 생략됨
//	Tiger(Tiger t){		// Tiger t 코드는 생략되어 있음
//		this = t;		// 코드 생략됨
//	}
	
	int a,b,size;	// 필드변수 선언, 밑에 생성자 안의 멤버변수와는 별개임
	
	Tiger(int a, int b, int size){	// 생성자를 만드는 이유는 멤버변수를 초기화 시키기 위함임, 다른 이유x
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
		System.out.println(a+" "+b+" "+size);	// 각 변수 앞에 this.이 생략되어 있음
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
//	원래 this라는 변수가 존재함
//	Tiger this; 	내가 적지 않아도 알아서 만들어줌	
//	Tiger(Tiger t, int a, int b) {		Tiger t가 생략되어 있음
//		this = t;		코드가 생략되어 있음
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
	final int NUM = 10;		// final이 붙은거는 값을 변경할 수 없음, 값을 변경할 수 없는걸 상수라고 함
	
	Animal(){}
	
	final void M1() {	// 함수 앞에 final이 붙으면 이 코드 이후로부터 오버라이딩이 안됨
		
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
//		t1.NUM = 20;	위에서 final로 변수를 설정하였기 때문에 더 이상 값 변경 불가능
		
		String s1 = null;	// String클래스는 상속받을 수 없다.
		
	}

}
*/




/*

// ex41)	인터페이스 예시2
class A{
	void m1() {
		System.out.println(1);
	}
}


interface B{
	void m2();		// 함수원형 ^ 함수프로토타입이라고 함
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


@FunctionalInterface		// 함수원형을 1개만 쓰도록 제한을 검
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
		Thread t2 = null;	// t2는 객체가 아니다.
		String s = null;	
		StringBuffer sf = null;
		
		
	}

}
*/











/*
// ex40)	인터페이스 예시
interface 한국은행{
	void 입금();
	void 출금();
	void 이체();
	void 대출();
}



class 국민은행  implements 한국은행{
	@Override
	public void 입금() {
		System.out.println("이자율은 3%입니다.");
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
		System.out.println("이자율은 10% 입니다.");
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


public class Hello 
{
	public static void main(String[] args) 
	{	
		국민은행 t1 = new 국민은행();
		우리은행 t2 = new 우리은행();
		
		t1.입금();
		t2.입금();
		
	}

}
*/








/* 
// ex39)	abstract 오버라이딩
abstract class 대장장이 {		// 함수앞에 abstract가 붙으면 class 앞에도 무조건 abstract가 붙어야 함
	void 칼() {
		System.out.println("칼을 잘 만든다.");
	}
	abstract void 방패();
}


class 나그네1 extends 대장장이{
	void 방패() {
		System.out.println("+5강 방패");
	}
}

class 나그네2 extends 대장장이{		// 오버라이딩 : 부모가 가지는 함수 이름과 자식이 가지는 함수 이름을 똑같이 만듬
	@Override
	void 방패() {
		System.out.println("+10강 방패");
			
	}
}

public class Hello 
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








/*
// ex38)	abstract(추상관계) = 미완성 & 인터페이스

//abstract class Animal{		// 미완성된 클래스
//	abstract void m1() {}	// abstract 미완성된 함수
//}

interface Animal{	// 인터페이스
	void m1();	// 원래는 앞에 abstract가 붙음, 인터페이스를 만들면 반드시 앞에 abstract가 붙음
}

class Tiger implements Animal{
	public void m1() {		// 부모클래스가 abstract이기 때문에 반드시 함수 선언을 해줘야 함
		System.out.println(2);
	}
}



public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal a = new Tiger();
		a.m1();
		
//		Animal t2 = new Animal();	Abstract가 들어간 클래스로는 객체생성 불가
		
	}

}
*/




/*
// ex37)	배열
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 10;
		
		// 배열 사용법
		int[] ar = new int[5];	// 배열의 첨자 "0 ~ 배열의길이-1" 까지 사용가능
		int[] br = new int[] {1,2,3,4,5};
		int[] cr = {10,20,30,40,50}; 	// 가장 쉬운 방법, 하지만 실전사용x
		
		// 배열의 길이 출력
		System.out.println(ar.length);	
		
		System.out.println("-----------------");
		
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]+" ");
		}
		System.out.println();
		
		System.out.println("------------------");
		
		
		// 간략화 포문 foreach ++ 생략된 부분
		// foreach 문의 변수로는 x, data, value를 주로 씀
		for (int x : cr) {
			System.out.println(x+" ");
		}
		
		cr[0] = 100;
		cr[4] = 200;
		
//		cr[5] = 300;	유효범위를 벗어나서 사용 불가 ,[5]이상은 사용불가 
//		cr[-1] = 100;
		
		
		int num = 3;
		ar[num] = 500;
		
//		ar[num*3-5]=0;	조심해서 사용가능! 계산식이 유효범위를 맞춰야됨
		
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
		ss[0] = "호랑이";
		ss[1] = "앵무새";
		ss[2] = "하마";
		ss[3] = "토끼";
		
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]+" ");
		} 
		System.out.println("-----------------");
		

		String[] st = new String[] {"해바라기", "진달레", "민들레"};
		
		String s1 = "호랑이";		// 간편방법
		String s2 = new String("독수리");		// 정석방법
		String [] su = new String[] {new String("해바라기"), new String("잔덜래"), new String("민들레")};
		
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]+" ");
	
		}System.out.println();
		
		
	}

}
*/
















/*
// ex36)	난수 발생 코드
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
// ex35)	업캐스팅을 사용하는 이유, 다형성
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
		
		// 업캐스팅을 사용하게 된다면 
		// 위 switch문이랑 똑같은 결과가 나타남
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};	// 뒤에서 데이터가 초기화 됨
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();
		}
		
		
		
	}

}
*/









/*
// ex34)	업캐스팅 예시
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


class Zoo{
//	void sound(Dog t) {
//		t.cry();
//	}
//	
//	void sound(Cat t) {		// 오버로딩
//		t.cry();
//	}
//	
//	void sound(Sneak t) {	// 오버로딩
//		t.cry();
//	}
	
	void sound(Animal t) {		// 업캐스팅을 쓰는 이유는 함수를 계속 추가 안하고 Animal 인수를 받으면서 한번에 추가가 가능하기 때문
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
// ex33)	업캐스팅 & 다운캐스팅
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
		Animal t3 = new Tiger();	// (업캐스팅) == (부-자 관계)
//		Tiger t4 = new Animal();	// 다운캐스팅
		
		t1.m1();
		t1.m3();
		System.out.println("---------");
		t2.m1();
		t2.m2();
		t2.m3();
		System.out.println("---------");
		
		t3.m1();
//		t3.m2();	// m2 메모리는 존재하지만 m2문법에 접근은 못함
		t3.m3();	// 함수를 호출하기 전에 무조건 자식먼저 보고 자식이 함수를 가지고 있으면 자식호출, 없으면 부모호출
		
		
	}

}
*/







/*
// ex32)	상속에서의 생성자
class Animal{
	Animal(){
		System.out.println("부모생성자 콜");
	}
	Animal(int n){		// Animal생성자 오버로딩
		System.out.println("부모생성자 콜 "+n);
	}
	
}



class Tiger extends Animal{
	Tiger(){
		// 현재 라인에는 super();코드가 생략되어 있음
		super();	// 부모의 생성자를 call, super();은 생성자 안에서만 사용 가능
		System.out.println("첫 번째 자식생성자");
	}
	Tiger(int num){
		super(num + 100);	// super은 반드시 첫 줄에 와야함
		System.out.println("2번째 자식 생성자");
	}
	Tiger(int a, int b){
		super(a*b);
		System.out.println("3번째 자식 생성자");
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
// ex31)	상속
class Animal{	// 부모클래스인 Animal을 생성
	void m2() {
		System.out.println("Animal의 m2 호출");
	}
	void m3() {
		System.out.println("Animal의 m3 호출");
	}
	
}

class Tiger extends Animal{		// 자식클래스인 Tiger를 생성
	void m1() {
		System.out.println("Tiger의 m1 호출");
	}
	void m3() {
		System.out.println("Tiger의 m3 호출");
	}
	void m4() {
		m3();	// Tiger가 가지고 있는 m3를 출력
		// super은 부모 클래스의 클래스나 함수를 호출할 때 사용, super()와 다름
		super.m3();		// 부모함수의 m3를 호출, 간접적으로 우회해서 부모를 호출
		System.out.println("Tiger의 m4 호출");
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
		t2.m2();	// 상속받았기 때문에 부모의 m2가 없어도 부모의 m2를 호출할 수 있음
		t2.m3();	// 같은 함수가 있으면 무조건 자기 클래스의 함수를 먼저 호출
		
		System.out.println("------------------------");
		
		t2.m4();
		
	}

}

*/









/*
// ex30)	수학함수
public class Hello 
{
	public static void main(String[] args) 
	{	
		
		
	}

}
*/












/*
// ex29)	static 예시1

// static 함수 안에서는 static 멤버만 사용 가능

class Tiger{
	static void myMain() {
		Tiger t = new Tiger();	// 자기 함수 안에서 자신에 대한 객체 생성 가능
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
		System.out.println("1번 콜");
	}
	
	public static void main(String[] args) 	// void앞의 static이 빠지면 객체 생성을 하지 않는 이상 호출 불가
	{	
		System.out.println(num);
		
		Hello h = new Hello();
		
		h.m1();
		h.m2();
		Hello.m1();
	}

	
	void m2() {
		System.out.println("2번 콜");
	}
	
	
}
*/











/*
// ex28)	static

// 1. static은 객체를 생성할 때 cost 낭비를 줄이기 위해 사용

class Tiger{
	int num1;
	static int num2 = 100;	// static이 붙은건 class 보다도 맨 위에 올라감(관제탑 기능)
	
	static void m1() {
		System.out.println("static 함수 콜");
	}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println(Tiger.num2);		// static이 없으면 클래스 안에 있는 변수기 때문에 바로 호출 불가능
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.num1);
		System.out.println(t1.num2);
		
		t2.num2 = 200;
		System.out.println(t1.num2);
		
		System.out.println(Tiger.num2);		// 원래 static을 쓰는 원칙

		Tiger.m1();
		
		
		// static 예시
		System.out.println(Math.abs(10));
	}

}
*/









/*
// ex27)	생성자 연습2
class Car{
	int fuel = 100;
	String name;
	
	Car(){
		name = "무명";
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
		System.out.println(name+" 차의 연료는 "+fuel);
	}
	
	void move() {
		System.out.println(name+" 차가 움직인다.");
	}
	
	void stop() {
		fuel -= 10;
		System.out.println(name+" 차가 멈춘다.");
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
		Car car2 = new Car("꼬마",200);
		
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
// ex26)	생성자 연습
class Tiger{	// class안에 아무것도 없으면 알아서 default 생성자를 만듬
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
// ex25)	생성자

// 1. 생성자는 함수이다. 때문에 (생성자 함수)라고도 함
// 2. 생성자는 반드시 클래스 이름과 동일해야 함
// 3. 생성자 함수는 리턴값을 가질 수 없다. 때문에 void를 쓰지 않는다.
// 4. 생성자 함수도 오버로딩이 가능하다.
// 5. 객체가 생성될 때 딱 한번만 호출됨(임의로 호출 불가능)
// 6. 생성자를 사용하는 목적은 멤버 메소드를 초기화 시키는 목적으로 사용
// 7. 생성자 함수를 작성하지 않을시에는 자동으로 default 생성자가 만들어짐

class Tiger{
	int age = 20;
	String name = "홍길동";
	
	// 1번 생성자
	Tiger(){
		System.out.println("생성자 콜");
		System.out.println("생성자가 호출되었다. ");
		// age = 20;
		// name = "홍길동";
		
	}
	
	// 2번 생성자. 매개변수를 정수형과 string형으로 받음
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
		// 1번 생성자 호출
		Tiger t1 = new Tiger();
		// 1-1. 객체가 생성되서 또 다시 Tiger생성자를 호출함
		Tiger t2 = new Tiger();
		
		System.out.println("----------------");
		
		// 2번 생성자 호출
		Tiger t3 = new Tiger(10, "강감찬");
		t2.showInfo();	// 자식에게 변수가 없어, 부모의 변수를 가져옴
		t3.showInfo();
		
	}

}
*/




/*
// ex23)
class Tiger{
	// 함수 오버로딩, 함수 재정의라고 불림
	// 전달되는 함수의 개수가 다르던지, 타입이 다를 때 함수 이름을 다르게 사용 가능	
	void method01() {	// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(1);
	}	
	
	void method01(int a) {		// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(2);
	}
	
	void method01(int a, int b) {	// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(3);
	}
	
	void method01(String a, int b) {	// 함수 이름을 동일한 이름으로 생성 가능
		System.out.println(4);
	}
	
	
	// 함수 이름이 똑같이 제공된다면 오버로딩, 재정의
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
		t1.method01("호랑이", 1);
	}
}

*/