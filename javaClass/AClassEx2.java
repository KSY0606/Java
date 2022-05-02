package javaClass;

public class AClassEx2 {

	public static void main(String[] args) {

		AClass.CClass cClass = new AClass.CClass(); // 내부 정적클래스 객체 생성
		cClass.cMethod();
		cClass.cField = 30;
	}
		//정적 내부 클래스를 사용하려면 외부클래스 객체를 생성 할 필요가 없고, 외부클래스를 통해 생성하면 된다.
}
