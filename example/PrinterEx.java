package example;

public class PrinterEx {

	public static void main(String[] args) {

	/*	Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동"); */
	
		Printer.println(10);  // 객체를 생성하지않고 클래스 자체로 선언. 정적메소드를 활용하면 됨
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
