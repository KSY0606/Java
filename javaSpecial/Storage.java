package javaSpecial;
 // 제네릭 타입 인터페이스
public interface Storage<T> {

	// 추상메서드
	public void add(T item, int index);
	public T get(int index);
}
