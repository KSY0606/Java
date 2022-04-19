package javabase;

public class Hello {
	
	public static void main(String[] args) {
		
		System.out.println("자바 첫 수업");
		
		int age = 0526; // 8진수 
		System.out.println(age);

		// int age1 = 2.5  2.5는 실수 이기떄문에 정수만 저장가능한 int에는 초기화 할 수 없다. 
		double age1 = 2.5;
		System.out.println(age1);
		
		char ch = 'A';
		System.out.println(ch);
		
		System.out.println("철수가 말했다 \"안녕\"이라고");
	}
}

/*				자바 특징
 * 			이식성이 높은 언어
 * 			객체 지향 언어
 * 			함수적 스타일 코딩(람다식)
 * 			메모리를 자동관리
 * 			다양한 애플리케이션 개발
 * 			멀티쓰레드를 쉽게 구현
 * 			동적로딩을 지원
 * 			막강한 오픈소스 라이브러리가 풍부
 */