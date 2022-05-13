package JavaThread;

public class PrintThreadEx1 {

	public static void main(String[] args) {

		PrintThread1 pt1 = new PrintThread1();
		pt1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		pt1.setStop(true);
	}

}
