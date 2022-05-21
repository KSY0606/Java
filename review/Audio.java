package review;

public class Audio implements RemoteControl{

	// �ʵ�
	private int volume;
	
	//turnOn() �߻� �޼��� ��ü �޼���
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	//turnOff() �߻� �޼����� ��ü �޼���
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	//setVolume() �߻� �޼����� ��ü �޼���
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume );
	}
}
