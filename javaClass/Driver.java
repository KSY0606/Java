package javaClass;

public class Driver {

	//�޼ҵ�
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // ��ü Ÿ�� Ȯ��
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
		
	}
}
