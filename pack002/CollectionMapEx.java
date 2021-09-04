package pack002;

import java.util.*;

// 3. Map 컬랙션
// key와 value값을 구성된 Entry  객체를 저장하는 구조를 가짐
// key와 value 값은 모두 객체임
// key는 중복저장o, value는 중복저장 x
// 객체 추가를 put명령어로 함




/*
// 3-1. HashMap
// Map<K, V> map = new HashMap<K, V>();
// 키와 값은 기본 타입(byte, int, double..) 사용 불가능
// 클래스 및 인터페이스 타입만 사용 가능
// 키로 사용할 객체를 hashCode()와 equals()메소드로 재정의해서 동등 객체가 될 조건을 정해야 한다.

// 이름은 키, 점수를 값으로 저장하는 HashMap 사용 방법
public class CollectionMapEx {

	public static void main(String[] args) {
		// Map 컬랙션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권",85);
		map.put("홍길동",80);
		map.put("강감찬",90);
		map.put("홍길동",100);	// 2번째와 동일하기 때문에 마지막 값으로 대치
		System.out.println("총 Entry 수 : " + map.size());		// 저장된 총 Entry수 얻기
		System.out.println();
		
		// 객체 찾기
		System.out.println("홍길동 : " + map.get("홍길동"));	// key값으로 value값 찾기
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keyset = map.keySet();	// key Set얻기
		Iterator<String> keyIterator = keyset.iterator();	// 반복해서 키를 얻고 값을 Map에서 얻어냄
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");		// key로 Map.Entry를 제거
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();		// Map.Entry Set 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {		//반복해서 Map.Entry를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);			
			
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();	// 모든 Map.Entry 삭제
		System.out.println("총 Entry 수:" + map.size());

		
		
		
		
		
		
		
		
	}

}
*/




/*
//3-1. HashMap 사용방법
class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {		// 학번과 이름이 동일할 경우 true 리턴
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals((student.name)));
		} else {
			return false;
		}	
	}
	
	public int hashCode() {	// 학번과 이름이 같다면 동일한 값을 리턴
	return sno + name.hashCode();

	}
}


public class CollectionMapEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println(map.size());
	}
}
*/








/*
//3-2 Hashtable
//Map<K, V> map = new Hashtable<K, V>();
//HashMap과 비슷함
//키로 사용할 객체를 hashCode()와 equals()메소드로 재정의해서 동등 객체가 될 조건을 정해야 한다.
//하지만 동기화된 메소드로 구성되어 있어 스레드가 안전한 상태에서 실행할 수 있다.

//3-2-1. Properties
//Hashtable의 하위 클래스, 때문에 Hashtable의 속성을 전부 가진다.
//하지만 String타입으로 제한을 걸어둠
//애플리케이션의 옵션 정보, 데이터베이스 연결 정보, 국제화 정보가 저장된 파일을 읽을 때 주로 사용


//Hashtable을 사용하여 아이디와 비밀번호 검사하기

public class CollectionMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		// 아이디와 비밀번호 미리 저장
		map.put("spring", "12");	
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디 : ");
			String id = sc.nextLine();		// 입력한 아이디 받기
		
			System.out.println("비밀번호 : ");
			String pwd = sc.nextLine();		// 입력한 아이디 받기
			System.out.println();	
		
			if(map.containsKey(id)) {
				if(map.containsValue(pwd)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("아이디가 일치하지 않습니다.");
			}
			
			
		}

		
	}
}
*/


















