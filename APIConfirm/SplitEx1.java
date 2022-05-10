package APIConfirm;

import java.util.StringTokenizer;

public class SplitEx1 {

	public static void main(String[] args) {

		String str = "아이디,이름,패스워드";

		// split()메서드
		String[] name = str.split(",");
		for(int i = 0; i < name.length; i ++){
			System.out.println(name[i]);
		}
		System.out.println();
		
		//StringTokenizer 메서드
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {	
			String str1 = st.nextToken();
			System.out.println(str1);
		}
	}

}
