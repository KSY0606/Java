package javaSpecial;
// 제네릭 타입 클래스
public class Box<T> { 

	// 객체 필드
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	
}
