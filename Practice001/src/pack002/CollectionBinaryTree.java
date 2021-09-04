package pack002;

import java.util.*;



/////////////////////////////////////////////////////////////////////////
// 1. TreeSet
// 이진트리를 기반으로 한 Set 컬랙션
// 객체를 생성할 때, 부모와 비교하여 높은 것은 오른쪽 노드에 저장, 낮은 것은 왼쪽 노드에 저장함
// TreeSet<E> treeSet = new TreeSet<E>();	


// TreeSet이 가지는 검색 관련 메소드
// 메소드 : 설명
// first() : 제일 낮은 객체를 리턴
// last() : 제일 높은 객체를 리턴
// lower(E e) : 주어진 객체보다 바로 아래 객체를 리턴
// higher(E e) : 주어진 객체보다 바로 위 객체를 리턴
// floor(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 아래 객체 리턴
// ceiling(E e) : 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 위 객체 리턴
// pollFirst() : 제일 낮은 객체를 꺼내오고 컬렉션에서 제거함
// pollLast() : 제일 높은 객체를 꺼내오고 컬렉션에서 제거함


// TreeSet이 가지는 정렬 관련 메소드
// 리턴 타입 : 메소드 : 설명
//Iterator<E> : descendingIterator() : 내림차순으로 정렬된 Iterator를 리턴
//NavigableSet<E> : descendingSet() : 내림차순으로 정렬된 NavigableSet을 반환






/*
// ex1) 검색 관련 메소드로 특정 객체 찾기
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		
		Integer score = null;
		
		// 가장 낮은 객체 호출
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		// 가장 높은 객체 호출
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		
		// 주어진 객체보다 바로 아래 객체 리턴
		score = scores.lower(new Integer(95));	// 95점보다 바로 아래 객체 호출
		System.out.println("95점 아래 점수 : " + score);
		
		// 주어진 객체보다 바로 위 객체 리턴
		score = scores.higher(new Integer(95));
		System.out.println("95점 위 점수 : " + score);
		
		// 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 아래 객체 리턴
		score = scores.floor(new Integer(95));
		System.out.println("가장 낮은 점수 : " + score);
		
		// 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 위 객체 리턴
		score = scores.ceiling(new Integer(85));
		System.out.println("가장 낮은 점수 : " + score);
		
		// 제일 낮은 객체부터 순차적으로 삭제함
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "남은 객체 수: " + scores.size() );
			}
		
	}

}
*/



/*
// ex2) 정렬 관련 메소드로 객체 정렬하기
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeSet<Integer> scores  = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.println(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.println(score + " ");
		}
		
	}
}
*/
//////////////////////////////////////////////////////////////////////////////



// 2. TreeMap
// TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

// TreeMap이 가지는 검색 관련 메소드 
// 메소드 : 설명
// firstEntry() : 제일 낮은 Map.Entry를 리턴
// lastEntry() : 제일 높은 Map.Entry를 리턴
// lowerEntry(K key) : 주어진 키보다 바로 아래 객체를 리턴
// higherEntry(K key) : 주어진 객키보다 바로 위 객체를 리턴
// floorEntry(K key) : 주어진 키와 동등한 키가 있으면 리턴, 없으면 바로 아래 Map.Entry 리턴
// ceilingEntry(K key) : 주어진 키와 동등한 키가 있으면 리턴, 없으면 바로 위 Map.Entry 리턴
// pollFirstEntry() : 제일 낮은 Map.Entry를 꺼내오고 컬렉션에서 제거함
// pollLastEntry() : 제일 높은 Map.Entry를 꺼내오고 컬렉션에서 제거함

// TreeMap이 가지는 정렬 관련 메소드
// 리턴 타입 : 메소드 : 설명
// NavigableSet<K> : descendingKeySet() : 내림차순으로 정렬된 NavigableSet을 리턴
// NavigableMap<K, V> : descendingMap() : 내림차순으로 정렬된 Map.Entry의 NavigableMap을 리턴




/*
// ex1) 검색 관련 메소드로 특정 Map.Entry 찾기
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이선봉");
		scores.put(new Integer(75), "윤선길");
		scores.put(new Integer(95), "김연우");
		scores.put(new Integer(80), "하석범");
		
		Map.Entry<Integer, String> entry = null;
		
		// 가장 낮은 객체 호출
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

		// 가장 높은 객체 호출
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + "-" + entry.getValue());

		// 주어진 객체보다 바로 아래 객체 리턴
		entry = scores.lowerEntry(new Integer(95)); // 95점보다 바로 아래 객체 호출
		System.out.println("95점 아래 점수 : " + entry.getKey() + "-" + entry.getValue());

		// 주어진 객체보다 바로 위 객체 리턴
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위 점수 : " + entry.getKey() + "-" + entry.getValue());

		// 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 아래 객체 리턴
		entry = scores.floorEntry(new Integer(95));
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

		// 주어진 객체와 동등한 객체가 있으면 리턴, 없으면 바로 위 객체 리턴
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("가장 낮은 점수 : " + entry.getKey() + "-" + entry.getValue());

		// 제일 낮은 객체부터 순차적으로 삭제함
		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "남은 객체 수 : " + scores.size());
		}
		
	}
}
*/




/*
// ex2) 정렬 메소드로 객체 정렬하기
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores  = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이선봉");
		scores.put(new Integer(75), "윤선길");
		scores.put(new Integer(95), "김연우");
		scores.put(new Integer(80), "하석범");
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());				 
		}
		
		NavigableMap<Integer, String> ascendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEntrySet = descendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : descendingEntrySet) {
			System.out.println(entry.getKey() + " - " + entry.getValue());				 
		}

	}
}

*/









