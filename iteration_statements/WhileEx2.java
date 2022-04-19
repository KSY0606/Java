package iteration_statements;

public class WhileEx2 {

	public static void main(String[] args) {

		while(true) {
		int num = (int)(Math.random()*6)+1;
				System.out.println(num);
				if(num == 4) {
				break;
				}
			}
		System.out.println("수행종료!");
		}
	}
