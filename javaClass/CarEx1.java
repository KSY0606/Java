package javaClass;

public class CarEx1 {

	public static void main(String[] args) {

		Car chulsuCar = new Car();
		
		for(int i = 1; i < 7; i++) {
			int problemLocation = chulsuCar.run();
			/*switch(problemLocation) {
				case 1:
					System.out.println("�� ���� KumhoTire�� ��ü");
					chulsuCar.frontLeftTire = new KumhoTire("�� ����", 15);
					break;
				case 2:
					System.out.println("�� ������ KumhoTire�� ��ü");
					chulsuCar.frontRightTire = new KumhoTire("�� ������", 12);
					break;
				case 3:
					System.out.println("�� ���� Hankooktire�� ��ü");
					chulsuCar.backLeftTire = new HankookTire("�� ����", 10);
					break;
				case 4:
					System.out.println("�� ������ HankookTire�� ��ü");
					chulsuCar.backRightTire = new HankookTire("�� ������", 13);
					break;
			}*/
			if(problemLocation != 0) {
				System.out.println(chulsuCar.tires[problemLocation-1].location + "HankookTrie�� ��ü");
				chulsuCar.tires[problemLocation-1] = new HankookTire(chulsuCar.tires[problemLocation-1].location, 15);
			}
			System.out.println("===========================");
		}
	}

}
