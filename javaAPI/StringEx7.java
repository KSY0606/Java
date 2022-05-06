package javaAPI;

public class StringEx7 {

	public static void main(String[] args) {

		String text = "홍길동,김철수,박찬호,이영희,박지성";   // "홍길동,김철수&박찬호#이영희,박지성"; 이런 경우에는
		String[] names = text.split(",");			//  String[] names = text.split(",|&|#); 를 사용해야함. 이런 구분자(, # & 등)는 .split에서만 사용가능
		/*for(String na : names) {
			System.out.println(na);
		}*/
		for(int i = 0; i < names.length; i ++){
			System.out.println(names[i]);
		}
	}

}
