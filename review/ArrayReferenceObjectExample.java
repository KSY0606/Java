package review;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];  // ���̰� 3�� �迭 ����
		
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);  // ���� ��ü�� �����ϹǷ� true
		System.out.println(strArray[0] == strArray[2]);  // new�����ڸ� �̿��� ���ο� String��ü�� �����Ǿ� �����ϴ� ��ü�� �޶���.
		System.out.println(strArray[0].equals(strArray[2])); // equals�� ���ڿ��� ���Ҷ� ����
	}

}
