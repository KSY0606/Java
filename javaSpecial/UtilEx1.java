package javaSpecial;

public class UtilEx1 {

	public static void main(String[] args) {

		Box<Integer> box1 = Util.Boxing(50);
		int value = box1.getT();
		Box<String> box2 = Util.Boxing("±èÃ¶¼ö");
		String name = box2.getT();
	}

}
