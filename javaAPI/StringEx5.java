package javaAPI;

public class StringEx5 {

	public static void main(String[] args) {

		String ssn = "921023-1369744";
		System.out.println(ssn.substring(0, 7) + "*******");
		
		String original = "Java Programming";    // ↓↓ 영어만 가능 
		String lower = original.toLowerCase();	// 전부 소문자로 바꿔줌
		String upper = original.toUpperCase();  // 전부 대문자로 바꿔줌
		System.out.println(lower);
		System.out.println(upper);
	}

}
