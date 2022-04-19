package javaObject;

public class StringEx2 {

	public static void main(String[] args) {

		String str1 = "김철수";
		String str2 = "김철수";
		if(str1 == str2) {
			System.out.println("두 변수가 참조가 같음");
		}else {
			System.out.println("두 변수가 참조가 다름");
		}
		if(str1.equals(str2)) {
			System.out.println("같은 문자열임");
		}
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		if(str3 == str4) {
			System.out.println("두 변수가 참조가 같음");
		}else {
			System.out.println("두 변수가 참조가 다름");
		}
		if(str3.equals(str4)) {
			System.out.println("같은 문자열임");
		}else {
			System.out.println("다른 문자열임");
		}
	}

}
