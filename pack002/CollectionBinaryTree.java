package pack002;

import java.util.*;



/////////////////////////////////////////////////////////////////////////
// 1. TreeSet
// ����Ʈ���� ������� �� Set �÷���
// ��ü�� ������ ��, �θ�� ���Ͽ� ���� ���� ������ ��忡 ����, ���� ���� ���� ��忡 ������
// TreeSet<E> treeSet = new TreeSet<E>();	


// TreeSet�� ������ �˻� ���� �޼ҵ�
// �޼ҵ� : ����
// first() : ���� ���� ��ü�� ����
// last() : ���� ���� ��ü�� ����
// lower(E e) : �־��� ��ü���� �ٷ� �Ʒ� ��ü�� ����
// higher(E e) : �־��� ��ü���� �ٷ� �� ��ü�� ����
// floor(E e) : �־��� ��ü�� ������ ��ü�� ������ ����, ������ �ٷ� �Ʒ� ��ü ����
// ceiling(E e) : �־��� ��ü�� ������ ��ü�� ������ ����, ������ �ٷ� �� ��ü ����
// pollFirst() : ���� ���� ��ü�� �������� �÷��ǿ��� ������
// pollLast() : ���� ���� ��ü�� �������� �÷��ǿ��� ������


// TreeSet�� ������ ���� ���� �޼ҵ�
// ���� Ÿ�� : �޼ҵ� : ����
//Iterator<E> : descendingIterator() : ������������ ���ĵ� Iterator�� ����
//NavigableSet<E> : descendingSet() : ������������ ���ĵ� NavigableSet�� ��ȯ






/*
// ex1) �˻� ���� �޼ҵ�� Ư�� ��ü ã��
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		
		Integer score = null;
		
		// ���� ���� ��ü ȣ��
		score = scores.first();
		System.out.println("���� ���� ���� : " + score);
		
		// ���� ���� ��ü ȣ��
		score = scores.last();
		System.out.println("���� ���� ���� : " + score);
		
		// �־��� ��ü���� �ٷ� �Ʒ� ��ü ����
		score = scores.lower(new Integer(95));	// 95������ �ٷ� �Ʒ� ��ü ȣ��
		System.out.println("95�� �Ʒ� ���� : " + score);
		
		// �־��� ��ü���� �ٷ� �� ��ü ����
		score = scores.higher(new Integer(95));
		System.out.println("95�� �� ���� : " + score);
		
		// �־��� ��ü�� ������ ��ü�� ������ ����, ������ �ٷ� �Ʒ� ��ü ����
		score = scores.floor(new Integer(95));
		System.out.println("���� ���� ���� : " + score);
		
		// �־��� ��ü�� ������ ��ü�� ������ ����, ������ �ٷ� �� ��ü ����
		score = scores.ceiling(new Integer(85));
		System.out.println("���� ���� ���� : " + score);
		
		// ���� ���� ��ü���� ���������� ������
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "���� ��ü ��: " + scores.size() );
			}
		
	}

}
*/



/*
// ex2) ���� ���� �޼ҵ�� ��ü �����ϱ�
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

// TreeMap�� ������ �˻� ���� �޼ҵ� 
// �޼ҵ� : ����
// firstEntry() : ���� ���� Map.Entry�� ����
// lastEntry() : ���� ���� Map.Entry�� ����
// lowerEntry(K key) : �־��� Ű���� �ٷ� �Ʒ� ��ü�� ����
// higherEntry(K key) : �־��� ��Ű���� �ٷ� �� ��ü�� ����
// floorEntry(K key) : �־��� Ű�� ������ Ű�� ������ ����, ������ �ٷ� �Ʒ� Map.Entry ����
// ceilingEntry(K key) : �־��� Ű�� ������ Ű�� ������ ����, ������ �ٷ� �� Map.Entry ����
// pollFirstEntry() : ���� ���� Map.Entry�� �������� �÷��ǿ��� ������
// pollLastEntry() : ���� ���� Map.Entry�� �������� �÷��ǿ��� ������

// TreeMap�� ������ ���� ���� �޼ҵ�
// ���� Ÿ�� : �޼ҵ� : ����
// NavigableSet<K> : descendingKeySet() : ������������ ���ĵ� NavigableSet�� ����
// NavigableMap<K, V> : descendingMap() : ������������ ���ĵ� Map.Entry�� NavigableMap�� ����




/*
// ex1) �˻� ���� �޼ҵ�� Ư�� Map.Entry ã��
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "�̼���");
		scores.put(new Integer(75), "������");
		scores.put(new Integer(95), "�迬��");
		scores.put(new Integer(80), "�ϼ���");
		
		Map.Entry<Integer, String> entry = null;
		
		// ���� ���� ��ü ȣ��
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

		// ���� ���� ��ü ȣ��
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

		// �־��� ��ü���� �ٷ� �Ʒ� ��ü ����
		entry = scores.lowerEntry(new Integer(95)); // 95������ �ٷ� �Ʒ� ��ü ȣ��
		System.out.println("95�� �Ʒ� ���� : " + entry.getKey() + "-" + entry.getValue());

		// �־��� ��ü���� �ٷ� �� ��ü ����
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� �� ���� : " + entry.getKey() + "-" + entry.getValue());

		// �־��� ��ü�� ������ ��ü�� ������ ����, ������ �ٷ� �Ʒ� ��ü ����
		entry = scores.floorEntry(new Integer(95));
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

		// �־��� ��ü�� ������ ��ü�� ������ ����, ������ �ٷ� �� ��ü ����
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("���� ���� ���� : " + entry.getKey() + "-" + entry.getValue());

		// ���� ���� ��ü���� ���������� ������
		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + " - " + entry.getValue() + "���� ��ü �� : " + scores.size());
		}
		
	}
}
*/




/*
// ex2) ���� �޼ҵ�� ��ü �����ϱ�
public class CollectionBinaryTree {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores  = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "�̼���");
		scores.put(new Integer(75), "������");
		scores.put(new Integer(95), "�迬��");
		scores.put(new Integer(80), "�ϼ���");
		
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









