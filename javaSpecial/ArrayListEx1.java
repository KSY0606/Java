package javaSpecial;
 // �÷��������ӿ�ũ
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("html");
		list.add("css");
		list.add("react");
		list.add(3, "javascript");  // �߰��� ������ 
		list.add("nodejs");
		list.add("css");
		System.out.println("�� ��ü �� : " + list.size());
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
