package example;

import java.util.Scanner;

public class Number_game {

	public static void main(String[] args) {

		int random = (int)(Math.random()*100)+1;
		System.out.println("������ �����մϴ�! 1 ~ 100 ���� ���� ���߼��� ");
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			count++;
			System.out.print("���� �Է��ϼ��� >> ");
			int num = scan.nextInt();
			if(num < random) {
				System.out.println("�� ū ���� �Է��ؾ��մϴ�. \n");
			}else if(num > random) {
				System.out.println("�� ���� ���� �Է��ؾ��մϴ�. \n");
			}else {
				System.out.println("�����Դϴ�!  �õ�Ƚ�� : (" + count + ")");
				break;
			}
		}
		System.out.println("������ ����˴ϴ�.");
	}

}
