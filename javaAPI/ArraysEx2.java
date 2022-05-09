package javaAPI;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		// 배열 관련 API
		int[] scores = {75,96,80,90,83};
		Arrays.sort(scores); 	// 오름차순으로 정렬해주고 입력된 값의 배열위치를 알려줌 
		int index = Arrays.binarySearch(scores, 80);
		System.out.println("찾은 위치 = " + index);
		
		String[] names = {"박철순","홍길동","이영희"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 위치 = " + index);
		
	}

}
