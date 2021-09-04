package pack002;


import java.lang.reflect.Member;
import java.util.*;




/////////// Iterator //////////////
// 컬렉션으로부터 정보를 얻어내는 인터페이스
// 메서드 : 설명
// boolean hasNext() : 해당 요소를 가지면 true반환, 아니면 false
// E next : 이터레이션의 다음 요소를 반환함
// default void remove() : 해단 반복자로 반환되는 마지막 요소를 현재 컬렉션에서 제거함
///////////////////////////////////





//2. Set컬랙션
//저장 순서를 유지 못함
//객체를 중복해서 저장할 수 없음, 하나의 null값만 저장 가능
//인덱스로 객체를 검색해서 가져오는 메소드가 없음
//대신, 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
//iterator() 메소드 안에는 hasNext(), next() - 하나의 객체 소환, remove()가 있음





/*
//2. Set컬랙션

//2 - 1. HashSet
//*해시코드*
//Set<E> set = new HashSet<E>();
//객체들을 순서 없이 저장하고, 동일한 객체는 중복 저장하지 않음
//객체를 저장하기 전에 해시코드를 얻어내서 이미 저장되어 있는 객체들의 해시코드와 비교
//String 객체를 중복 없이 저장하는 HashSet
public class CollectionSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 첫 번째에 Java가 있어 위에꺼만 저장됨
		set.add("iBATIS");

		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("총 객체수 : " + set.size()); // 4개 저장됨
		System.out.println();

		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객체 수만큼 루핑
			String element = iterator.next(); // 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}

		set.remove("JDBC"); // 한 개의 객체 삭제
		set.remove("iBATIS"); // 한 개의 객체 삭제

		System.out.println("총 객체 수 : " + set.size());

		iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객체 수만큼 루핑
			String element = iterator.next(); // 한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		System.out.println();

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}

	}
}
*/





/*
//2 - 1 - 1. equals()와 HashCode() 메소드 정의
public class CollectionSetEx {
	public String name;
	public int age;

	public CollectionSetEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

// equals
	@Override
	public boolean equals(Object obj) { // name과 age값이 같으면 true를 리턴
		if (obj instanceof CollectionSetEx) {
			CollectionSetEx arrayListEx = (CollectionSetEx) obj;
			return arrayListEx.name.equals(name) && (arrayListEx.age == age);
		} else {
			return false;
		}

	}

// hashCode
	@Override
	public int hashCode() { // name과 age값이 같으면 동일한 hashCode가 리턴
		return name.hashCode() + age;
	} // String의 hashCode() 이용

	public static void main(String[] args) {

	}
}
*/







/*
//2 - 1 - 2. Member 객체를 중복 없이 저장하는 HashSet
public class CollectionSetEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		set.add(new Member("홍길동", 30)); // 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장

		System.out.println("총 객체수 : " + set.size());
	}
}
*/


















