package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {

		String ssn = "921023-1369744";
		System.out.println(ssn.substring(0, 7) + "*******");
		
		String original = "Java Programming";    // ��� ��� ���� 
		String lower = original.toLowerCase();	// ���� �ҹ��ڷ� �ٲ���
		String upper = original.toUpperCase();  // ���� �빮�ڷ� �ٲ���
		System.out.println(lower);
		System.out.println(upper);
	}

}
