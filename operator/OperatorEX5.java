package operator;

import java.util.Scanner;

public class OperatorEX5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� ���� >> ");
		int amount = scan.nextInt();
		
		System.out.print("���� �ܰ� >> ");
		int price = scan.nextInt();
		
		if(amount >= 10 && price >= 1000) {
			price*=0.8;  // price = (int)(price*0.8);�� ����
			
		}
			int total = amount*price;
			System.out.println("���� �ݾ� : " + total);
		}
	}