package javaObject;

public class ArrayEx1 {

	public static void main(String[] args) {

		// int score[] = {80,73,84,70,68};
		int [] score = new int[5];
		score[0] = 70;
		score[1] = 80;
		score[2] = 96;
		score[3] = 65;
		score[4] = 90;
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += score[i];
		}
		System.out.println("ÃÑÁ¡ = " + total);
		System.out.println("Æò±Õ = " + total/5);
	}

}
