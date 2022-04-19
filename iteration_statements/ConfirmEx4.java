package iteration_statements;

public class ConfirmEx4 {

	public static void main(String[] args) {

		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
