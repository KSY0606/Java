package javaException;

public class ExceptionEx1 {

	public static void main(String[] args) {

		try {
			int num1 = 10;
			int num2 = 2;
			String str = "�ȳ��ϼ���";
			int[] nums = {10, 20, 30};
			int result = num1 / num2;
			String data1 = "200";
			String data2 = "300";
			
			System.out.println("����� : " + result);
			System.out.println(str.toString());
			System.out.println(nums[2]);
			System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2));
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		}catch(NullPointerException e) {
			System.out.println("���ڸ� �����ϰ� ���� �ʽ��ϴ�.");
		}catch(Exception e) {
			System.out.println("�����ڿ��� �����ϼ��� (010-1111-2222)-" + e.getMessage());
		}
		finally {  // ���ܿ� ������� �׻� �����ϰ���� ����. ������ ��µ�
			System.out.println("���� �ٽ� Ȯ���ϰ� �����ϼ���");
		}
	}

}
