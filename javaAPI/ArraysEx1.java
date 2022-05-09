package javaAPI;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		// 배열 관련 API
		int[] scores = {75,96,80,90,83};
		Arrays.sort(scores); // 오름차순으로 정렬해줌
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
    	/* for(int i = scores.length-1; i >= 0; i--) {
			System.out.println(scores[i]);  는 내림차순 */    // for문 조건식에서 length-1를 해줘야, i가 4가 되면서 scores[i]가 성립된다. 
		}
		String[] names = {"박철순","홍길동","이영희"};
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
