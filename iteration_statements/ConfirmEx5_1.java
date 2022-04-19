package iteration_statements;

import java.util.Scanner;

public class ConfirmEx5_1 {

	public static void main(String[] args) {

		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택 > ");
			
			int num = scanner.nextInt();
			
			if(num > 4) {
				System.out.println("다시 입력해주세요");
			}else if(num == 1) {
				System.out.print("예금액 > ");
				balance += scanner.nextInt();
			}else if(num == 2) {
				System.out.println("최대 " + balance + "원 까지 출금 가능합니다.");
				System.out.print("출금액 > ");
				balance -= scanner.nextInt();
			}else if(num == 3) {
				System.out.print("잔고 > ");
				System.out.println(balance);
			}else if(num == 4) {
				System.out.println("시스템 종료");
				break;
			}
		}
	}

}
