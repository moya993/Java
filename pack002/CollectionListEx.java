package pack002;

import java.util.*;

//1. List 컬렉션







//1 - 1. ArrayList

//List<String> list = new ArrayList<String>();
//인덱스 번호가 앞으로 당겨지기 때문에 빈번하게 객체가 삽입되거나 삭제되는 곳에서는 사용을 안함
//인덱스 검색이나, 맨 마지막에 객체를 추가하는 경우에는 좋음
public class CollectionListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");		//String 객체를 저장
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : "+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		
		/////////////////////////////////
		// Arrays.asList()	메소드
		//고정된 객채들로 구성된 List를 생성할 때
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
		
		
		
	}

}







/*
//1 - 2. Vector

//List<E> list = new Vector<E>();
//기본적으로 ArrayList와 동일한 내부 구조를 가짐
//스레드가 안전한 상태에서 실행 가능
public class Board {
	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.content = content;
		this.subject = subject;
		this.writer = writer;
	}
}


public class CollectionListEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}

		
	}

}
*/


















/*
//1 - 3. LinkedList

//List<E> list = new LinkedList<E>();
//ArrayList와 비슷하지만 내부 구조를 인접 참조를 링크해서 체인처럼 관리함
//빈번한 객체 삭제와 삽입이 일어나는 곳에서 유용하게 사용됨
//10000개의 객체를 삽입하는데 걸린 시간을 측정해보자

public class CollectionListEx {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("Array 걸린시간 : " + (endTime-startTime)+"ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime-startTime)+"ns");
	}

}
*/



































