package JavaThread;

public class AutoSaveThread extends Thread {
	//메서드
	public void save() {
		System.out.println("작업내용이 저장됨.");
	}
	//메서드 오버라이드
	@Override
	public void run() {
		while(true) {
			System.out.println("문서 작업중...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			save();
		}
	}
}
