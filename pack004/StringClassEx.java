package pack004;


/*
// String Ŭ������ ������ �ִ� �͵�
// String �����͸� �����ų �� ����.
public class StringClassEx {

	public static void main(String[] args) {
		String s = "����ȭ�����Ǿ����ϴ�";
		
		// 1. String.length();
		// ���� ���� ���
		System.out.println(s.length());
		System.out.println();
		
		// 2. chartAt(int index);
		// index�� �μ������� ���ָ� charŸ������ ���ϵ�
		// index ��ȣ�� �ִ� ���ڸ� �����
		System.out.println(s.charAt(3));	// 3�� �ε��� ���ڸ� ���
		
		// 3.indexOf(String str)
		// str�� �ش��ϴ� �ε��� ��ȣ�� ���
		// ��ã���� -1�� ���
		System.out.println(s.indexOf("ȭ����"));
		System.out.println(s.indexOf("�����"));
		System.out.println();
		
		int n = s.indexOf("ȭ����");
		if(n != -1) {
			System.out.println(n+"��°");
		}else {
			System.out.println("not found");
		}
		System.out.println();
		
		
		// 4. String.replace(CharSequence target, CharSequence replacement)
		// ����!!! : ���� �����Ͱ� ����Ǿ��°� Ȯ��
		// �տ��� �Է¹޴� Ÿ��, �ڰ� ��ü�� ����
		System.out.println(s.replace("����", "������"));
		System.out.println(s);
		// String�� �����͸� ������ �� ����!!!!!!!!!!!!
		// ������ ������ �ƴ϶� ��ü�� ����Ȱ���!!!!!!!!!!
		// s = "���ѹα�";	// �̰Ŵ� s�� ����Ȱ� �ƴ϶� ���ο� s�� ��
		System.out.println();
		
		
		// 5. String.substring(int beginIndex)
		// �����̽�
		// ���� �ڸ����� ���������� �߶� ���
		System.out.println(s.substring(5));
		System.out.println(s.substring(3,6));
		
		System.out.println("--------------------");
		
		// 6. String.trim()
		// ���̵� ��� �α����� �� �ַ� ���
		// �� ���� ���� ����
		String s2 = "   App   le   ";
		System.out.print(s2.trim());
		System.out.println("ȣ����");
		
		System.out.println("--------------------");
		
		// 7. 
		// String.toUpperCase()
		// String.toLowerCase()
		// �빮�ڷ� ����� ��, �ҹ��� �������
		String s3 = "APple";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		
		// 8. �����͸� �޾��� �� ���
		byte[] data = new byte[] {65, 'B', 'C', 'D'};
		String s4 = new String(data, 0, data.length);
		System.out.println(s4);		// ���ڿ��� ��ȯ��
		
		// �����͸� ������ �� ���
		String s5 = "Banana";
		byte[] data1 = s5.getBytes();
		for (byte value : data1) {
			System.out.println((char)value);
		}
 
		
	}

}
*/