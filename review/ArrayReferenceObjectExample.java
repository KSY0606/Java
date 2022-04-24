package review;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];  // 길이가 3인 배열 생성
		
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);  // 같은 객체를 참조하므로 true
		System.out.println(strArray[0] == strArray[2]);  // new연산자를 이용해 세로운 String객체가 생성되어 참조하는 객체가 달라짐.
		System.out.println(strArray[0].equals(strArray[2])); // equals는 문자열을 비교할때 쓰임
	}

}
