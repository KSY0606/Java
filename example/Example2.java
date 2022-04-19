package example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		
		int money = scan.nextInt();
		
		int m1 = (money/10000);
        int m2 = (money%10000)/5000;
        int m3 = (money%5000)/1000;
        int m4 = (money%1000)/500;
        int m5 = (money%500)/100;
        int m6 = (money%100)/10;
        
        System.out.println("만원권: " + m1 + "장");
        System.out.println("오천원권: " + m2 + "장");
        System.out.println("천원권: " + m3 + "장");
        System.out.println("500원: " + m4 + "개");
        System.out.println("100원: " + m5 + "개");
        System.out.println("10원: " + m6 + "개");
    }    
}
