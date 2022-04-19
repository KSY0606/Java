package conditional_statements;

import java.util.Scanner;

public class IFstatementEX2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력 >> ");
		int score = sc.nextInt();
		if(score >= 0 && score <= 100) {
			if(score >= 90) {
				if(score >=95) {
					System.out.println("A+등급");
				}else {
					System.out.println("A등급");
				}
			}else if(score >= 80) {
				System.out.println("B등급");
			}else if(score >= 70) {
				System.out.println("C등급");
			}else if(score >= 60) {
				System.out.println("D등급");
			}else {
				System.out.println("F등급");
			}
		}else {
			System.out.println("점수입력오류");
		}
	}
	}
