package javaObject;

import java.util.Scanner;

public class ConfirmEx3 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է�| 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("------------------------------------------------");
			System.out.print("���� >> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л��� > ");
				studentNum += scanner.nextInt();
			}else if(selectNo == 2){
				scores[studentNum];
			}else if(selectNo == 3){
				// �ۼ�
			}else if(selectNo == 4){
				// �ۼ�
			}else if(selectNo == 5){
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
