package javaAPI;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {

		String text = "홍길동,김철수,박찬호,이영희,박지성";
		StringTokenizer st = new StringTokenizer(text, ",");  // ,를 기준으로 문자열 하나씩 출력해줌
		/*int tokens = st.countTokens();
		for(int i = 0; i < tokens; i++) {
			String str = st.nextToken();
			System.out.println(str);
		}*/
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			System.out.println(str);
		}
	}

}
