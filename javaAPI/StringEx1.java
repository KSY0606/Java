package javaAPI;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {

	/*	String str = "내일은 어린이날";
		System.out.println(str);
		char ch = str.charAt(7);
		System.out.println(ch);*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주빈등록번호 입력 >> ");
		String jumin = scanner.next();
		char sex= jumin.charAt(7);
		if(jumin.length() == 14) {
			if(sex == '1' || sex == '3') {
				System.out.println("남성이군요");
			}else if(sex == '2' || sex == '4') {
				System.out.println("여성이군요");
			}else {
				System.out.println("주민번호 입력이 잘못되었군요.");
			}
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
	}
