package javaClass;
 // ������ �������̽�
public interface RemoteControl {

	//���
	public int MAX_VOLUME = 10; // �������̽������� static final�� �ڵ����� ����
	public int MIN_VOLUME = 0;
	//�߻�޼���
	public void turnOn(); // abstract�� �Ƚᵵ �߻�޼���� �ν���.
	public void turnOff();
	public void setVolume(int volume);
	//����Ʈ�޼���
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("����ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	//�����޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
