package JavaThread;

public class PrintThreadEx2 {

	public static void main(String[] args) {

		PrintThread2 pt2 = new PrintThread2();
		pt2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		pt2.interrupt();
	}

}
