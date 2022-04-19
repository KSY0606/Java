package iteration_statements;

public class ForEx4 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 3500) {
				System.out.println(i);
				break;
			}
			}
			System.out.println(sum);
		
		}
	}
