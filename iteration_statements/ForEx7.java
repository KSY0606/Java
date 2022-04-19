package iteration_statements;

public class ForEx7 {

	public static void main(String[] args) {

		int footTotal;
		long time1 = System.nanoTime();
		for(int pig = 1; pig <= 17; pig++) {
				for(int ost = 1; ost <= 17; ost++) {
					footTotal = pig * 4 + ost * 2; 
					if(footTotal == 56 && pig + ost == 17) {
						System.out.println("돼지 " + pig + "마리 , 타조 " + ost + "마리");
					}
				}
			}
		long time2 = System.nanoTime();
		System.out.println("프로그램 수행시간 = " + (time2-time1));
	}
	
	}
