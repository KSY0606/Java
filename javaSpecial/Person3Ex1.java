package javaSpecial;

public class Person3Ex1 {

	public static void main(String[] args) {
			// 객체 필드 선언
		Person3 younghee;
		
		younghee = (h,w) -> {
			String result = "내 신장은 " + h + "cm이고 몸무게는 " + w + "kg입니다.";
			return result;
		};
		System.out.println(younghee.info(168.3, 47.5));
	}

}
