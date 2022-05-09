package javaAPI;

import java.util.Arrays;
import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// Random 클래스
		int myNum[] = new int[6];
		Random rand1 = new Random(5);
		System.out.print("내가 선택한 번호 : ");
		for(int i = 0; i < 6; i++) {
			myNum[i] = rand1.nextInt(45)+1;
			// int lotto = (int)(Math.random()*45)+1; // Math라는 수학클래스 안에 random이라는 메소드가 있음
			System.out.print(myNum[i] + " ");
		}
		System.out.println();
		int lottoNum[] = new int[6];
		Random rand2 = new Random(3);
		System.out.print("이번주 당첨 번호 : ");
		for(int i = 0; i < 6; i++) {
			lottoNum[i] = rand2.nextInt(45)+1;
			System.out.print(lottoNum[i] + " ");
		}
		System.out.println();
		Arrays.sort(myNum);
		Arrays.sort(lottoNum);
		boolean result = Arrays.equals(myNum, lottoNum);
		if(result) {
			System.out.println(" 1등에 당첨되었습니다.");
		}else {
			System.out.println("아쉽네요");
		}
	}

}
