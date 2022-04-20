package javaObject;

public class ArrayEx5 {

	public static void main(String[] args) {

		// argument로 배열 생성
		if(args.length != 2) {
			System.out.println("자료를 2개 넣어주세요");
		}else {
			System.out.println("첫번째 자료 => " + args[0]);
			System.out.println("두번째 자료 => " + args[1]);
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			System.out.println("두 수의 합은 = " + (num1+num2));
		}
	}

}
