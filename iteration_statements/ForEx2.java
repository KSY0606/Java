package iteration_statements;

public class ForEx2 {

	public static void main(String[] args) {

		/*int num = (int)(Math.random()*6)+1; //  random�� ���� �߻������ִ� �Լ� , �ֻ��� �������� ���
		System.out.println(num); */
		
		System.out.println("�ζ� �ڵ���ȣ+ ������");
		for( int i = 1; i <= 6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			System.out.println(lotto);
		} 
	}

}
