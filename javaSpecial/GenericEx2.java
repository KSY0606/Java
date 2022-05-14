package javaSpecial;

import java.util.ArrayList;
import java.util.List;

public class GenericEx2 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("홍길동");
		list.add(25.8);
		list.add(96);
		list.add(false);
		list.add(40);
		String str = (String)list.get(0); // (String)을 붙여주지않으면 에러남. 강제타입변환을 해줘야함
		System.out.println(str);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
