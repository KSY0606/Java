package iteration_statements;

public class ForEx1 {

	public static void main(String[] args) {

		/*for(int i = 1; i <= 10; i++) {
			System.out.println(i + "�� �ݺ�����");
		}  
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}  */
		int sum = 0;
		for(int i = 1; i <= 100; i++)
			if(i%3 == 0) {
				sum+=0;
			}else	sum+=i; // sum = sum+i;
		
		System.out.println("1���� 100������ �� (3�� ��� ����): " + sum);
	}
	

}
