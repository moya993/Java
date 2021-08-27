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
		
		// ���� switch���̶� �Ȱ��� ����� ��Ÿ��
		// ��ĳ���� ����� ��
		Animal[] t3 = new Animal[] {new Dog(), new Cat(), new Sneak()};		// �ڿ��� �����Ͱ� �ʱ�ȭ ��
		for (int i = 0; i < 10; i++) {
			t3[rn.nextInt(3)].cry();	
			
		}
		
		
		
		
	}
}







/*
// ex36)	���� �߻� �ڵ�
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
// ex35)		�迭 
public class Hello {
	
	public static void main(String[] args) {
	
		int a=10;

		// �迭 ���� 
		int [] ar = new int[5]; 			// �ڡڡ� �迭�� ÷�� "0 ~ �迭�� ����-1" ���� ��밡��
		int [] br = new int[]{1,2,3,4,5};   // 
		int [] cr = {10,20,30,40,50};		// ���� ���� ��� ���� ���X

		System.out.println(ar.length); // �迭�� ���� Ȯ��

		for (int i = 0; i < br.length; i++) {
			System.out.print(br[i]+" ");
		} System.out.println();

		// ����ȭ �� ���� foreach ++ ������ �κ�
		// ���� x,data,value ���̾���.

		for (int x : cr) {   
			System.out.print(x+" ");
		}
		
		cr[0]=100;
		cr[4]=200;

		//cr[5]=300; ��ȿ�������
		//cr[-1] =100;

	
		int num =3;
		ar[num] = 500;

		//ar[num*3-5] =0;// �����ؼ� ��밡�� ! ������ ��ȿ������ ����ߴ�

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
		ss[0] ="ȣ����";
		ss[1] ="�޹���";
		ss[2] ="�ϸ�";
		ss[3] ="�䳢";

		for(int i=0 ; i< ss.length ; i++){
			System.out.print(ss[i]+" ");
		}
		System.out.println();
		
		System.out.println("===================================================");
		
		String [] st = new String[]{"�عٶ��","���޷�","�ε鷹"};

		String S1 = "ȣ����";				 // ���� ���
		String s2 = new String("������"); // ������ ���
		String [] su = new String[]{new String("�عٶ��"),new String("���޷�"),new String("�ε鷹")};

		for(int i=0 ; i< st.length ; i++){
			System.out.print(st[i]+" ");
		}
		System.out.println();
		
	}
}
*/






/*
// ex34)	��ĳ���� ����************�ʵ�***************
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


class Zoo{
	
	void sound(Dog t) {
		t.cry();	
	}
	void sound(Cat t) {	// �����ε�
		t.cry();
	}
	void sound(Sneak t)	{	// �����ε�
		t.cry();
	}
	
	
	// solid ��Ģ 5������ - ����-��� ��Ģ
	// ��� Ȯ�忡�� ���������� �ڵ带 �����ϴ� ���� �����ִ�.
	void sound(Animal t) {		// ��ĳ������ ���� ���� ���� 3�� �ּ�ó�� �Լ��� ��� �߰� �����ְ� Animal�μ��� �����鼭 �� ���� ����
		t.cry();
	}
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		// ��ĳ����(��-�θ�, ��-�ڽ� ����)
		Animal t1 = new Dog();
		Animal t2 = new Cat();
		Animal t3 = new Sneak();
		
		t1.cry();
		t2.cry();
		t3.cry();	// �ڽ�Ŭ������ cry�Լ��� ���� ������ �θ��� �Լ��� �����ٰ� ȣ����
		
		///////////////////////�� �Ʒ��� ������ ��ĳ���� �� ������?////////////////////////
		
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
		Animal t3 = new Tiger();	// case3 : ��ĳ����(��-�� ����)
	//	Tiger t4 = new Animal();	// case4 : �ٿ�ĳ����
			
		t3.m1();	// m2�޸𸮴� ������ m2������ ������ ����
		
		t3.m3();	//  �Լ��� ȣ���ϱ� ���� ������ �ڽĿ��� m3�� ������ �ڽ��� m3�� ȣ���ϰ� ������ �θ��� m3�� ���
		
		
	}
}
*/







/*
// ex32)	��Ӱ��迡���� ������
class Animal{
	Animal(){
		System.out.println("�θ������ ��");
	}
	Animal(int n){
		System.out.println("�θ������" + n);
		
	}
}

class Tiger extends Animal{
	Tiger(){
		// ���� ���ο� �ڵ尡 1���� �����Ǿ� �ִ�.  �װ� [ super(); ] ��
		super();	// �θ��� �����ڸ� call ��Ű��� ��, super();�� ������ �ȿ����� ��밡��
		System.out.println("ù ��° �ڽĻ�����");
		
	}
	Tiger(int num) {
		super(num+100);		// super�� �ݵ�� ù �ٿ� �;���
		System.out.println("2���� �ڽ� ������");
		
	}
	Tiger(int a, int b) {
		super(a*b);		// super�� �ݵ�� ù �ٿ� �;���
		System.out.println("3���� �ڽ� ������");
		
	}
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();
		Tiger t2 = new Tiger(); 	// �ڽĻ����ڰ� ���� call�� �ǰ� �θ�����ڰ� call �� 
		Tiger t3 = new Tiger(3, 4); 	 
		
	}
}

*/







/*
// ex31)	���
class Animal{	// �θ� Ŭ����
	void m2() {
		System.out.println(2);
	}
	
	void m3() {
		System.out.println(31);
	}
	
}

class Tiger extends Animal{		// �ڽ� Ŭ����		Tiger -> Animal �ڽ��� �θ������� 
	void m1() {
		System.out.println(1);
	}
	
	void m3() {
		System.out.println(32);
	}
	
	void m4() {
		m3();	// �ڱⰡ ������ �ִ� �Լ� m3�� ȣ��************
		super.m3();		// �θ��Լ��� m3�� ȣ��************ ���������� ��ȸ�ؼ� �θ� ȣ��
		System.out.println(4);
	}
	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		Animal t1 = new Animal();	// Animal�� ��� ��Ӱ� ����x
		Tiger t2 = new Tiger();
		t2.m1();
		t2.m2();	// t2. �ϸ� ���� Tiger Ŭ�������� ���� �Լ��� ã��
		t2.m3();	// �θ�� �ڽ��� ������ �Լ��� ������ ������ �ڱ� Ŭ������ �Լ��� ���� ���
		System.out.println("----------------");
		t2.m4();	// �θ��� �Լ� m3�� ȣ���Ϸ��� ���������� ����
		
		
		
	}
}
*/







/*
// ex30)	�����Լ�
public class Hello 
{
	public static void main(String[] args) 
	{	
		// ���밪
				int v1 = Math.abs(-5);
				double v2 = Math.abs(3.14);
				System.out.println(v1);
				System.out.println(v2);
				
				// �ø���
				double v3 = Math.ceil(5.3);
				double v4 = Math.ceil(-5.3);
				System.out.println(v3);
				System.out.println(v4);
				
				// ������
				double v5 = Math.floor(5.3);
				double v6 = Math.floor(-5.3);
				System.out.println(v5);
				System.out.println(v6);
				
				// �ִ밪
				double v7 = Math.max(5, 9);
				double v8 = Math.max(5.3, 2.5);
				System.out.println(v7);
				System.out.println(v8);
				
				// �ּҰ�
				double v9 = Math.min(5, 9);
				double v10 = Math.min(5.3, 2.5);
				System.out.println(v9);
				System.out.println(v10);
				
				// ������
				double v11 = Math.random();
				System.out.println(v11);
				// return ���� 0.0 <= v11 < 1.0
				
				// ����� ������ �Ǽ���
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

// static�Լ� �ȿ����� static����� ��� ����
class Tiger{
	static void myMain() {
		Tiger t = new Tiger();	//�ڱ� class �ȿ��� �ڽſ� ���� ��ü ���� ����
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
		System.out.println("1����");
	}
	
	
	public static void main(String[] args)		// void main�� �Լ� �̸�,void ���� static�� ������ ��ü ������ ���� �ʴ��̻� ȣ�� �Ұ���
	{	
		System.out.println(num);
		
		Hello h = new Hello();
		
		h.m1();
		h.m2();
		Hello.m1();
	//	Hello.m2();
		
	}
	
	void m2() {
		System.out.println("2����");
	}
	
	
}
*/





/*
// ex28)	static


// static�� ��ü�����ؼ� ����� �����ϴ� ���� �Ƴ��� ���� ���
class Tiger{
	int num1;
	static int num2 = 100;	// static ������ class ���ٵ� �� ���� �ö�(����ž ���)
	
	static void m1() {
		System.out.println("static �Լ� ��");
	}

	
}

public class Hello 
{
	public static void main(String[] args) 
	{	
		System.out.println(Tiger.num2);		// static�� class�̸�.�����̸����� ��ü���� ���ϰ� ȣ�� ����
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.num1);
		System.out.println(t1.num2);
		
		t2.num2 = 200;
		System.out.println(t1.num2);
		
		System.out.println(Tiger.num2);		// ���� static�� ���� ��Ģ
	
		Tiger.m1();

		
		
		// static����
		System.out.println(Math.abs(10));
		
		
	}
}
*/








/*
// ex27)	������ ���� ��
class Car{
	int fuel = 100;	
	String name;
	
	Car(){
		name = "����";
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
		System.out.println(name+" ���� �޸���.");
		fuel -= 30;
	}
	
	void stop() {
		fuel -= 10;
		System.out.println(" ���� �����");
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
		Car car2 = new Car("����", 200);
			
		car1.move();
		car1.show();
		car2.move();
		car2.show();
		
	}
}
*/








/*
// ex26)	������ ����
class Tiger{	// class �ȿ� �ƹ��͵� ������ �˾Ƽ� default �����ڸ� ����
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
// ex25)	������

// 1. �����ڴ� �Լ��̴�. ������ (������ �Լ�)��� ��
// 2. �Լ� �̸��� Ŭ�����̸��� �ݵ�� �����ؾ� ��
// 3. ������ �Լ��� ���ϰ��� ���� �� ����. �׷��� void ������ ������
// 4. ������ �Լ��� �����ε��� ������
// 5. ��ü�� ������ �� �� �� �� ȣ���(���Ƿ� ȣ�� �Ұ���)
// 6. �����ڸ� ����ϴ� ������ ��� �޼ҵ带 �ʱ�ȭ ��Ű�� �������� ���
// 7. ������ �Լ��� �ۼ����� �����ÿ��� �ڵ����� default�����ڰ� �������

class Tiger{	
	int age = 20;	// �ʵ忡�� �̸� ���� �����ϰ� ����ϴ°� �ȵǳ�? ������ �׷��� ��ü�� �����Ǵ� ��� age�� 20�� ��
	String name = "ȫ�浿";
	Tiger(){	// default������,	���� �ʱ�ȭ �ϱ� ���� �ַ� ���
		System.out.println("������ ��");
		System.out.println("�����ڰ� ȣ��Ǿ���.");
		// age = 20;
		// name = "ȫ�浿";
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
		Tiger t1 = new Tiger();		//new �ڿ��ִ� Tiger�� �����ڸ� ȣ����
		Tiger t2 = new Tiger();		// ��ü�� �����ɶ����� �����ڰ� ȣ��� 		
		Tiger t3 = new Tiger(100,"������");
		Tiger t4 = new Tiger(200,"�޹���");
				
		t1.showInfo();
		t2.showInfo();
		t3.showInfo();
		t4.showInfo();
		
		
	}
}
*/






/*
// ex24) ¥����~	
public class Hello 
{
	public static void main(String[] args) 
	{	
		int a = 100;
		// ���ڿ��� ��ȯ �ϰ� �������( Integer.soString() )
		String s1 = Integer.toString(a);
		System.out.println(s1+200);		// ���ڿ� ó��
		// sugar code
		String s2 = ""+a;	// ���ڿ� ó��
		System.out.println(s2);
		
		String s3 = "456";
		int b = Integer.parseInt(s3);	// parseInt�� ������ �м��Ѵ�, �ؼ��Ѵ�
		System.out.println(b+100);
	}
}
*/




/*
// ex23)	�����ε�
class Tiger{
	// �Լ� �����ε�, �Լ� �����Ƕ�� �Ҹ�
	// ���޵Ǵ� �Լ��� ������ �ٸ�����, Ÿ���� �ٸ� �� �Լ� �̸��� �ٸ��� ��� ����	
	void method01() {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(1);
	}	
	
	void method01(int a) {		// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(2);
	}
	
	void method01(int a, int b) {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(3);
	}
	
	void method01(String a, int b) {	// �Լ� �̸��� ������ �̸����� ���� ����
		System.out.println(4);
	}
	
	
	// �Լ� �̸��� �Ȱ��� �����ȴٸ� �����ε�, ������
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
		t1.method01("ȣ����", 1);
	}
}
*/






/*
//ex22)		�ݺ��� continue, break
public class Hello 
{
	public static void main(String[] args) 
	{	
		for (int i = 0; i < 10; i++) {
			if(i < 3) {
				continue;	// for������ continue�� ������ �ٷ� i++�� ��
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}
		System.out.println("ȣ����");
		
		
		System.out.println("-------------------------");
		
		int num = 0;
		while(true) {
			num++;
			if(num == 10) {
				System.out.println("ȣ����"+num);
				break;
			}			
			if(num%2 == 0) {
				System.out.println("�ڳ���"+num);
				continue;
			}
		}
		
		
		
		
	}
}

*/







/*
//ex21)		***********�ʵ�*************8
class Tiger{
	int m1(int a, int b) {

		if(a>b) {
			return 100;
		} else {
			System.out.println("ȣ����");
			// return 200; or 
		}
		return 500;
	}
	
	void m2() {
		System.out.println(1);
		return;		// �Լ��� ���� �ߴ��� ��
		// System.out.println(2);
	}
	
	void m3(int num) {
		for (int i = 0; i < 10; i++) {
			if(i == num) {
				System.out.println("ã�Ҵ�.");
				return;		// �Լ��� ���� �ʰ� �Ϸ��� return �� ���	
			}
		}
		System.out.println("�˻������� ã�� ����");
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
// ex20)	**************�ʵ�**************
class Tiger{
	String m1() {
		return "������"; 
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
		
		
		// return �Ǵ°��� Lion ��ü�̱� ������ ����
		t1.m3(new Lion()).show();;
		
	}
}

*/




/*
// ex19)
class Tiger{
	// ����!!! �μ������� �� int a,b�� �ȵ�
	void m1(int a, int b) {		// �μ������� ������ ����
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
		System.out.println("����");
	}
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		String s1 = "ȣ����";		// String�� Java���� ������� ǥ�� Ŭ����
		System.out.println(s1);
		System.out.println(s1.length());
		
		
		Tiger t1 = new Tiger();
		
		
		
		t1.m1(3,4);

		t1.m2(10, 'F', false, 3.14f, "��������");
		
		
		
		Lion t2 = new Lion();	// Lion Ŭ���� ��ü ����
		System.out.println(t2.hashCode());
		
		t1.m3(t2);	
		
		
		// Lion a�� new Lion()
		t1.m3(new Lion());		
		
	}
}
*/






/*

// ex18)

// Ŭ���� ����
class Tiger
{
	// merry��� �޼ҵ� ���� = �Լ���� �Ҹ�
	// ���� ���Ǵ� �ڵ带 �ҷ��� �����
	// �Լ��� ������ 4����
	
	// 1. �μ�����x
	void merry() {
		System.out.println("��");
	}
	
	// 2. �μ�����o
	// int num = 3
	void happy(int num) {	
		for (int i = 0; i < num; i++) {
			System.out.println('��');
		}
	}

	// 3. return o, void�� ���ϰ��� �� �� ����
	int turtle() {
		System.out.println("�ź��� call");
		return 15;
	}

	// 4. �μ�����o, return o
	int fish(int num) {
		int n = num*3;
		return n;
		
		
	}
	
	
	
	
}


public class Hello 
{
	public static void main(String[] args) 
	{	
		Tiger t = new Tiger();		// new ��ü��() + Ctrl,1
		
		//1 
		t.merry();	// �Լ��� call(ȣ��)�� ��
		t.merry();
		t.merry();
		
		for(int i = 0; i < 10; i++) {
			t.merry();
		}
		
		// 2
		System.out.println("--------------------");
		t.happy(3);		// �μ�����
		
		System.out.println("--------------------");
		// 3
		int num = t.turtle();	// return���� ������ �����ؼ� �Ʒ����� ���
		System.out.println(num);
		System.out.println(t.turtle());	// return���� �ٷ� ���� ��
		
		// 4
		int cnt = t.fish(7);
		System.out.println(cnt);
		System.out.println(t.fish(345));
		
		
		
		//     �Լ��� ����
		// return��   �μ�����
		//    x         x
		//    x         o
		//    o         x
		//    o         o
		
		
	}
}

*/









/*
// ex17)	**********classŬ����************

class Tiger{
	// �ʵ� : Ŭ���� �ȿ��� �����Ǵ� ����(�ʵ�, ���, ���� 3���� �̸����� �Ҹ�) 
	int a;
	int b = 20;
	int c,d = 30;
	// ������ 
	// �޼ҵ� 
}




public class Hello 
{	
	public static void main(String[] args) 
	{	
		// ��ü ���� ���, �Ǿ�(Tiger)�� �ǵ� (Tiger)�̸��� �׻� ���ƾ���
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		// �ʵ带 ����ϱ� ���ؼ��� (��ü.�ʵ��)    
		// ex)t1.a
		t1.a = 100;
		t1.c = t1.a+30;
		System.out.println(t1.a);
		System.out.println(t1.b);
		System.out.println(t1.c);
		System.out.println(t1.d);
		System.out.println(t2.c);
		
		// ��� ��ü�� �����Ǹ� �ݵ�� �ڱ��ڽ��� ������ȣ�� �߱޹޴´�.
		// ������ȣ�� Ȯ���ϴ� ��� (��ü.hashCode())
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
		// t3�� t3�� �޸𸮸� ������(����)
		// �ٸ� �̸������� ������ �޸� ����
		Tiger t3;
		t3 = t2;	
		System.out.println(t3.hashCode());	// t3�� t2�� �ؽð��� ����
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
		b = a++; 	// ���� ���� ������ �Ͼ, a�� ������ �ִ� ���� �����ϰ��� a�� ������
		System.out.println(a+" "+b);
		System.out.println(String.format("%d %d", a, b));
				
		int c = 10, d;
		d = ++c;	// ���� ���� ������ �Ͼ, c�� ������Ű�� d�� ����
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
		int a = 10;		// �����ؼ� ���� �ڸ��� �ִ� 10�� ���ͷ��̶�� �θ�
		int b = 20;
		short c = 30;
		b = (int)c;	// Ÿ�� ĳ����
		
	
		
		int num = 10;
		num = num + 3;
		num+=3;		// �������� ������ �ϴ� �ӵ��� �� ����
		
		
		
		int a1 = 0, a2 = 0;
		a1 = a2 + 3;
		
		
		
		int t = +1;		// ���ڿ� +�� �ִ� ������ �ڸ����� ������ ��
		int u = -1;
		int k = 0;
		k+=3;
		k = 3;
		
		
		
		int d = 0;
		d++;	// �ӵ��� ���� ����
		System.out.println(d);
		++d;	// �ӵ��� ���� ����
		System.out.println(d);
		d=d+1;	// �������� ���� �ӵ��� ����
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
				System.out.println("Ż���ϱ� ����");
				break;
			}
			
	}
			
			// �ݺ�Ƚ���� �𸣴� ���α׷�
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
// ex13)	while��
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
		//System.out.println("ȣ����");
		
		// 3. while
		int a = 0;
		while(true) {
			System.out.println(a);
				if(a == 5){
				System.out.println("Ż���ϱ� ����");
				break;
			}
			a++;
		}
		
		
		
	}
	
}
*/



/*
// ex10)   for��  =  for(�ʱ�;����;����){}

public class Hello {
	public static void main(String[] args) {
		System.out.println(1000);
		int num = 10;
		num = num + 3;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num++; // �ڽ��̰����� �ִ� ���� 1������Ű�� ���׿�����(++)
		System.out.println(num);
		num--; // �ڽ��� ������ �ִ� ����1���ҽ�Ű�� ���׿�����(--)
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);

		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("ȣ����" + i);
		}

		// for���� �߸��� ����1
		for (int i = 5; i < 4; i++) {

		} // for���� �߸��� ����2
		for (int i = 0; i > 4; i++) {

		} // for���� �߸��� ����3
		for (int i = 0; i < 4; i = i + 3) {

		}

		// for���� ����ϴ� ����1
		for (int i = 0; i < 5; i++) {

		} // for���� ����ϴ� ����2
		for (int i = 1; i <= 5; i++) {

		} // for���� ����ϴ� ����3 // ����,����� ��ǥ ���α׷� ©�� ���
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
// ex9) switch ��
public class Hello {
	public static void main(String[] args) { 
		// 1��. case�ڿ��� ������ �� �� ����.
		// 2��. switch�ȿ��� ������ ���� �� �ִ�.
		// 3��.default,break�� ������ �� �ִ�.
		// 4��. �ǵ����� ��쿡�� break�� ������ �� �ִ�.
		// 5��. case�б⿡������Ǵ´� ������ 1���� �̻��ϰ�� �Ϲ������� ���ó���� ��
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
 	//1 ��.if��
 	 if(true){
 	 	System.out.println(1);
 	 };
 	 if(false){
 	 	System.out.println(2);
 	 }

	// 2��. if-else��
	if(false){
		System.out.println(5);
	}else{
		System.out.println(6);
	}

	// 3��. *****���׿���******
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
		System.out.println("ȣ����");
	}else
	{
		System.out.println("�ڳ���");
	}

	System.out.println(a>b?"ȣ����":"�ڳ���");

	// 4��. else-if�� (n���߿� 1��) // switch ������ �ٲ� �� ������ �ٲٴ°� ����
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
	// ���������
  
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
  
  // 5) // swap���α׷� 
  int aa = 88, bb = 99; 
  int temp;
  
  System.out.println(aa); System.out.println(bb);
  
  temp = aa; //temp = 88 
  aa = bb; // aa = 99 
  bb = temp; // bb = 88
  
  System.out.println(aa); 
  System.out.println(bb);
  
  // 6) 
  // 5,6 ���� 
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
  
  // ��������� �񱳿��꺸�� �켱������ ����, �׸��� Ȥ�� �� ������ ������ �� ������ �������� �Ͼ 
  // ��� -> �� ->������ ������ �켱���� 
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

			char cat; // ����� �� �� ���� cat = '��';
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
		System.out.println(10); // �������
		System.out.println('��'); // �������
		System.out.println("ȣ����"); // ���ڿ����
		System.out.println("1000"); // ���ڿ����

		System.out.println(10 + 20); // ����+����(�������)
		System.out.println(10 + "ȣ����"); // ���ڿ� ����(����� ���ڿ�)
		System.out.println("ȣ����" + "10"); // ���ڿ� ����(����� ���ڿ�)
		System.out.println("ȣ����" + "�ڳ���"); // ����� ���ڿ� ����
		System.out.println(10 + "ȣ����" + 20); // ����� ���ڿ� ����
		System.out.println(10 + 20 + "ȣ����"); // ����� ���ڿ� ����
		System.out.println("ȣ����" + 10 + 20 + "ȣ����"); // ���ʺ��� �ϳ��� ����
		System.out.println(10 + "    " + 20); // ���� �ΰ��� �� ���ο� ��������� ���
	}
}
*/


/*
  // ex4) 
	public class Hello {
		public static void main(String[] args) { // ������
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

			// &,|�� ���̾��� �ȵ�, ��ȣ�� ������� ���°� ���� System.out.println(false & (false | true));

			System.out.println(3 > 2 | false | 6 <= 3);

			// ���������� System.out.println(!true);

			System.out.println(!(3 > 2));

		}
	} 
*/

/*
 // ex3) 

	public class Hello {
		public static void main(String[] args) { // �񱳿���(���迬��)
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
		public static void main(String[] args) { // �������
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