package javaClass;

public class ComputerEx1 {

	public static void main(String[] args) {

		Computer myCom = new Computer(); // °´Ã¼ »ý¼º
		int[] vlaues1 = {10, 20,30};
		int result1 = myCom.sum(vlaues1);
		System.out.println("°á°ú ÃÑÇÕ = " + result1);
		
		int[] values2 = {23, 74, 36, 12, 50};
		int result2 = myCom.sum(values2);
		System.out.println("°á°ú ÃÑÇÕ = " + result2);
		
		int result3 = myCom.sum2(10, 20, 30, 70);
		System.out.println(result3);
	}

}
