package example;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		System.out.println("**���� ���߱� ����**");
		System.out.println("1���� 100������ ���ڸ� ���߱� �����Դϴ�.");
		Scanner sc = new Scanner(System.in);
		int comNumber = (int)(Math.random()*100)+1; // 1~100 ������ �� 
		int count = 0; // �õ� Ƚ�� 
		int myNumber;
		
		while(true) {
			count++;
		System.out.print("���� �Է� >> ");
		myNumber = sc.nextInt();
		if(myNumber > comNumber) {
			System.out.println("����� ���ڰ� �ʹ� Ů�ϴ�. �� �� ���� ���� �־����.");
		}else if(myNumber < comNumber) {
			System.out.println("����� ���ڰ� �ʹ� �۾ƿ�. �� �� ū ���� �־����.");
		}else {
			System.out.println("�����Դϴ�! (�õ� Ƚ�� : " + count + ")");
			break;
		}
	}
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}
