package javaClass;

public class Cheomseongdae {
	
	//���� �ʵ�
	private static Cheomseongdae cheomseongdae = new Cheomseongdae();
	
	//������
	private Cheomseongdae() {
		
	}
	
	// �����޼ҵ�
	static Cheomseongdae getInstance() {
		return cheomseongdae;
	}
	
	void history() {
		System.out.println("���翡�� ���� ������ ������");
	}
}
