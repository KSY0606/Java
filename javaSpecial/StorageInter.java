package javaSpecial;
// 구현 클래스
public class StorageInter<T> implements Storage<T> {

	private T[] count;
	
	//생성자
	public StorageInter(int capacity) {
		this.count = (T[]) (new Object[capacity]); // 배열형태
	}
	
	@Override
	public void add(T item, int index) {
		count[index] = item;
		
	}

	@Override
	public T get(int index) {
		return count[index];
	}
	
}
