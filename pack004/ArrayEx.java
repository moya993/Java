package pack004;




// �迭
public class ArrayEx {

	public static void main(String[] args) {
		int a = 10;
		// �迭 ����
		int[] ar = new int[5];	// ������ 5���� �迭 ����
		int[] br = new int[] { 1, 2, 3, 4, 5 };
		int[] cr = { 10, 20, 30, 40, 50 };	// ���� ���� ���, ���� ���x
		System.out.println(ar.length);	// �迭�� ����
		System.out.println();
		for (int i = 0; i < br.length; i++) {
			System.out.println(br[i]+ "");
		}System.out.println();
		
		// ����ȭ �� for�� foreach ++ ������ �Τ̤�
		// �����δ� x, data, value�� �ַ� ��
		for (int x : cr) {
			System.out.println(x+" ");
		}System.out.println();
		
		cr[0] = 100;
		cr[4] = 100;
	
		int num = 3;
		ar[num] = 500;
		ar[2] = 3;
		ar[ar[2]] = 999;
		System.out.println(ar[2]+" "+ar[3]);
		ar[ar[3]-998]=888;
		for (int x : ar) {
			System.out.println(x+" ");
		}System.out.println();
	
		System.out.println("===================================================");
		
		// ���ڿ�
		String[] ss = new String[4];
		ss[0] = "ȣ����";
		ss[1] = "�޹���";
		ss[2] = "�ϸ�";
		ss[3] = "�䳢";
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]+ " ");
		}System.out.println();
		
		System.out.println("===================================================");
		
		
		String [] st = new String[] {"�عٶ��", "���޷�", "�ε鷡"};
		String s1 = "ȣ����";		// ���� ���
		String s2 = new String("������");	// ���� ���
		String [] su = new String[] {new String("�عٶ��"), new String("���޷�"),new String("�ε鷹")};
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]+ " ");
		}
		System.out.println();
		
		
	}

}
