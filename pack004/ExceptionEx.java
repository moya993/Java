package pack004;



// Exception(예외처리), try-catch문이랑 같이 사용
// Exception은 문제가 발생했다는 걸 프로그램에 알리는 역할
// 이 때 try-catch문으로 실행을 계속할건지 말건지 알려야함
// 프로그램을 중단시키는게 목적이 아님


/*
// 1)	Exception 3가지 내용
public class ExceptionEx {

	public static void main(String[] args) {
		// 1번째 Exception
		System.out.println(1);
		try {
			int a = 10/0;
		} catch (Exception e) {
			e.printStackTrace();	// 에러의 발생 근원지를 찾아 단계별로 에러를 출력함
		}
		System.out.println(2);
		
		System.out.println("------------");
		
		// 2번째 Exception
		// ArrayIndex(OutofBounds)Exception - 범위를 넘었을 경우
		// try-catch문을 사용하면 적어도 프로그램이 중단되지는 않음
		int[]ar = {1,2,3};
		try {
			ar[3] = 10;
		} catch (Exception e) {
			e.toString();	// 에러의 Exception 내용과 원인 출력
		}
		System.out.println(3);
		
		System.out.println("------------");
		
		// 3번째 Exception
		// (NullPointer)Exception
		String s = "무궁화꽃이피었습니다.";
		System.out.println(s.length());
		s = null;
		try {
			System.out.println(s.length());	// s에 null값이 들어가 있어 원래 에러뜸
		} catch (Exception e) {		// Exception을 안쓰면 오류가 떠서 다음께 출력이 안됨
			// TODO: handle exception
		}
		System.out.println(4);
		
	}

}
*/



/*
// Exception, try-catch문을 사용하는 이유
// throw랑 try-catch문은 한 쌍임
class Tiger{
	// 1번. try-catch문
	void m1() {
		System.out.println(1);
	
	try {
		throw new Exception();	// 일부로 Exception을 발생시키는 코드
	} catch (Exception e) {		// throw에는 반드시 try-catch문과 함께 써야함
		System.out.println("Exception이 발생함");
	}
	
}
	// 2번. try-catch문 없이 Exception 에러를 없애는 방법
	// 함수 이름 뒤에 throws Exception 에러를 넣음
	// 이 방법은 이 함수를 사용하는 사람이 알아서 try-catch문을 써봐서 확인하라는 말
	// 예외떠넘기기, 책임전가
	void m2() throws Exception{
		System.out.println(2);
		throw new Exception();
	}
}

public class ExceptionEx 
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
			System.out.println("2번의 Excpetion발동");
		}
		System.out.println(3);
		
		// Thread
		// unhandle Exception 에러가 뜬다면 try-catch문쓰셈 그럼 끝
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try { Thread.sleep(2000); } catch (Exception e) {}
		}
		
		
	}
}
*/


/*
// try-catch에 finally를 사용하는 이유
class Tiger{
	void m1(int a, int b) {
		if(a>b) {
			System.out.println(1);
		}else {
			return;
		}
		System.out.println(2);
	}
	
	void m2(int a, int b) {
		if(a>b) {
			System.out.println(1);
		}else {
			return;
		}
		System.out.println(2);
		try {
			if(a>b) {
				System.out.println(1);
			} else {
				return;
			}
			System.out.println(2);			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println(2);
			
}
	}
}


public class ExceptionEx {
	public static void main(String[] args) {
		
		try {
			int a = 10 / 1;
		} catch (Exception e) {
			// TODO: handle exception
		}finally {	// finally : try문과는 별개로 무조건 실행되게 하는 코드
			System.out.println(2);
		}
		
		System.out.println("------------");
		
		
		Tiger t1 = new Tiger();
		t1.m1(3, 4);
		t1.m1(6, 1);
	}

}
*/














