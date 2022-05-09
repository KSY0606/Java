package javaAPI;

public class SystemTimeEx1 {

	public static void main(String[] args) {
		//시간 관련된 API
		
		// long time1 = System.currentTimeMillis(); // 1000분의 1초
		
		long time1 = System.nanoTime(); // 10억분의 1초
		System.out.println(time1);
		int sum = 0;
		for(int i= 1; i <= 100000; i++) {
			sum+=i;
		}
		long time2 = System.nanoTime();
		// long time2 = System.currentTimeMillis();
		System.out.println("1부터 100000까지의 합 = " + sum);
		System.out.println("계산작업에" + (time2-time1) + "나노초가 소요됨");
	}

}
