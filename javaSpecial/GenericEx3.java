package javaSpecial;

import java.util.ArrayList;
import java.util.List;

public class GenericEx3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); // <String>을 써주면서 String타입만 사용가능해짐
		list.add("홍길동");
		list.add("김철수");
		String str = list.get(0); // String만 사용 할 수 있기 때문에 강제타입변환을 해주지 않아도 에러가 안남
		
	}

}
