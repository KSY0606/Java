package javaObject;

public class StringEx2 {

	public static void main(String[] args) {

		String str1 = "��ö��";
		String str2 = "��ö��";
		if(str1 == str2) {
			System.out.println("�� ������ ������ ����");
		}else {
			System.out.println("�� ������ ������ �ٸ�");
		}
		if(str1.equals(str2)) {
			System.out.println("���� ���ڿ���");
		}
		String str3 = new String("ȫ�浿");
		String str4 = new String("ȫ�浿");
		if(str3 == str4) {
			System.out.println("�� ������ ������ ����");
		}else {
			System.out.println("�� ������ ������ �ٸ�");
		}
		if(str3.equals(str4)) {
			System.out.println("���� ���ڿ���");
		}else {
			System.out.println("�ٸ� ���ڿ���");
		}
	}

}
