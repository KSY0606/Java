package javaAPI;

public class StringEx4 {

	public static void main(String[] args) {
		// ���ڿ� ��ġ (replace)
		String str = "�ڹٴ� ��ü�������̸� �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = str.replace("�ڹ�", "JAVA");
		System.out.println(str);
		System.out.println(newStr);
		
		//���ڿ� �߶󳻱� (substring)
		String memo = "computer";
		String test = memo.substring(0,3);
		System.out.println(test);
		System.out.println(memo.substring(3));
		System.out.println(memo.substring(3, 6));
	}

}
