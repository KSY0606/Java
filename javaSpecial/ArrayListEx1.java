package javaSpecial;
 // 컬렉션프레임워크
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("react");
		list.add(3, "javascript");  // 중간에 껴넣음 
		list.add("nodejs");
		list.add("css");
		System.out.println("총 객체 수 : " + list.size());
		for(int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
		}
		System.out.println("============================");
		list.remove(3);
		list.remove(3);
		list.remove("html");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
