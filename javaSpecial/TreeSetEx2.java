package javaSpecial;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {

		TreeSet<String> tree1 = new TreeSet<String>(); // �迭ó�� �ε����� ��������ʰ� Ʈ��������� ������ �Ʒ��� ��������.  ū���� ������ �������� ��������
		tree1.add("apple");
		tree1.add("bit");
		tree1.add("zoo");
		tree1.add("forever");
		tree1.add("banana");
		tree1.add("cherry");
		tree1.add("melon");
		System.out.println("b~f ������ �ܾ� �˻�");
		NavigableSet<String> rangeSet = tree1.subSet("b", true, "f", true);
		for( String word : rangeSet) {
			System.out.println(word);
		}
	}

}