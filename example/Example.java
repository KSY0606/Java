package example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		
		int money = scan.nextInt();
		
		
		int ten_thousand = money/10000;
		System.out.println("������ >> " + ten_thousand + "��");
		
		int five_thousand1 = money-(ten_thousand*10000);
		int five_thousand2 = five_thousand1/5000;
		System.out.println("��õ���� >> " + five_thousand2+ "��");
		
		int thousand1 = five_thousand1-(five_thousand2*5000);
		int thousand2 = thousand1/1000;
		System.out.println("õ���� >> " + thousand2 + "��");
		
		int five_hundred1 = thousand1-(thousand2*1000);
		int five_hundred2 = five_hundred1/500;
		System.out.println("����� >> " + five_hundred2 + "��");
		
		int hundred1 = five_hundred1-(five_hundred2*500);
		int hundred2 = hundred1/100;
		System.out.println("��� >> " + hundred2 + "��");
		
		int ten1 = hundred1-(hundred2*100);
		int ten2 = ten1/10;
		System.out.println("�ʿ� >> " + ten2 + "��");
		
		
		}
		}
