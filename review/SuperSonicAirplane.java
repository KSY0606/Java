package review;

public class SuperSonicAirplane extends Airplane{

	static final int NOMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NOMAL;
	
	@Override
	void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			//Airplane 객체의 fly() 메서드 호출
			super.fly();
		}
	}
}
