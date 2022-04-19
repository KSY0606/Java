package iteration_statements;

public class ForEx2 {

	public static void main(String[] args) {

		/*int num = (int)(Math.random()*6)+1; //  random은 난수 발생시켜주는 함수 , 주사위 무작위로 출력
		System.out.println(num); */
		
		System.out.println("로또 자동번호+ 생성기");
		for( int i = 1; i <= 6; i++) {
			int lotto = (int)(Math.random()*45)+1;
			System.out.println(lotto);
		} 
	}

}
