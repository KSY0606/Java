package javaClass;

public class VehicleEx1 {

	public static void main(String[] args) {

		Vehicle vehicle; // Ż�� ����
		vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare();
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}
