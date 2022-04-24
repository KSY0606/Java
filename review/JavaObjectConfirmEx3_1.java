package review;

import java.util.Scanner;

public class JavaObjectConfirmEx3_1 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0; // 학생 수
		int[] scores = null; // 점수 입력 배열
		int max = 0; // 최고 점수
		int total = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력| 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택 >> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("학생 수 >> ");
				studentNum += scanner.nextInt();
				break;
			case 2:
				scores = new int[studentNum];
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "] >> ");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
				break;
			case 4:
				for(int i = 0; i < scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					total += scores[i];
					avg = (double)total / studentNum;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
				break;
			case 5:
				run = false;
			}
			
		} // while문 종료
	}
}