package javaSpecial;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {

		TreeSet<String> tree1 = new TreeSet<String>(); // 배열처럼 인덱스로 저장되지않고 트리모양으로 위에서 아래로 퍼져나감.  큰값은 오른쪽 작은값은 왼쪽으로
		tree1.add("apple");
		tree1.add("bit");
		tree1.add("zoo");
		tree1.add("forever");
		tree1.add("banana");
		tree1.add("cherry");
		tree1.add("melon");
		System.out.println("b~f 사이의 단어 검색");
		NavigableSet<String> rangeSet = tree1.subSet("b", true, "f", true);
		for( String word : rangeSet) {
			System.out.println(word);
		}
	}

}
