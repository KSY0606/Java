package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {

	/*	String str = "������ ��̳�";
		System.out.println(str);
		char ch = str.charAt(7);
		System.out.println(ch);*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ֺ��Ϲ�ȣ �Է� >> ");
		String jumin = scanner.next();
		char sex= jumin.charAt(7);
		if(jumin.length() == 14) {
			if(sex == '1' || sex == '3') {
				System.out.println("�����̱���");
			}else if(sex == '2' || sex == '4') {
				System.out.println("�����̱���");
			}else {
				System.out.println("�ֹι�ȣ �Է��� �߸��Ǿ�����.");
			}
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�.");
		}
	}
	}
