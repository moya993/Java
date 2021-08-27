package Pack;

import java.util.Iterator;
import java.util.Random;

/*
// ex)
public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println("1000");
	}
}
*/




// ex37)
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







/*
// ex36)	난수 발생 코드
public class Hello 
{
	public static void main(String[] args) 
	{	
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		for (int num = 0;  num < rn.nextInt(2); num++) {
			//System.out.println(num);
			System.out.println(rn.nextInt(10));
		}			
		
		
	}
}

*/




/*
// ex35)		배열 
public class Hello {
	
	public static void main(String[] args) {
	
		int a=10;

		// 배열 사용법 
		int [] ar = new int[5]; 			// ★★★ 배열의 첨자 "0 ~ 배열의 길이-1" 까지 사용가능
		int [] br = new int[]{1,2,3,4,5};   // 
		int [] cr = {10,20,30,40,50};		// 가장 쉬운 방법 실전 사용X

		System.out.println(ar.length); // 배열의 개수 확인

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		} System.out.println();

		// 간략화 된 포문 foreach ++ 생략된 부분
		// 변수 x,data,value 많이쓴다.

		for (int x : cr) {   
			System.out.print(x+" ");
		}
		
		cr[0]=100;
		cr[4]=200;

		//cr[5]=300; 유효범위벗어남
		//cr[-1] =100;

	
		int num =3;
		ar[num] = 500;

		//ar[num*3-5] =0;// 조심해서 사용가능 ! 계산식이 유효범위를 맞춰야댐

		ar[2]=3;
		ar[ar[2]]=999; //ar[2]


		System.out.println(ar[2]+" "+ar[3]);
		ar[ar[3]-998]=888;

		for (int x : ar) {   
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("===================================================");
		
		boolean []dr = {true, true, false ,true};

		for (boolean b : dr) {   
			System.out.print(b+" ");
		}System.out.println();
		
		System.out.println("===================================================");

		String [] ss = new String[4]; //String 
		ss[0] ="호랑이";
		ss[1] ="앵무새";
		ss[2] ="하마";
		ss[3] ="토끼";

		for(int i=0 ; i< ss.length ; i++){
			System.out.print(ss[i]+" ");
		}
		System.out.println();
		
		System.out.println("===================================================");
		
		String [] st = new String[]{"해바라기","진달레","민들레"};

		String S1 = "호랑이";				 // 간편 방법
		String s2 = new String("독수리"); // 정석인 방법
		String [] su = new String[]{new String("해바라기"),new String("진달레"),new String("민들레")};

		for(int i=0 ; i< st.length ; i++){
			System.out.print(st[i]+" ");
		}
		System.out.println();
		
	}
}
*/






/*
// ex34)	업캐스팅 예시************필독***************
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
	
	void sound(Dog t) {
		t.cry();	
	}
	void sound(Cat t) {	// 오버로딩
		t.cry();
	}
	void sound(Sneak t)	{	// 오버로딩
		t.cry();
	}
	
	
	// solid 원칙 5가지중 - 개방-폐쇄 원칙
	// 요소 확장에는 열려있으나 코드를 변경하는 것은 닫혀있다.
	void sound(Animal t) {		// 업캐스팅을 쓰는 이유 위의 3개 주석처럼 함수를 계속 추가 안해주고 Animal인수를 받으면서 한 번에 가능
		t.cry();
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		// 업캐스팅(좌-부모, 우-자식 관계)
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Sneak();
		
		t1.cry();
		t2.cry();
		t3.cry();	// 자식클래스에 cry함수가 없기 때문에 부모의 함수를 가져다가 호출함
		
		///////////////////////위 아래가 같은데 업캐스팅 왜 쓰는지?////////////////////////
		
		Dog t4 = new Dog();
		Cat t5 = new Cat();
		Sneak t6 = new Sneak();
		
		t4.cry();
		t5.cry();
		t6.cry();	
		
		System.out.println("-----------------------");
		
		Zoo t7 = new Zoo();
		
		t7.sound(new Dog());
		t7.sound(new Cat());
		t7.sound(new Sneak());
		
	
		
	}
}


*/





/*
// ex33)	
class Animal{
	void m1(){		
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
		Animal t1 = new Animal();	// case1
		Tiger t2 = new Tiger();		// case2
		Animal t3 = new Tiger();	// case3 : 업캐스팅(부-자 관계)
	//	Tiger t4 = new Animal();	// case4 : 다운캐스팅
			
		t3.m1();	// m2메모리는 있지만 m2문법에 접근은 못함
		
		t3.m3();	//  함수를 호출하기 전에 무조건 자식에게 m3이 있으면 자식의 m3를 호출하고 없으면 부모의 m3를 출력
		
		
	}
}
*/







/*
// ex32)	상속관계에서의 생성자
class Animal{
	Animal(){
		System.out.println("부모생성자 콜");
	}
	Animal(int n){
		System.out.println("부모생성자" + n);
		
	}
}

class Tiger extends Animal{
	Tiger(){
		// 현재 라인에 코드가 1줄이 생략되어 있다.  그게 [ super(); ] 임
		super();	// 부모의 생성자를 call 시키라는 뜻, super();은 생성자 안에서만 사용가능
		System.out.println("첫 번째 자식생성자");
		
	}
	Tiger(int num) {
		super(num+100);		// super는 반드시 첫 줄에 와야함
		System.out.println("2번쨰 자식 생성자");
		
	}
	Tiger(int a, int b) {
		super(a*b);		// super는 반드시 첫 줄에 와야함
		System.out.println("3번쨰 자식 생성자");
		
	}
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Tiger t2 = new Tiger(); 	// 자식생성자가 먼저 call이 되고 부모생성자가 call 됨 
		Tiger t3 = new Tiger(3, 4); 	 
		
	}
}

*/







/*
// ex31)	상속
class Animal{	// 부모 클래스
	void m2() {
		System.out.println(2);
	}
	
	void m3() {
		System.out.println(31);
	}
	
}

class Tiger extends Animal{		// 자식 클래스		Tiger -> Animal 자식이 부모쪽으로 
	void m1() {
		System.out.println(1);
	}
	
	void m3() {
		System.out.println(32);
	}
	
	void m4() {
		m3();	// 자기가 가지고 있는 함수 m3을 호출************
		super.m3();		// 부모함수의 m3를 호출************ 간접적으로 우회해서 부모를 호출
		System.out.println(4);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();	// Animal만 사용 상속과 관계x
		Tiger t2 = new Tiger();
		t2.m1();
		t2.m2();	// t2. 하면 먼저 Tiger 클래스에서 먼저 함수를 찾음
		t2.m3();	// 부모와 자식이 동일한 함수를 가지고 있으면 자기 클래스의 함수를 먼저 사용
		System.out.println("----------------");
		t2.m4();	// 부모의 함수 m3를 호출하려면 간접적으로 접근
		
		
		
	}
}
*/







/*
// ex30)	수학함수
public class Hello 
{
	public static void main(String[] args) 
	{	
		// 절대값
				int v1 = Math.abs(-5);
				double v2 = Math.abs(3.14);
				System.out.println(v1);
				System.out.println(v2);
				
				// 올림값
				double v3 = Math.ceil(5.3);
				double v4 = Math.ceil(-5.3);
				System.out.println(v3);
				System.out.println(v4);
				
				// 버림값
				double v5 = Math.floor(5.3);
				double v6 = Math.floor(-5.3);
				System.out.println(v5);
				System.out.println(v6);
				
				// 최대값
				double v7 = Math.max(5, 9);
				double v8 = Math.max(5.3, 2.5);
				System.out.println(v7);
				System.out.println(v8);
				
				// 최소값
				double v9 = Math.min(5, 9);
				double v10 = Math.min(5.3, 2.5);
				System.out.println(v9);
				System.out.println(v10);
				
				// 랜덤값
				double v11 = Math.random();
				System.out.println(v11);
				// return 값은 0.0 <= v11 < 1.0
				
				// 가까운 정수의 실수값
				double v12 = Math.rint(5.3);
				double v13 = Math.rint(5.7);
				System.out.println(v12);
				System.out.println(v13);
				
				
				long v14 = Math.round(5.3);
				long v15 = Math.round(5.3);
				System.out.println(v14);
				System.out.println(v15);
	}
}

*/



/*
// ex29)	static

// static함수 안에서는 static멤버만 사용 가능
class Tiger{
	static void myMain() {
		Tiger t = new Tiger();	//자기 class 안에서 자신에 대한 객체 생성 가능
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
		System.out.println("1번콜");
	}
	
	
	public static void main(String[] args)		// void main은 함수 이름,void 앞의 static이 빠지면 객체 생성을 하지 않는이상 호출 불가능
	{	
		System.out.println(num);
		
		Hello h = new Hello();
		
		h.m1();
		h.m2();
		Hello.m1();
	//	Hello.m2();
		
	}
	
	void m2() {
		System.out.println("2번콜");
	}
	
	
}
*/





/*
// ex28)	static


// static은 객체생성해서 비용을 낭비하는 것을 아끼기 위해 사용
class Tiger{
	int num1;
	static int num2 = 100;	// static 붙은건 class 보다도 맨 위에 올라감(관제탑 기능)
	
	static void m1() {
		System.out.println("static 함수 콜");
	}

	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println(Tiger.num2);		// static은 class이름.변수이름으로 객체생성 안하고 호출 가능
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.num1);
		System.out.println(t1.num2);
		
		t2.num2 = 200;
		System.out.println(t1.num2);
		
		System.out.println(Tiger.num2);		// 원래 static을 쓰는 원칙
	
		Tiger.m1();

		
		
		// static예시
		System.out.println(Math.abs(10));
		
		
	}
}
*/








/*
// ex27)	생성자 연습 ㄱ
class Car{
	int fuel = 100;	
	String name;
	
	Car(){
		name = "무명";
	}
	
	Car(String n,int f){
		fuel = f;
		name = n;
	}
	
	void inject() {
		fuel += 100;
	}
	
	void inject(int f) {
		fuel = fuel + f;
	}
	
	void move(){
		System.out.println(name+" 차가 달린다.");
		fuel -= 30;
	}
	
	void stop() {
		fuel -= 10;
		System.out.println(" 차가 멈춘다");
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
		Car car2 = new Car("꼬마", 200);
			
		car1.move();
		car1.show();
		car2.move();
		car2.show();
		
	}
}
*/








/*
// ex26)	생성자 연습
class Tiger{	// class 안에 아무것도 없으면 알아서 default 생성자를 만듬
	Tiger(int a, int b){
		
	}
	Tiger(){}
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger(10, 20);
		
		
	}
}
*/








/*
// ex25)	생성자

// 1. 생성자는 함수이다. 때문에 (생성자 함수)라고 함
// 2. 함수 이름은 클래스이름과 반드시 동일해야 함
// 3. 생성자 함수는 리턴값을 가질 수 없다. 그래서 void 조차도 생략함
// 4. 생성자 함수도 오버로딩이 가능함
// 5. 객체가 생성될 때 단 한 번 호출됨(임의로 호출 불가능)
// 6. 생성자를 사용하는 목적은 멤버 메소드를 초기화 시키는 목적으로 사용
// 7. 생성자 함수를 작성하지 않을시에는 자동으로 default생성자가 만들어짐

class Tiger{	
	int age = 20;	// 필드에서 미리 값을 지정하고 사용하는건 안되나? 하지만 그러면 객체가 생성되는 모든 age가 20이 됨
	String name = "홍길동";
	Tiger(){	// default생성자,	값을 초기화 하기 위해 주로 사용
		System.out.println("생성자 콜");
		System.out.println("생성자가 호출되었다.");
		// age = 20;
		// name = "홍길동";
	}
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
		Tiger t1 = new Tiger();		//new 뒤에있는 Tiger가 생성자를 호출함
		Tiger t2 = new Tiger();		// 객체가 생성될때마다 생성자가 호출됨 		
		Tiger t3 = new Tiger(100,"강감찬");
		Tiger t4 = new Tiger(200,"앵무새");
				
		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
		t4.showInfo();
		
		
	}
}
*/






/*
// ex24) 짜투리~	
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 100;
		// 문자열로 변환 하고 싶을경우( Integer.soString() )
		String s1 = Integer.toString(a);
		System.out.println(s1+200);		// 문자열 처리
		// sugar code
		String s2 = ""+a;	// 문자열 처리
		System.out.println(s2);
		
		String s3 = "456";
		int b = Integer.parseInt(s3);	// parseInt는 구문을 분석한다, 해석한다
		System.out.println(b+100);
	}
}
*/




/*
// ex23)	오버로딩
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






/*
//ex22)		반복문 continue, break
public class Hello 
{
	public static void main(String[] args) 
	{	
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue;	// for문에서 continue를 만나면 바로 i++로 감
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}
		System.out.println("호랑이");
		
		
		System.out.println("-------------------------");
		
		int num = 0;
		while(true) {
			num++;
			if(num == 10) {
				System.out.println("호랑이"+num);
				break;
			}			
			if(num%2 == 0) {
				System.out.println("코끼리"+num);
				continue;
			}
		}
		
		
		
		
	}
}

*/







/*
//ex21)		***********필독*************8
class Tiger{
	int m1(int a, int b) {

		if(a>b) {
			return 100;
		} else {
			System.out.println("호랑이");
			// return 200; or 
		}
		return 500;
	}
	
	void m2() {
		System.out.println(1);
		return;		// 함수가 실행 중단이 됨
		// System.out.println(2);
	}
	
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("찾았다.");
				return;		// 함수가 돌지 않게 하려면 return 값 사용	
			}
		}
		System.out.println("검색데이터 찾지 못함");
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t = new Tiger();
		System.out.println(t.m1(3, 2));
		
		t.m3(2);
		
		t.m3(11);
		
		
		
	}
}

*/




/*
// ex20)	**************필독**************
class Tiger{
	String m1() {
		return "독수리"; 
	}
	Lion m2() {
		//return new Lion();
		Lion t = new Lion();
		return t;
	}
	Lion m3(Lion t) {
		return t;
	}
	
}

class Lion{
	void show() {
		System.out.println(1000);
	}
}


public class Hello 
{

	public static void main(String[] args) 
	{	
		// m1
		Tiger t1 = new Tiger();
		String s1 = t1.m1();
		System.out.println(s1);
		System.out.println(t1.m1());
		
		
		// m2
		Lion t2 = t1.m2();
		t2.show();
		
		
		// m3
		Lion t3 = t1.m3(new Lion());
		t3.show();
		
		
		// return 되는것이 Lion 객체이기 때문에 가능
		t1.m3(new Lion()).show();;
		
	}
}

*/




/*
// ex19)
class Tiger{
	// 주의!!! 인수전달할 때 int a,b는 안됨
	void m1(int a, int b) {		// 인수전달은 여러개 가능
		System.out.println(a+" "+b);
		System.out.println(a*b+a);
	}
	void m2(int a, char b, boolean c, float d, String e) { 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	void m3(Lion a) {
		System.out.println(a.hashCode());
		a.sound();
	}

}


class Lion{
	void sound() {
		System.out.println("허허");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		String s1 = "호랑이";		// String은 Java에서 만들어준 표준 클래스
		System.out.println(s1);
		System.out.println(s1.length());
		
		
		Tiger t1 = new Tiger();
		
		
		
		t1.m1(3,4);

		t1.m2(10, 'F', false, 3.14f, "땅강아지");
		
		
		
		Lion t2 = new Lion();	// Lion 클래스 객체 생성
		System.out.println(t2.hashCode());
		
		t1.m3(t2);	
		
		
		// Lion a는 new Lion()
		t1.m3(new Lion());		
		
	}
}
*/






/*

// ex18)

// 클래스 생성
class Tiger
{
	// merry라는 메소드 생성 = 함수라고도 불림
	// 자주 사용되는 코드를 불러서 사용함
	// 함수의 유형은 4가지
	
	// 1. 인수전달x
	void merry() {
		System.out.println("멍");
	}
	
	// 2. 인수전달o
	// int num = 3
	void happy(int num) {	
		for (int i = 0; i < num; i++) {
			System.out.println('왕');
		}
	}

	// 3. return o, void는 리턴값을 쓸 수 없음
	int turtle() {
		System.out.println("거북이 call");
		return 15;
	}

	// 4. 인수전달o, return o
	int fish(int num) {
		int n = num*3;
		return n;
		
		
	}
	
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t = new Tiger();		// new 객체명() + Ctrl,1
		
		//1 
		t.merry();	// 함수를 call(호출)한 것
		t.merry();
		t.merry();
		
		for(int i = 0; i < 10; i++) {
			t.merry();
		}
		
		// 2
		System.out.println("--------------------");
		t.happy(3);		// 인수전달
		
		System.out.println("--------------------");
		// 3
		int num = t.turtle();	// return값을 변수에 저장해서 아래에서 출력
		System.out.println(num);
		System.out.println(t.turtle());	// return값을 바로 받을 때
		
		// 4
		int cnt = t.fish(7);
		System.out.println(cnt);
		System.out.println(t.fish(345));
		
		
		
		//     함수의 구성
		// return값   인수전달
		//    x         x
		//    x         o
		//    o         x
		//    o         o
		
		
	}
}

*/









/*
// ex17)	**********class클래스************

class Tiger{
	// 필드 : 클래스 안에서 생성되는 변수(필드, 멤버, 변수 3가지 이름으로 불림) 
	int a;
	int b = 20;
	int c,d = 30;
	// 생성자 
	// 메소드 
}




public class Hello 
{	
	public static void main(String[] args) 
	{	
		// 객체 생성 방법, 맨앞(Tiger)와 맨뒤 (Tiger)이름은 항상 같아야함
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		// 필드를 사용하기 위해서는 (객체.필드명)    
		// ex)t1.a
		t1.a = 100;
		t1.c = t1.a+30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		
		// 모든 객체는 생성되면 반드시 자기자신의 고유번호를 발급받는다.
		// 고유번호를 확인하는 방법 (객체.hashCode())
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
		// t3와 t3의 메모리를 공유함(참조)
		// 다른 이름이지만 동일한 메모리 공유
		Tiger t3;
		t3 = t2;	
		System.out.println(t3.hashCode());	// t3와 t2의 해시값이 같음
		t3.a = 999;
		System.out.println(t2.a);
		System.out.println(t3.a);
		
		
	}
}

*/









/*
// ex16)
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 10, b;
		b = a++; 	// 대입 증가 순서로 일어남, a가 가지고 있는 수를 대입하고나서 a가 증가함
		System.out.println(a+" "+b);
		System.out.println(String.format("%d %d", a, b));
				
		int c = 10, d;
		d = ++c;	// 증가 대입 순서로 일어남, c를 증가시키고 d에 대입
		System.out.println(c+" "+d);
		
		int a1 = 10, a2 = 10;
		System.out.println(a1++);
		System.out.println(++a2);
		System.out.println(++a1);
		System.out.println(a2++);
		
		
	}
}
*/





/*
// ex15)
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 10;		// 대입해서 들어가는 자리에 있는 10을 리터럴이라고 부름
		int b = 20;
		short c = 30;
		b = (int)c;	// 타입 캐스팅
		
	
		
		int num = 10;
		num = num + 3;
		num+=3;		// 위에보다 컴파일 하는 속도가 더 빠름
		
		
		
		int a1 = 0, a2 = 0;
		a1 = a2 + 3;
		
		
		
		int t = +1;		// 숫자에 +를 넣는 이유는 자리맞춤 때문에 함
		int u = -1;
		int k = 0;
		k+=3;
		k = 3;
		
		
		
		int d = 0;
		d++;	// 속도가 제일 빠름
		System.out.println(d);
		++d;	// 속도가 제일 빠름
		System.out.println(d);
		d=d+1;	// 위에보다 수행 속도가 느림
		System.out.println(d);
		d+=1;
		System.out.println(d);
		
		
		
	}
}
*/




/*
// ex14)
public class Hello 
{
	public static void main(String[] args) 
	{	
		int n = 87;
		while(true) {
			System.out.println(n);
			if(n%2 == 0) {
				n = n/2;
			}else {
				n = n*3+1;
			
			//n = (n%2==0) ? n/2 : n*3+1;
			
			
			
			if(n==1) {
				System.out.println(n);
				System.out.println("탈출하기 직전");
				break;
			}
			
	}
			
			// 반복횟수를 모르는 프로그램
			int n2 = 1234;
			int sum = 0;
			while(true) {
				int r = n2;
				n2 = n2/10;
				sum = sum+r;
				
				if(n2 == 0) {
					break;
				}
				System.out.println(sum);
				
				
				
		}	

	}
	
}


*/


/*
// ex13)	while문
public class Hello {
	public static void main(String[] args) {
		// 1. while
		//int num = 0;
		//while(true) {
		//	num++;
		//	System.out.println(num+" ");
		//}
		
		
		// 2. while
		//int n = 0;
		//while(n<10) {
		//	System.out.println(n);
		//	n++;
		//}
		//System.out.println("호랑이");
		
		// 3. while
		int a = 0;
		while(true) {
			System.out.println(a);
				if(a == 5){
				System.out.println("탈출하기 직전");
				break;
			}
			a++;
		}
		
		
		
	}
	
}
*/



/*
// ex10)   for문  =  for(초기;조건;증감){}

public class Hello {
	public static void main(String[] args) {
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++; // 자신이가지고 있는 값을 1증가시키는 단항연산자(++)
		System.out.println(num);
		num--; // 자신이 가지고 있는 값을1감소시키는 단항연산자(--)
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);

		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("호랑이" + i);
		}

		// for문의 잘못된 예시1
		for (int i = 5; i < 4; i++) {

		} // for문의 잘못된 예시2
		for (int i = 0; i > 4; i++) {

		} // for문의 잘못된 예시3
		for (int i = 0; i < 4; i = i + 3) {

		}

		// for문을 사용하는 형식1
		for (int i = 0; i < 5; i++) {

		} // for문을 사용하는 형식2
		for (int i = 1; i <= 5; i++) {

		} // for문을 사용하는 형식3 // 음수,양수의 좌표 프로그램 짤때 사용
		int n = 5;
		for (int i = -n; i <= n; i++) {

		}
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		
		int n = 7;
		for (int i = 1; i <= 10; i++) {
			System.out.println(n+" * "+i+" = "+i*n);
		}
		

	}

*/
	
	
/*
// ex9) switch 문
public class Hello {
	public static void main(String[] args) { 
		// 1번. case뒤에는 변수가 올 수 없다.
		// 2번. switch안에는 변수를 넣을 수 있다.
		// 3번.default,break는 생략할 수 있다.
		// 4번. 의도적인 경우에는 break를 생략할 수 있다.
		// 5번. case분기에서실행되는는 문장이 1문장 이상일경우 일반적으로 블록처리를 함
		int num = 10;
		switch (10) {
		case 10: {
			System.out.println(1);
			break;
		}
		case 20: {
			{
				System.out.println(2);
				System.out.println(100);
				break;
			}
		}
		case 30: {
			System.out.println(3);
			break;
		}
		default:
			System.out.println(4);
		}
	}

}
*/


/*
	// ex8) 
	public class Hello {
 		public static void main(String[] args) { 
 	//1 번.if문
 	 if(true){
 	 	System.out.println(1);
 	 };
 	 if(false){
 	 	System.out.println(2);
 	 }

	// 2번. if-else문
	if(false){
		System.out.println(5);
	}else{
		System.out.println(6);
	}

	// 3번. *****삼항연산******
	int a = 10;
	int b = 5;
	int c;if(a>b)
	{
		c = 7;
	}else
	{
		c = 8;
	}System.out.println(c);

	c=a>b?7:8;System.out.println(c);

	if(a>b)
	{
		System.out.println("호랑이");
	}else
	{
		System.out.println("코끼리");
	}

	System.out.println(a>b?"호랑이":"코끼리");

	// 4번. else-if문 (n개중에 1개) // switch 문으로 바꿀 수 있으면 바꾸는게 좋음
	int num = 83;

	if(num>=90)
	{
		System.out.println("A");
	}else if(num>=80)
	{
		System.out.println("B");
	}else if(num>=70)
	{
		System.out.println("C");
	}else if(num>=60)
	{
		System.out.println("D");
	}else
	{
		System.out.println("F");
	}

}
}
*/ 

/*
// ex7)
public class Hello {
	public static void main(String[] args) { 
	// 변수사용방법
  
 // 1) 
	int a; 
	a = 10; S
	ystem.out.println(a);
  
  // 2) 
	int b,c,d; 
	b = 1; 
	c = 2; 
	d = 3; 
	System.out.println(b+c+d);
  	System.out.println(b+" "+c+" "+d);
  
  
  // 3) 
  int e = 10; 
  int f = 20, g = 30; 
  int h, i = 40, j; 
  h = 50; 
  j = 60;
  System.out.println(e+" "+f+" "+g); 
  System.out.println(i+" "+h+" "+j);
  
  // 4) 
  int a10; 
  a10 = 10; 
  System.out.println(a10); 
  a10 = 20;
  System.out.println(a10);
  
  // 5) // swap프로그램 
  int aa = 88, bb = 99; 
  int temp;
  
  System.out.println(aa); System.out.println(bb);
  
  temp = aa; //temp = 88 
  aa = bb; // aa = 99 
  bb = temp; // bb = 88
  
  System.out.println(aa); 
  System.out.println(bb);
  
  // 6) 
  // 5,6 동일 
  int cc = 100, dd = 200; 
  int tt = cc; cc = dd; dd = tt;
  System.out.println(cc); 
  System.out.println(dd);
  
  // 7) 
  int a1 = 17, b1 = 3; 
  System.out.println(a1+b1);
  System.out.println(a1-b1); 
  System.out.println(a1*b1);
  System.out.println(a1/b1); 
  System.out.println(a1%b1);
  
  System.out.println(a1>b1); 
  System.out.println(a1>=b1);
  System.out.println(a1<b1); 
  System.out.println(a1<=b1);
  System.out.println(a1==b1); 
  System.out.println(a1!=b1);
  
  // 산술연산이 비교연산보다 우선순위에 있음, 그리고 혹시 논리 연산이 있으면 그 다음에 논리연산이 일어남 
  // 산술 -> 비교 ->논리연산 순서로 우선순위 
  System.out.println(a1>b1*7);
  
  System.out.println(a1>b1*7||a1-10>b1);
  
}
}
*/


/*
  // ex6) 
	public class Hello {
		public static void main(String[] args) {
			byte apple;
			apple = -128;
			System.out.println(apple);
			System.out.println(Byte.MIN_VALUE);
			System.out.println(Byte.MAX_VALUE);
			short banana;
			banana = 30000;
			System.out.println(Short.MIN_VALUE);
			System.out.println(Short.MAX_VALUE);
			System.out.println(banana);
			int orange;
			orange = 2000000;
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println(orange);
			long melon;
			melon = 999999999;
			System.out.println(Long.MIN_VALUE);
			System.out.println(Long.MAX_VALUE);
			System.out.println(melon);

			float tiger; // 4byte tiger = 3.14f; System.out.println(tiger); double lion;
			// 8byte lion = 3.14; System.out.println(lion);

			char cat; // 양수만 쓸 수 있음 cat = '한';
			System.out.println((int) Character.MIN_VALUE);
			System.out.println((int) Character.MAX_VALUE);
			System.out.println(cat);

			boolean dog;
			dog = true;
			System.out.println(dog);

		}
	}
*/


/*
// ex5)
public class Hello {
	public static void main(String[] args) {
		System.out.println(10); // 숫자출력
		System.out.println('한'); // 문자출력
		System.out.println("호랑이"); // 문자열출력
		System.out.println("1000"); // 문자열출력

		System.out.println(10 + 20); // 숫자+숫자(산술연산)
		System.out.println(10 + "호랑이"); // 문자열 연결(결과는 문자열)
		System.out.println("호랑이" + "10"); // 문자열 연결(결과는 문자열)
		System.out.println("호랑이" + "코끼리"); // 결과는 문자열 연결
		System.out.println(10 + "호랑이" + 20); // 결과는 문자열 연결
		System.out.println(10 + 20 + "호랑이"); // 결과는 문자열 연결
		System.out.println("호랑이" + 10 + 20 + "호랑이"); // 왼쪽부터 하나씩 연결
		System.out.println(10 + "    " + 20); // 숫자 두개를 한 라인에 쓰고싶을때 사용
	}
}
*/


/*
  // ex4) 
	public class Hello {
		public static void main(String[] args) { // 논리연산
			System.out.println(false || true);
			System.out.println(true || false);
			System.out.println(false || false);
			System.out.println(true || true);

			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(false && false);
			System.out.println(true && true);

			System.out.println(true & true & false);
			System.out.println(false | false | true);

			// &,|는 같이쓰면 안됨, 괄호로 구분지어서 쓰는건 가능 System.out.println(false & (false | true));

			System.out.println(3 > 2 | false | 6 <= 3);

			// 부정연산자 System.out.println(!true);

			System.out.println(!(3 > 2));

		}
	} 
*/

/*
 // ex3) 

	public class Hello {
		public static void main(String[] args) { // 비교연산(관계연산)
			System.out.println(5 > 3);
			System.out.println(5 >= 3);
			System.out.println(5 < 3);
			System.out.println(5 <= 3);
			System.out.println(5 == 3);
			System.out.println(5 != 3);
		}
	}
*/
	
/*
  // ex2) 
	public class Hello {
		public static void main(String[] args) { // 산술연산
			System.out.println(20 + 3);
			System.out.println(20 - 3);
			System.out.println(20 * 3);
			System.out.println(20 / 3);
			System.out.println(20 % 3);
			System.out.println(3 + 2 * 4);
			System.out.println((3 + 2) * 4);
		}
	} 
*/

/*
// ex1)
public class Hello {
	public static void main(String[] args) {

		System.out.println("1000");
	}
}
*/