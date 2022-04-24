package review;

import java.util.Scanner;

public class JavaObjectConfirmEx3_1 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0; // �л� ��
		int[] scores = null; // ���� �Է� �迭
		int max = 0; // �ְ� ����
		int total = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է�| 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------------");
			System.out.print("���� >> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.print("�л� �� >> ");
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
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);
				break;
			case 5:
				run = false;
			}
			
		} // while�� ����
	}
}