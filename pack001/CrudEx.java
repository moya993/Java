package pack001;

import java.util.*;

// CRUD
// �޸� ������� �ӵ��� ����
// CRUD Ư�� Ȯ���غ���
public class CrudEx {

	public static void main(String[] args) {
		//�ؿ��� <Integer>�� �������ִ� �����̳��̴�.
		// <>	�� �����̳ʶ�� ��
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		//  CRUD���� 4����
		
		//1. Create
		mm.add(10);
		System.out.println(mm.size());	//�����͸� � ������ �ִ��� Ȯ��
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm);
		System.out.println();
		
		
		//2. Reading
		System.out.println(mm);
		
		//2-2. for�� Ȱ��
		//Ȱ�뵵�� ���� ����
		int size = mm.size();	//size = 11
		for (int i = 0; i < size; i++) {
			int data = mm.get(i);
			System.out.print(data+" ");
		}
		System.out.println();
		
		
		//2-3. for-each��
		//���� ���� �����δ� x, item, value, data
		for (Integer x : mm) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		
		//3. Update
		System.out.println(mm);
		mm.set(5, 999);		//5�� �ε��� �ڸ��� 999�� ����
		System.out.println(mm);
		
		
		
		//4. Delete
		mm.remove(5);		//5�� �ε����� ����
		System.out.println(mm);
		

		
		
	}
	

}













