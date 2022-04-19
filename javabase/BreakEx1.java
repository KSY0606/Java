package javabase;

public class BreakEx1 {

	public static void main(String[] args) {

		Outer:for(int i = 1; i <= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					System.out.println(i + " + " + j  + " = " + (i+j));
					if(i + j == 10) {
						break Outer;
					}
				}
			}
			System.out.println("프로그램 좀료!"); 
	}

}
