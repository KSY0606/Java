package review;

interface RemoteControl { // 디폴트 메서드 

	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적메서드
	static void changeBattery() {
		System.out.println(" 건전지를 교환합니다.");
	}
}
