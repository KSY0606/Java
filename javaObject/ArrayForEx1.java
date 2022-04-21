package javaObject;

public class ArrayForEx1 {

	public static void main(String[] args) {

		// 향상된 for문   13,14라인
		int[] scores = {95, 80, 90, 76, 88};
		int sum = 0;
		double avg;
		/*for(int i = 0; i < scores.length; i++) {
			sum += scores[i];*/
		for(int sc:scores) {		// for(타입 변수:배열명)  배열명은 8라인의 배열생성시 선언한 변수이름	
			sum+=sc;
		}
		avg = (double)sum/scores.length;
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);
	}

}
