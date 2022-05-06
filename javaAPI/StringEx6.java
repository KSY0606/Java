package javaAPI;

public class StringEx6 {

	public static void main(String[] args) {
			// 앞뒤의 공백 잘라내기 (trim)
		String str = "    안녕하세요    ";
		String newStr = str.trim();
		System.out.println(str);
		System.out.println(newStr);
		String str1 = String.valueOf(50); // 숫자를 문자로 바꿔줌
	}

}
