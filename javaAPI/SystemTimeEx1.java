package javaAPI;

public class SystemTimeEx1 {

	public static void main(String[] args) {
		//�ð� ���õ� API
		
		// long time1 = System.currentTimeMillis(); // 1000���� 1��
		
		long time1 = System.nanoTime(); // 10����� 1��
		System.out.println(time1);
		int sum = 0;
		for(int i= 1; i <= 100000; i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();
		// long time2 = System.currentTimeMillis();
		System.out.println("1���� 100000������ �� = " + sum);
		System.out.println("����۾���" + (time2-time1) + "�����ʰ� �ҿ��");
	}

}
