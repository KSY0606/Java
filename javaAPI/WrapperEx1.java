package javaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		// ����(Wrapper)Ŭ����
		// Integer obj1 = new Integer(100);  ������ �̷��� �Ⱦ�
		Integer obj1 = 750; // �ڵ� �ڽ�
		Integer obj2 = 750;
		if(obj1.equals(obj2)) { // ==�� ����ϸ� �ٸ����̶�� ���´�.  �����ϴ� ��ü(�ּҰ�)�� �ٸ��� ����
			System.out.println("���� ���Դϴ�.");
		}else {
			System.out.println("�ٸ� ���Դϴ�.");
		}
		System.out.println(obj1);
		//int num = 100;���� �ٸ��� ���ÿ����� 100�� �ƴ϶� obj1�� �ּҰ��� �ְ� �������� 100�� ����Ǿ�����
		
		int value = obj1; // �ڵ� ��ڽ�  �ּҸ� ã�ư� ���� ��������.
		
		String str1 = "10";
		String str2 = "20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // ���ڸ� ���ڷ� �������� 
		
	}

}
