package iteration_statements;

public class ForEx6 {

	public static void main(String[] args) {

		for(int i = 1; i <= 15; i++) {
			for(int k = 15; k >= i; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
