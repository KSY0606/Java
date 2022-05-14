package javaSpecial;
 // 람다식 (함수식표현) = 익명구현객체를 간결하게 표현하는 식
public class PersonEx1 {

	public static void main(String[] args) {
			//일반적인 익명 객체 구현
		/*Person gildong = new Person() {
			
			@Override
			public void info() {
				System.out.println("나는 종로에 사는 홍길동입니다.");
				
			}
		};
		gildong.info();*/
		
			// 람다식 표현
		/*Person gildong;
		gildong = () -> {
			System.out.println("나는 종로에 사는 홍길동입니다.");
			System.out.println("자바 웹 개발을 배우고 있습니다.");
		};
		gildong.info();*/
		
		Person gildong;
		gildong = () -> System.out.println("나는 종로에 사는 홍길동입니다.");   // 실행문이 하나라면 중괄호{} 없이도 사용 가능
		gildong.info();
	}

}
