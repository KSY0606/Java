package javaSpecial;

import java.util.Stack;

public class StackEx1_1 {  // FILO (first in last out)   ���� ������ ���߿� ����

	public static void main(String[] args) {


		Stack<String> str = new Stack<String>();
		str.push("java");
		str.push("html");
		str.push("react");
		str.push("nodejs"); 
		while(!str.empty()) { // ������ ������� ������?
			System.out.println("���� å : " + str.pop());
		}
	}

}
