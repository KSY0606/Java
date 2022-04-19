package operator;

import java.util.Scanner;

public class OperatorEX5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("구입 수량 >> ");
		int amount = scan.nextInt();
		
		System.out.print("구입 단가 >> ");
		int price = scan.nextInt();
		
		if(amount >= 10 && price >= 1000) {
			price*=0.8;  // price = (int)(price*0.8);와 같음
			
		}
			int total = amount*price;
			System.out.println("구입 금액 : " + total);
		}
	}