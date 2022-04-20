package javaObject;

public class ArrayEx2 {

	public static void main(String[] args) {

		/*int[] scores = new int[5];
		for(int i = 0; i < 5; i++) {
			System.out.println(scores[i]);
		}
		String[] names = {"±èÃ¶¼ö","È«±æµ¿","ÀÌ¿µÈñ"};
		System.out.println(names[0]);*/
		int [] scores = {80, 90, 66, 96, 75};
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i]; // sum = sum + scores[i];
		}
		System.out.println("ÃÑÁ¡ = " + sum);
		double avg = (double)sum/scores.length; 
		System.out.println("Æò±Õ = " + avg);
	}
		
}
