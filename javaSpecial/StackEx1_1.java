package javaSpecial;

import java.util.Stack;

public class StackEx1_1 {  // FILO (first in last out)   먼저 넣은게 나중에 나옴

	public static void main(String[] args) {


		Stack<String> str = new Stack<String>();
		str.push("java");
		str.push("html");
		str.push("react");
		str.push("nodejs"); 
		while(!str.empty()) { // 스택이 비어있지 않은지?
			System.out.println("꺼낸 책 : " + str.pop());
		}
	}

}
