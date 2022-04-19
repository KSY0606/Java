package javabase;

public class Variable {

	public static void main(String[] args) {

		int num = 10;
		{
		int age = 30;	
		}
		System.out.println(num);
		// System.out.println(age); 범위를 벗어난 블럭에서 선언된 age는 출력 할 수 없다.
	}

}
