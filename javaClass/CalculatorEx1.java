package javaClass;

public class CalculatorEx1 {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		int result = cal.total(73, 85, 66);
		System.out.println(result);
		
		System.out.println("ЦђБе = " + cal.average(75, 95, 60));
	}

}
