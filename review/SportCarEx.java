package review;

public class SportCarEx extends SportCar {
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//오버라이딩 할 수 없음 final이기떄문
	/*@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
		
	}*/
}
