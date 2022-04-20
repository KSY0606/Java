package javaObject;

public class ArrayEx7 {

	public static void main(String[] args) {

		int num1 = 50;
		int num2 = 10;		// 50, 10 의 값을 바꾸고싶을떄 
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
