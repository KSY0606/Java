package example;

import java.util.Scanner;

public class Number_game {

	public static void main(String[] args) {

		int random = (int)(Math.random()*100)+1;
		System.out.println("게임을 시작합니다! 1 ~ 100 사이 수를 맞추세요 ");
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			count++;
			System.out.print("답을 입력하세요 >> ");
			int num = scan.nextInt();
			if(num < random) {
				System.out.println("더 큰 수를 입력해야합니다. \n");
			}else if(num > random) {
				System.out.println("더 작은 수를 입력해야합니다. \n");
			}else {
				System.out.println("정답입니다!  시도횟수 : (" + count + ")");
				break;
			}
		}
		System.out.println("게임이 종료됩니다.");
	}

}
