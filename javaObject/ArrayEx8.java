package javaObject;

public class ArrayEx8 {

	public static void main(String[] args) {

		System.out.println("로또 자동번호 생성기");
		int[] lotto = new int[6];
		boolean run = true;
		while(run) {
			// 번호 생성 6개
			for( int i = 0; i < 6; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
			}
			// 소트 알고리즘 활용
			run = false;
			for(int a = 0; a < lotto.length-1; a++) {
				for(int b = a+1; b < lotto.length; b++) {
					if(lotto[a] == lotto[b]) {
						run = true;
					}
				}
			}
		} // while 루프
		for( int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
	}

}
