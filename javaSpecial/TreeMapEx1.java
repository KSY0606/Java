package javaSpecial;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tree1 = new TreeMap<Integer, String>();
		tree1.put(35, "È«±æµ¿");
		tree1.put(10, "±èÃ¶¼ö");
		tree1.put(49, "ÀÌ¿µÈñ");
		tree1.put(30, "¼ÕÈï¹Î");
		tree1.put(50, "¹ÚÁö¼º");
		Map.Entry<Integer, String> entry = null;
		entry = tree1.firstEntry();
		System.out.println("°¡Àå ³·Àº ¹øÈ£ : " + entry.getKey() + " : " + entry.getValue());
		entry = tree1.lastEntry();
		System.out.println("°¡Àå ³ôÀº ¹øÈ£ : " + entry.getKey() + " : " + entry.getValue());
	}

}
