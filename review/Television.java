package review;

public class Television implements RemoteControl{

	// �ʵ�
	private int volume;
	
	//turnOn() �߻� �޼��� ��ü �޼���
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	//turnOff() �߻� �޼����� ��ü �޼���
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ���� : " + this.volume );
	}
}