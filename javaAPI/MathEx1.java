package javaAPI;

public class MathEx1 {

	public static void main(String[] args) {

		int num1 = Math.abs(-5);  // 절대값을 구해줌
		System.out.println(num1);
		double num2 = Math.ceil(3.2); // 올림
		System.out.println(num2);
		double num3 = Math.round(3.3); // 반올림
		System.out.println(num3);
		double num4 = Math.floor(2.7); // 버림
		System.out.println(num4);
		double num5 = Math.rint(5.5); // 가까운 정수의 실수값
		System.out.println(num5);
		System.out.println(Math.random()); // 0 ~ 1 난수를 발생
		System.out.println(Math.max(15, 50)); // 둘 중 큰 숫자를 알려줌
		System.out.println(Math.min(2.3, 45.6)); // 둘 중 작은 값을 알려줌
	}

}
