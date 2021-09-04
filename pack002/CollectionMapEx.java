package pack002;

import java.util.*;

// 3. Map �÷���
// key�� value���� ������ Entry  ��ü�� �����ϴ� ������ ����
// key�� value ���� ��� ��ü��
// key�� �ߺ�����o, value�� �ߺ����� x
// ��ü �߰��� put��ɾ�� ��




/*
// 3-1. HashMap
// Map<K, V> map = new HashMap<K, V>();
// Ű�� ���� �⺻ Ÿ��(byte, int, double..) ��� �Ұ���
// Ŭ���� �� �������̽� Ÿ�Ը� ��� ����
// Ű�� ����� ��ü�� hashCode()�� equals()�޼ҵ�� �������ؼ� ���� ��ü�� �� ������ ���ؾ� �Ѵ�.

// �̸��� Ű, ������ ������ �����ϴ� HashMap ��� ���
public class CollectionMapEx {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("�ſ��",85);
		map.put("ȫ�浿",80);
		map.put("������",90);
		map.put("ȫ�浿",100);	// 2��°�� �����ϱ� ������ ������ ������ ��ġ
		System.out.println("�� Entry �� : " + map.size());		// ����� �� Entry�� ���
		System.out.println();
		
		// ��ü ã��
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));	// key������ value�� ã��
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keyset = map.keySet();	// key Set���
		Iterator<String> keyIterator = keyset.iterator();	// �ݺ��ؼ� Ű�� ��� ���� Map���� ��
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");		// key�� Map.Entry�� ����
		System.out.println("�� Entry �� : " + map.size());
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();		// Map.Entry Set ���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {		//�ݺ��ؼ� Map.Entry�� ��� Ű�� ���� ��
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);			
			
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();	// ��� Map.Entry ����
		System.out.println("�� Entry ��:" + map.size());

		
		
		
		
		
		
		
		
	}

}
*/




/*
//3-1. HashMap �����
class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {		// �й��� �̸��� ������ ��� true ����
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals((student.name)));
		} else {
			return false;
		}	
	}
	
	public int hashCode() {	// �й��� �̸��� ���ٸ� ������ ���� ����
	return sno + name.hashCode();

	}
}


public class CollectionMapEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 95);
		
		System.out.println(map.size());
	}
}
*/








/*
//3-2 Hashtable
//Map<K, V> map = new Hashtable<K, V>();
//HashMap�� �����
//Ű�� ����� ��ü�� hashCode()�� equals()�޼ҵ�� �������ؼ� ���� ��ü�� �� ������ ���ؾ� �Ѵ�.
//������ ����ȭ�� �޼ҵ�� �����Ǿ� �־� �����尡 ������ ���¿��� ������ �� �ִ�.

//3-2-1. Properties
//Hashtable�� ���� Ŭ����, ������ Hashtable�� �Ӽ��� ���� ������.
//������ StringŸ������ ������ �ɾ��
//���ø����̼��� �ɼ� ����, �����ͺ��̽� ���� ����, ����ȭ ������ ����� ������ ���� �� �ַ� ���


//Hashtable�� ����Ͽ� ���̵�� ��й�ȣ �˻��ϱ�

public class CollectionMapEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		// ���̵�� ��й�ȣ �̸� ����
		map.put("spring", "12");	
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.println("���̵� : ");
			String id = sc.nextLine();		// �Է��� ���̵� �ޱ�
		
			System.out.println("��й�ȣ : ");
			String pwd = sc.nextLine();		// �Է��� ���̵� �ޱ�
			System.out.println();	
		
			if(map.containsKey(id)) {
				if(map.containsValue(pwd)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
			}
			
			
		}

		
	}
}
*/


















