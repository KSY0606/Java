package iteration_statements;

import java.util.Scanner;

public class ConfirmEx5_1 {

	public static void main(String[] args) {

		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("���� > ");
			
			int num = scanner.nextInt();
			
			if(num > 4) {
				System.out.println("�ٽ� �Է����ּ���");
			}else if(num == 1) {
				System.out.print("���ݾ� > ");
				balance += scanner.nextInt();
			}else if(num == 2) {
				System.out.println("�ִ� " + balance + "�� ���� ��� �����մϴ�.");
				System.out.print("��ݾ� > ");
				balance -= scanner.nextInt();
			}else if(num == 3) {
				System.out.print("�ܰ� > ");
				System.out.println(balance);
			}else if(num == 4) {
				System.out.println("�ý��� ����");
				break;
			}
		}
	}

}
