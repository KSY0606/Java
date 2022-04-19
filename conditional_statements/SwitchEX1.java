package conditional_statements;

import java.util.Scanner;

public class SwitchEX1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("여행지를 선택하세요 (1.미주 2.유럽 3.동남아) >> ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("1층 안내데스크로 가세요.");
				break;
			case 2:
				System.out.println("2층 안내데스크로 가세요.");
				break;
			case 3:
				System.out.println("별관 안내데스크로 가세요.");
				break;
				default:
					System.out.println("여행지 선택을 잘못하셨습니다.");
		}
	}

}
