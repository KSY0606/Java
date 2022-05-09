package javaAPI;

public class WrapperEx1 {

	public static void main(String[] args) {
		// 포장(Wrapper)클래스
		// Integer obj1 = new Integer(100);  요즘은 이렇게 안씀
		Integer obj1 = 750; // 자동 박싱
		Integer obj2 = 750;
		if(obj1.equals(obj2)) { // ==를 사용하면 다른값이라고 나온다.  참조하는 객체(주소값)이 다르기 떄문
			System.out.println("같은 값입니다.");
		}else {
			System.out.println("다른 값입니다.");
		}
		System.out.println(obj1);
		//int num = 100;과는 다르게 스택영역에 100이 아니라 obj1에 주소값이 있고 힙영역에 100이 저장되어있음
		
		int value = obj1; // 자동 언박싱  주소를 찾아가 값을 대입해줌.
		
		String str1 = "10";
		String str2 = "20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // 문자를 숫자로 변경해줌 
		
	}

}
