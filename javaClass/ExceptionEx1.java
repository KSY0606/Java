package javaClass;

public class ExceptionEx1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0;
		try {
			int result = num1/num2;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누지마세요");
		}
	}

}


			/* try {
				정상처리...
				...
				}catch(예외타입 예외변수){
				예외처리내용  ----> 정상처리 됐을떄는 실행하지않음
				}   */