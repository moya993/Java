package pack004;


/*
// String 클래스가 가지고 있는 것들
// String 데이터를 변경시킬 수 없다.
public class StringClassEx {

	public static void main(String[] args) {
		String s = "무궁화꽃이피었습니다";
		
		// 1. String.length();
		// 글자 길이 출력
		System.out.println(s.length());
		System.out.println();
		
		// 2. chartAt(int index);
		// index에 인수전달을 해주면 char타입으로 리턴됨
		// index 번호에 있는 글자를 출력함
		System.out.println(s.charAt(3));	// 3번 인덱스 문자를 출력
		
		// 3.indexOf(String str)
		// str에 해당하는 인덱스 번호를 출력
		// 못찾으면 -1로 출력
		System.out.println(s.indexOf("화꽃이"));
		System.out.println(s.indexOf("목꽃이"));
		System.out.println();
		
		int n = s.indexOf("화꽃이");
		if(n != -1) {
			System.out.println(n+"번째");
		}else {
			System.out.println("not found");
		}
		System.out.println();
		
		
		// 4. String.replace(CharSequence target, CharSequence replacement)
		// 주의!!! : 원본 데이터가 변경되었는가 확인
		// 앞에는 입력받는 타겟, 뒤가 대체할 글자
		System.out.println(s.replace("꽃이", "나무가"));
		System.out.println(s);
		// String은 데이터를 변경할 수 없음!!!!!!!!!!!!
		// 데이터 변경이 아니라 객체가 변경된거임!!!!!!!!!!
		// s = "대한민국";	// 이거는 s가 변경된게 아니라 새로운 s를 생
		System.out.println();
		
		
		// 5. String.substring(int beginIndex)
		// 슬라이싱
		// 숫자 자리부터 마지막까지 잘라서 출력
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		System.out.println("--------------------");
		
		// 6. String.trim()
		// 아이디 비번 로그인할 때 주로 사용
		// 앞 뒤의 공백 제거
		String s2 = "   App   le   ";
		System.out.print(s2.trim());
		System.out.println("호랑이");
		
		System.out.println("--------------------");
		
		// 7. 
		// String.toUpperCase()
		// String.toLowerCase()
		// 대문자로 만들어 줌, 소문자 만들어줌
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		
		// 8. 데이터를 받았을 때 사용
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length);
		System.out.println(s4);		// 문자열로 변환됨
		
		// 데이터를 전솧할 때 사용
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
 
		
	}

}
*/