package javaSpecial;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {

		// 검색기능이 강화된 컬렉션 프레임워크
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(80);
		scores.add(88);
		scores.add(90);
		scores.add(70);
		scores.add(75);
		scores.add(65);
		scores.add(76);
		scores.add(85);
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		System.out.println("85보다 위의 점수 : " + scores.higher(85));
		System.out.println("80보다 아래 점수 : " + scores.lower(80));
	}

}
