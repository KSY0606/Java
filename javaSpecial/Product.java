package javaSpecial;
// 제네릭 멀티 타입 클래스
public class Product <T, M>{

	private T kind; // 제품종류
	private M model; // 제품모델
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
