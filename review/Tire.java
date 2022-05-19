package review;

public class Tire {

	//필드
	public int maxRotation; // 최대 회전수
	public int accmulatedRotation; // 누적 회전수
	public String location; // 타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location; // 8라인 초기화
		this.maxRotation = maxRotation; // 6라인 초기화
	}
	
	//메서드
	public boolean roll() {
		++accmulatedRotation; // 누적 회전수 1증가
		if(accmulatedRotation < maxRotation) { // 정상회저  누적 < 최대일 경우 실행
			System.out.println(location + "Tire 수명 : " + (maxRotation-accmulatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + " Tire 펑크 ***"); // 펑크( 누적 = 최대)일 경우 실행 
			return false;
		}
	}
	
}
