package javaSpecial;

public class CalcEx1 {

	public static void main(String[] args) {
		// 객체 필드 선언
		Calc calc;
		// 람다식 이용처리
		// 실행할 명령문이 여러 라인일때
		calc = (a,b) -> {
			int result = a + b;
			return result;
		};
		System.out.println("두 수의 합은 " + calc.hap(3, 9));
		// 실행할 명령문이 한 줄일때
		calc = (a,b) -> { return a + b; };
		System.out.println("두 수의 합은 " + calc.hap(3, 9));
		// 실행할 명령문이 한 줄일때 리턴문과 중괄호를 생략
		calc = (a,b) -> a + b;
		System.out.println("두 수의 합은 " + calc.hap(3, 9));
		// 내부 메서드를 호출해서 처리
		calc = (a,b) -> sum(a, b);
		System.out.println("두 수의 합은 " + calc.hap(3, 9));
	} // main
	
	// 합을 구하는 메서드
	public static int sum(int a, int b) {
		return a+b;
	}
}