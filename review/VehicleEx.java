package review;

public class VehicleEx {
 // ���� Ÿ�� ��ȯ
	public static void main(String[] args) {

		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();�� ���x
		
		Bus bus = (Bus)vehicle; // ���� Ÿ�� ��ȯ
		
		bus.run();
		bus.checkFare();
		
	}

}
