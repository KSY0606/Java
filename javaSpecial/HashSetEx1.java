package javaSpecial;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		set1.add("java");
		set1.add("html");
		set1.add("css");
		set1.add("java");  // 같은 객체가 있으면 추가 되지않음
		set1.add("react");
		set1.remove("css"); // 지우려고 하는 객체는 직접입력 해줘야함.
		System.out.println("총 객체수 : " + set1.size());
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { // 객체의 존재여부
			String subject = iter.next(); // 한 개의 자료를 가져온다
			System.out.println(subject);
		}
	}

}
