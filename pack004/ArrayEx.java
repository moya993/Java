package pack004;




// 배열
public class ArrayEx {

	public static void main(String[] args) {
		int a = 10;
		// 배열 사용법
		int[] ar = new int[5];	// 개수가 5개인 배열 생성
		int[] br = new int[] { 1, 2, 3, 4, 5 };
		int[] cr = { 10, 20, 30, 40, 50 };	// 가장 쉬운 방식, 실전 사용x
		System.out.println(ar.length);	// 배열의 개수
		System.out.println();
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]+ "");
		}System.out.println();
		
		// 간략화 된 for문 foreach ++ 생략된 부ㅜㄴ
		// 변수로는 x, data, value를 주로 씀
		for (int x : cr) {
			System.out.println(x+" ");
		}System.out.println();
		
		cr[0] = 100;
		cr[4] = 100;
	
		int num = 3;
		ar[num] = 500;
		ar[2] = 3;
		ar[ar[2]] = 999;
		System.out.println(ar[2]+" "+ar[3]);
		ar[ar[3]-998]=888;
		for (int x : ar) {
			System.out.println(x+" ");
		}System.out.println();
	
		System.out.println("===================================================");
		
		// 문자열
		String[] ss = new String[4];
		ss[0] = "호랑이";
		ss[1] = "앵무새";
		ss[2] = "하마";
		ss[3] = "토끼";
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]+ " ");
		}System.out.println();
		
		System.out.println("===================================================");
		
		
		String [] st = new String[] {"해바라기", "진달래", "민들래"};
		String s1 = "호랑이";		// 간편 방법
		String s2 = new String("독수리");	// 정석 방법
		String [] su = new String[] {new String("해바라기"), new String("진달레"),new String("민들레")};
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]+ " ");
		}
		System.out.println();
		
		
	}

}
