package review;

public class CarEx {

	public static void main(String[] args) {

		Car_HankookTire car = new Car_HankookTire(); // Car ��ü ����
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // Car��ü�� run()�޼��� 5�� ����
			
			switch(problemLocation) {
			case 1 :
				System.out.println("�� ���� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�� ����", 14);
				break;
			case 2 :
				System.out.println("�� ������ HankookTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������", 13);
				break;
			case 3 :
				System.out.println("�� ���� HankookTire�� ��ü");
				car.backLeftTire = new HankookTire("�� ����", 15);
				break;
			case 4 :
				System.out.println("�� ������ HankookTire�� ��ü");
				car.backRightTire = new KumhoTire("�� ������", 17);
				break;
			}
			System.out.println("=================================");  // 1ȸ���� ��µǴ� ������ �����ϱ�����
		}
	}

}
