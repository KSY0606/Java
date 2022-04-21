package javaObject;

public class ConfirmEx2 {

	public static void main(String[] args) {

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78,83,93,87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int a = 0; a < array.length; a++) {		// array.length´Â ÇàÀÇ °¹¼ö = 3
			for(int b = 0; b < array[a].length; b++) {				 
				sum += array[a][b];
				count++;
			}
		} // for¹® Å»Ãâ
		avg = (double)sum/count;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

}
