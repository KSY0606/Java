package javaSpecial;
 // Book
import java.util.Stack;

public class StackEx1 {

	public static void main(String[] args) {
	
		Stack<Book> str = new Stack<Book>();
		str.push(new Book("java"));
		str.push(new Book("html"));
		str.push(new Book("react"));
		str.push(new Book("nodejs")); // FILO (first in last out) 
		while(!str.isEmpty()) { // 스택이 비어있지 않은지?
			Book book = str.pop();
			System.out.println("꺼낸 책 : " + book.getName());
		}
	}

}
