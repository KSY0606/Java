package example;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		System.out.println("**숫자 맞추기 게임**");
		System.out.println("1부터 100사이의 숫자를 맞추기 게임입니다.");
		Scanner sc = new Scanner(System.in);
		int comNumber = (int)(Math.random()*100)+1; // 1~100 임의의 수 
		int count = 0; // 시도 횟수 
		int myNumber;
		
		while(true) {
			count++;
		System.out.print("숫자 입력 >> ");
		myNumber = sc.nextInt();
		if(myNumber > comNumber) {
			System.out.println("당신의 숫자가 너무 큽니다. 좀 더 작은 수를 넣어보세요.");
		}else if(myNumber < comNumber) {
			System.out.println("당신의 숫자가 너무 작아요. 좀 더 큰 수를 넣어보세요.");
		}else {
			System.out.println("정답입니다! (시도 횟수 : " + count + ")");
			break;
		}
	}
		System.out.println("게임이 종료되었습니다.");
	}

}
