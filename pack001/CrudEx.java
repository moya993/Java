package pack001;

import java.util.*;

// CRUD
// 메모리 상관없이 속도만 따짐
// CRUD 특성 확인해보기
public class CrudEx {

	public static void main(String[] args) {
		//밑에는 <Integer>만 관리해주는 컨테이너이다.
		// <>	는 컨테이너라고 함
		LinkedList<Integer> mm = new LinkedList<Integer>();
		
		//  CRUD과정 4가지
		
		//1. Create
		mm.add(10);
		System.out.println(mm.size());	//데이터를 몇개 가지고 있는지 확인
		for (int i = 0; i < 10; i++) {
			mm.add(i*10+i);
		}
		System.out.println(mm);
		System.out.println();
		
		
		//2. Reading
		System.out.println(mm);
		
		//2-2. for문 활용
		//활용도가 제일 높음
		int size = mm.size();	//size = 11
		for (int i = 0; i < size; i++) {
			int data = mm.get(i);
			System.out.print(data+" ");
		}
		System.out.println();
		
		
		//2-3. for-each문
		//많이 쓰는 변수로는 x, item, value, data
		for (Integer x : mm) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		
		//3. Update
		System.out.println(mm);
		mm.set(5, 999);		//5번 인덱스 자리에 999를 넣음
		System.out.println(mm);
		
		
		
		//4. Delete
		mm.remove(5);		//5번 인덱스를 지움
		System.out.println(mm);
		

		
		
	}
	

}













