package javaClass;

public class iTiger extends Animal implements iAnimal{

	@Override // iAnimal의 추상메서드
	public void eat() {

		System.out.println("멧돼지를 잡아먹습니다.");
	}

	@Override // Animal의 추상메서드
	void move() {
		System.out.println("네발로 이동합니다.");
		
	}

	
}
