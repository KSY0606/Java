package javaObject;

public class ArrayEx3 {

	public static void main(String[] args) {

		int[] scores = {85, 63, 74, 95, 45, -1, 36, 74};
		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == -1) {
				break;
			}
			sum += scores[i];
		}
		System.out.println(sum);
	}

}
