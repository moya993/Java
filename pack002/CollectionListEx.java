package pack002;

import java.util.*;

//1. List �÷���







//1 - 1. ArrayList

//List<String> list = new ArrayList<String>();
//�ε��� ��ȣ�� ������ ������� ������ ����ϰ� ��ü�� ���Եǰų� �����Ǵ� �������� ����� ����
//�ε��� �˻��̳�, �� �������� ��ü�� �߰��ϴ� ��쿡�� ����
public class CollectionListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");		//String ��ü�� ����
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü�� : "+ size);
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
		// Arrays.asList()	�޼ҵ�
		//������ ��ä��� ������ List�� ������ ��
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
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
//�⺻������ ArrayList�� ������ ���� ������ ����
//�����尡 ������ ���¿��� ���� ����
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
		
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		
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
//ArrayList�� ��������� ���� ������ ���� ������ ��ũ�ؼ� ü��ó�� ������
//����� ��ü ������ ������ �Ͼ�� ������ �����ϰ� ����
//10000���� ��ü�� �����ϴµ� �ɸ� �ð��� �����غ���

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
		System.out.println("Array �ɸ��ð� : " + (endTime-startTime)+"ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime-startTime)+"ns");
	}

}
*/



































