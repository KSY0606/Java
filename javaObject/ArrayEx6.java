package javaObject;

public class ArrayEx6 {

	public static void main(String[] args) {

		int[][] scores = new int[2][3];
		scores[0][0] = 20;
		scores[1][1] = 50;
		for(int a = 0; a < scores.length; a++) {
			for(int b = 0; b < scores[a].length; b++) {
				System.out.println(scores[a][b]);
			}
		}
	}

}
