package javaClass;
// �ٱ� Ŭ����
public class Button {
	//�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	//�������̽�
	interface OnClickListener {
		// �߻�޼���
		void onClick();
	}
}
