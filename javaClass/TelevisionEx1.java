package javaClass;

public class TelevisionEx1 {

	public static void main(String[] args) {
		RemoteControl rc; // °´Ã¼ ¼±¾ð
		rc = new Television();
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(4);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		RemoteControl.changeBattery();
	}

}
