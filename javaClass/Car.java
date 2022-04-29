package javaClass;

public class Car {

	//필드
	/*Tire frontLeftTire = new Tire("앞 왼쪽" , 6);
	Tire frontRightTire = new Tire("앞 오른쪽" , 4);
	Tire backLeftTire = new Tire("뒤 왼쪽" , 3);
	Tire backRightTire = new Tire("뒤 오른쪽" , 5);*/
	Tire[] tires = {
			new Tire("앞 왼쪽" , 6),
			new Tire("앞 오른쪽" , 4),
			new Tire("뒤 왼쪽" , 3),
			new Tire("뒤 오른쪽" , 5)
	};
	
	//생성자
	//메소드
	int run() {
		System.out.println("자동차가 달립니다.");
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
	
	//메소드
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
