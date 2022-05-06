package javaAPI;

public class StringEx3 {

	public static void main(String[] args) {
		//문자열 찾기
		String str = "내일부터 어린이날 휴무입니다.";
		int index = str.indexOf("어린이"); 		// 찾는 문자열이 없다면 -1이 출력됨
		System.out.println(index);
		
		String subject = "이것이 자바다";
		int location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
