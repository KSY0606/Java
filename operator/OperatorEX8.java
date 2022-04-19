package operator;

public class OperatorEX8 {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = 70;
		/*int max;
		
		if(num1 > num2) {
			max = num1;
		}else {
			max = num2;
		} */
		
		int max = (num1 > num2)? num1 : num2;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("두 수 중 큰 값 = " + max);
		}
	}