package javaSpecial;

public class Util {
	// ���׸� Ÿ�� �޼���
	public static <T> Box<T> Boxing(T t) {
	Box<T> box = new Box<T>();
	box.setT(t);
	return box;
		
	}
	
}
