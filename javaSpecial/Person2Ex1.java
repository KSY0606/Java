package javaSpecial;

public class Person2Ex1 {

	public static void main(String[] args) {

		// 객체 필드 생성
		Person2 chanho;
		// 람다식 표현 (매개변수가 있을때)
		/*chanho = (age) -> {
			int myAge = age+1;
			System.out.println("내 나이는 " + myAge + "세 입니다.");
		};
		chanho.info(26);*/
		
		/*chanho = (age) -> 
			System.out.println("내 나이는 " + (age+1) + "세 입니다.");
			chanho.info(30);*/
		
		chanho = age -> 	// 매개변수가 1개일때는 ()를 생략 할 수 있다.
		System.out.println("내 나이는 " + (age+1) + "세 입니다.");
		chanho.info(30);
	}

}
