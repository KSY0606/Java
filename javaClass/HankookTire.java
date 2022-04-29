package javaClass;

public class HankookTire extends Tire{
	
	//필드
	//생성자/
	public HankookTire(String location, int maxlotation) {
		super(location, maxlotation);
	}
	
	//메소드
	@Override
	public boolean roll() {
		accmulateRotation++; // 누적 회전수 증가
		if(accmulateRotation < maxRotation) {
			System.out.println(location + "HankookTire의 수명 : " + (maxRotation-accmulateRotation) + "회");
			return true;
		}else {
			System.out.println("****" + location + "HankookTire 펑크 ****");
			return false;
		}
	}
}
