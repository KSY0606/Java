package example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>> ");
		
		int money = scan.nextInt();
		
		
		int ten_thousand = money/10000;
		System.out.println("만원권 >> " + ten_thousand + "장");
		
		int five_thousand1 = money-(ten_thousand*10000);
		int five_thousand2 = five_thousand1/5000;
		System.out.println("오천원권 >> " + five_thousand2+ "장");
		
		int thousand1 = five_thousand1-(five_thousand2*5000);
		int thousand2 = thousand1/1000;
		System.out.println("천원권 >> " + thousand2 + "장");
		
		int five_hundred1 = thousand1-(thousand2*1000);
		int five_hundred2 = five_hundred1/500;
		System.out.println("오백원 >> " + five_hundred2 + "개");
		
		int hundred1 = five_hundred1-(five_hundred2*500);
		int hundred2 = hundred1/100;
		System.out.println("백원 >> " + hundred2 + "개");
		
		int ten1 = hundred1-(hundred2*100);
		int ten2 = ten1/10;
		System.out.println("십원 >> " + ten2 + "개");
		
		
		}
		}
