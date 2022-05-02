package javaClass;

public class AClassEx1 {

	public static void main(String[] args) {

		AClass aClass = new AClass(); // 인스턴스 객체 생성
		AClass.BClass bClass = aClass.new BClass(); // AClass내부에 있는 BClass 객체 생성
		bClass.bField = 10;
		bClass.bMethod();
	}
		//내부 클래스를 사용하려면 외부클래스의 인스턴스 객체를 먼저 생성하여 사용한다.
}
