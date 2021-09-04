package pack002;


import java.lang.reflect.Member;
import java.util.*;




/////////// Iterator //////////////
// �÷������κ��� ������ ���� �������̽�
// �޼��� : ����
// boolean hasNext() : �ش� ��Ҹ� ������ true��ȯ, �ƴϸ� false
// E next : ���ͷ��̼��� ���� ��Ҹ� ��ȯ��
// default void remove() : �ش� �ݺ��ڷ� ��ȯ�Ǵ� ������ ��Ҹ� ���� �÷��ǿ��� ������
///////////////////////////////////





//2. Set�÷���
//���� ������ ���� ����
//��ü�� �ߺ��ؼ� ������ �� ����, �ϳ��� null���� ���� ����
//�ε����� ��ü�� �˻��ؼ� �������� �޼ҵ尡 ����
//���, ��ü ��ü�� ������� �ѹ��� �ݺ��ؼ� �������� �ݺ���(Iterator)�� �����Ѵ�.
//iterator() �޼ҵ� �ȿ��� hasNext(), next() - �ϳ��� ��ü ��ȯ, remove()�� ����





/*
//2. Set�÷���

//2 - 1. HashSet
//*�ؽ��ڵ�*
//Set<E> set = new HashSet<E>();
//��ü���� ���� ���� �����ϰ�, ������ ��ü�� �ߺ� �������� ����
//��ü�� �����ϱ� ���� �ؽ��ڵ带 ���� �̹� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ��
//String ��ü�� �ߺ� ���� �����ϴ� HashSet
public class CollectionSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // ù ��°�� Java�� �־� �������� �����
		set.add("iBATIS");

		int size = set.size(); // ����� ��ü �� ���
		System.out.println("�� ��ü�� : " + set.size()); // 4�� �����
		System.out.println();

		Iterator<String> iterator = set.iterator(); // �ݺ��� ���
		while (iterator.hasNext()) { // ��ü ����ŭ ����
			String element = iterator.next(); // �� ���� ��ü�� �����´�.
			System.out.println("\t" + element);
		}

		set.remove("JDBC"); // �� ���� ��ü ����
		set.remove("iBATIS"); // �� ���� ��ü ����

		System.out.println("�� ��ü �� : " + set.size());

		iterator = set.iterator(); // �ݺ��� ���
		while (iterator.hasNext()) { // ��ü ����ŭ ����
			String element = iterator.next(); // �� ���� ��ü�� �����´�.
			System.out.println("\t" + element);
		}
		System.out.println();

		set.clear();
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}

	}
}
*/





/*
//2 - 1 - 1. equals()�� HashCode() �޼ҵ� ����
public class CollectionSetEx {
	public String name;
	public int age;

	public CollectionSetEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

// equals
	@Override
	public boolean equals(Object obj) { // name�� age���� ������ true�� ����
		if (obj instanceof CollectionSetEx) {
			CollectionSetEx arrayListEx = (CollectionSetEx) obj;
			return arrayListEx.name.equals(name) && (arrayListEx.age == age);
		} else {
			return false;
		}

	}

// hashCode
	@Override
	public int hashCode() { // name�� age���� ������ ������ hashCode�� ����
		return name.hashCode() + age;
	} // String�� hashCode() �̿�

	public static void main(String[] args) {

	}
}
*/







/*
//2 - 1 - 2. Member ��ü�� �ߺ� ���� �����ϴ� HashSet
public class CollectionSetEx {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();

		set.add(new Member("ȫ�浿", 30)); // �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new Member("ȫ�浿", 30)); // �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����

		System.out.println("�� ��ü�� : " + set.size());
	}
}
*/


















