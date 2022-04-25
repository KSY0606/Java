package javaClass;

public class Cheomseongdae {
	
	//정적 필드
	private static Cheomseongdae cheomseongdae = new Cheomseongdae();
	
	//생성자
	private Cheomseongdae() {
		
	}
	
	// 정적메소드
	static Cheomseongdae getInstance() {
		return cheomseongdae;
	}
	
	void history() {
		System.out.println("동양에서 가장 오래된 관측대");
	}
}
