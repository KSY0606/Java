package review;

public class CarEx {

	public static void main(String[] args) {

		Car_HankookTire car = new Car_HankookTire(); // Car 객체 생성
		
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // Car객체의 run()메서드 5번 실행
			
			switch(problemLocation) {
			case 1 :
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞 왼쪽", 14);
				break;
			case 2 :
				System.out.println("앞 오른쪽 HankookTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3 :
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("뒤 왼쪽", 15);
				break;
			case 4 :
				System.out.println("뒤 오른쪽 HankookTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
				break;
			}
			System.out.println("=================================");  // 1회전시 출력되는 내용을 구분하기위해
		}
	}

}
