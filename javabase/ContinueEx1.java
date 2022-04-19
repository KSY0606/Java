package javabase;

public class ContinueEx1 {

	public static void main(String[] args) {
		
		/*for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}*/
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <=6; j++) {
				if(i == j) {
					continue;
				}
				System.out.println("i = " + i + ", j = " + j);
			}
		}
	}
	}