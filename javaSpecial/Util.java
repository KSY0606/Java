package javaSpecial;

public class Util {
	// 제네릭 타입 메서드
	public static <T> Box<T> Boxing(T t) {
	Box<T> box = new Box<T>();
	box.setT(t);
	return box;
		
	}
	
}
