package javaAPI;

public class MathEx1 {

	public static void main(String[] args) {

		int num1 = Math.abs(-5);  // ���밪�� ������
		System.out.println(num1);
		double num2 = Math.ceil(3.2); // �ø�
		System.out.println(num2);
		double num3 = Math.round(3.3); // �ݿø�
		System.out.println(num3);
		double num4 = Math.floor(2.7); // ����
		System.out.println(num4);
		double num5 = Math.rint(5.5); // ����� ������ �Ǽ���
		System.out.println(num5);
		System.out.println(Math.random()); // 0 ~ 1 ������ �߻�
		System.out.println(Math.max(15, 50)); // �� �� ū ���ڸ� �˷���
		System.out.println(Math.min(2.3, 45.6)); // �� �� ���� ���� �˷���
	}

}
