package review;

public class VehicleEx {
 // 강제 타입 변환
	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();는 사용x
		
		Bus bus = (Bus)vehicle; // 강제 타입 변환
		
		bus.run();
		bus.checkFare();
		
	}

}
