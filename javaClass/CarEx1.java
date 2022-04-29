package javaClass;

public class CarEx1 {

	public static void main(String[] args) {

		Car chulsuCar = new Car();
		
		for(int i = 1; i < 7; i++) {
			int problemLocation = chulsuCar.run();
			/*switch(problemLocation) {
				case 1:
					System.out.println("앞 왼쪽 KumhoTire로 교체");
					chulsuCar.frontLeftTire = new KumhoTire("앞 왼쪽", 15);
					break;
				case 2:
					System.out.println("앞 오른쪽 KumhoTire로 교체");
					chulsuCar.frontRightTire = new KumhoTire("앞 오른쪽", 12);
					break;
				case 3:
					System.out.println("뒤 왼쪽 Hankooktire로 교체");
					chulsuCar.backLeftTire = new HankookTire("뒤 윈쪽", 10);
					break;
				case 4:
					System.out.println("뒤 오른쪽 HankookTire로 교체");
					chulsuCar.backRightTire = new HankookTire("뒤 오른쪽", 13);
					break;
			}*/
			if(problemLocation != 0) {
				System.out.println(chulsuCar.tires[problemLocation-1].location + "HankookTrie로 교체");
				chulsuCar.tires[problemLocation-1] = new HankookTire(chulsuCar.tires[problemLocation-1].location, 15);
			}
			System.out.println("===========================");
		}
	}

}
