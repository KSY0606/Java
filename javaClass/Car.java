package javaClass;

public class Car {

	//�ʵ�
	/*Tire frontLeftTire = new Tire("�� ����" , 6);
	Tire frontRightTire = new Tire("�� ������" , 4);
	Tire backLeftTire = new Tire("�� ����" , 3);
	Tire backRightTire = new Tire("�� ������" , 5);*/
	Tire[] tires = {
			new Tire("�� ����" , 6),
			new Tire("�� ������" , 4),
			new Tire("�� ����" , 3),
			new Tire("�� ������" , 5)
	};
	
	//������
	//�޼ҵ�
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		/*if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}*/
		for(int i = 0; i < tires.length; i++) {
			if(tires[i].roll() == false) {
				stop();
				return (i + 1);
			}
		}
		return 0;
	}
	
	//�޼ҵ�
	void stop() {
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
