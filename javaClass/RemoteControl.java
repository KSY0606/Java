package javaClass;
 // 리모컨 인터페이스
public interface RemoteControl {

	//상수
	public int MAX_VOLUME = 10; // 인터페이스에서는 static final이 자동으로 붙음
	public int MIN_VOLUME = 0;
	//추상메서드
	public void turnOn(); // abstract를 안써도 추상메서드로 인식함.
	public void turnOff();
	public void setVolume(int volume);
	//디폴트메서드
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
