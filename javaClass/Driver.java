package javaClass;

public class Driver {

	//메소드
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // 객체 타입 확인
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
		
	}
}
