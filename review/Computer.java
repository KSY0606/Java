package review;

public class Computer extends Calculator{

	@Override // 생략 가능하지만 붙여주면 오버라이딩을 컴파일러가 체크해준다.
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
