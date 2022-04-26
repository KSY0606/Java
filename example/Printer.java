package example;

public class Printer {

		// 메소드 오버로딩
	static void println(int num) {
		System.out.println(num);
	}
	static void println(boolean bool) {
		System.out.println(bool);
	}
	static void println(double db) {
		System.out.println(db);
	}
	static void println(String name) {
		System.out.println(name);
	}
}
