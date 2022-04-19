package iteration_statements;

public class ForEx1 {

	public static void main(String[] args) {

		/*for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번 반복수행");
		}  
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}  */
		int sum = 0;
		for(int i = 1; i <= 100; i++)
			if(i%3 == 0) {
				sum+=0;
			}else	sum+=i; // sum = sum+i;
		
		System.out.println("1부터 100까지의 합 (3의 배수 제외): " + sum);
	}
	

}
