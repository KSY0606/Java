package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {

		// 정규표현식
		Scanner scan = new Scanner(System.in);
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";//"정규표현식";
		System.out.print("전화번호를 입력 >> ");
		String data = scan.next();
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("전화번호 형식이 일치합니다.");
		}else {
			System.out.println("전화번호 형식이 틀립니다.");
		}
		System.out.print("이메일을 입력 >> ");
		String email = scan.next();
		String regExpExpEmail = "\\w+@\\w+\\.\\w+(\\.\\w+)?";  //  (\\.\\w+)?"; co.kr같은 이메일일 경우 사용되어야하므로 입력해줌
		result = Pattern.matches(regExpExpEmail, email);
		if(result) {
			System.out.println("이메일주소 형식입니다.");
		}else {
			System.out.println("이메일주소 형식이 아닙니다.");
		}
	}

}
