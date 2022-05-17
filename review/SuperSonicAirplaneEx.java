package review;

public class SuperSonicAirplaneEx {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = sa.SUPERSONIC;
		sa.fly();
		sa.flyMode = sa.NOMAL;
		sa.fly();
		sa.land();

	}

}
