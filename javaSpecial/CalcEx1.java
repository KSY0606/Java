package javaSpecial;

public class CalcEx1 {

	public static void main(String[] args) {
		// ��ü �ʵ� ����
		Calc calc;
		// ���ٽ� �̿�ó��
		// ������ ��ɹ��� ���� �����϶�
		calc = (a,b) -> {
			int result = a + b;
			return result;
		};
		System.out.println("�� ���� ���� " + calc.hap(3, 9));
		// ������ ��ɹ��� �� ���϶�
		calc = (a,b) -> { return a + b; };
		System.out.println("�� ���� ���� " + calc.hap(3, 9));
		// ������ ��ɹ��� �� ���϶� ���Ϲ��� �߰�ȣ�� ����
		calc = (a,b) -> a + b;
		System.out.println("�� ���� ���� " + calc.hap(3, 9));
		// ���� �޼��带 ȣ���ؼ� ó��
		calc = (a,b) -> sum(a, b);
		System.out.println("�� ���� ���� " + calc.hap(3, 9));
	} // main
	
	// ���� ���ϴ� �޼���
	public static int sum(int a, int b) {
		return a+b;
	}
}