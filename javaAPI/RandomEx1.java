package javaAPI;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// Random Ŭ����
		int myNum[] = new int[6];
		Random rand1 = new Random(5);
		System.out.print("���� ������ ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			myNum[i] = rand1.nextInt(45)+1;
			// int lotto = (int)(Math.random()*45)+1; // Math��� ����Ŭ���� �ȿ� random�̶�� �޼ҵ尡 ����
			System.out.print(myNum[i] + " ");
		}
		System.out.println();
		int lottoNum[] = new int[6];
		Random rand2 = new Random(3);
		System.out.print("�̹��� ��÷ ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			lottoNum[i] = rand2.nextInt(45)+1;
			System.out.print(lottoNum[i] + " ");
		}
		System.out.println();
		Arrays.sort(myNum);
		Arrays.sort(lottoNum);
		boolean result = Arrays.equals(myNum, lottoNum);
		if(result) {
			System.out.println(" 1� ��÷�Ǿ����ϴ�.");
		}else {
			System.out.println("�ƽ��׿�");
		}
	}

}
