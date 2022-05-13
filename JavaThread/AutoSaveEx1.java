package JavaThread;

public class AutoSaveEx1 {

	public static void main(String[] args) {

		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);
		autoSave.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}

}
