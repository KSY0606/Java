package APIConfirm;

import java.util.StringTokenizer;

public class SplitEx1 {

	public static void main(String[] args) {

		String str = "���̵�,�̸�,�н�����";

		// split()�޼���
		String[] name = str.split(",");
		for(int i = 0; i < name.length; i ++){
			System.out.println(name[i]);
		}
		System.out.println();
		
		//StringTokenizer �޼���
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {	
			String str1 = st.nextToken();
			System.out.println(str1);
		}
	}

}
