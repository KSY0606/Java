package example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>> ");
		
		int money = scan.nextInt();
		
		int m1 = (money/10000);
        int m2 = (money%10000)/5000;
        int m3 = (money%5000)/1000;
        int m4 = (money%1000)/500;
        int m5 = (money%500)/100;
        int m6 = (money%100)/10;
        
        System.out.println("������: " + m1 + "��");
        System.out.println("��õ����: " + m2 + "��");
        System.out.println("õ����: " + m3 + "��");
        System.out.println("500��: " + m4 + "��");
        System.out.println("100��: " + m5 + "��");
        System.out.println("10��: " + m6 + "��");
    }    
}
