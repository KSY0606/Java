package javaClass;
// 바깥 클래스
public class Button {
	//인터페이스 타입 필드
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	//인터페이스
	interface OnClickListener {
		// 추상메서드
		void onClick();
	}
}
