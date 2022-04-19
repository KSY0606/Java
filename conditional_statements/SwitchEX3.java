package conditional_statements;

import java.util.Scanner;

public class SwitchEX3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 >> ");
		int score = sc.nextInt();
		int scoreDiv;
		scoreDiv = score/10; 
		if(score >= 0 && score <= 100) {
		switch(scoreDiv) {
			case 10:
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println("C등급");
				break;
			case 6:
				System.out.println("D등급");
				break;
			default: 
				System.out.println("F등급");
				break;
				
			}
		}else {
			System.out.println("점수 입력 오류");
		}
		}
	
	}
