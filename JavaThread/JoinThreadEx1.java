package JavaThread;

public class JoinThreadEx1 {

	public static void main(String[] args) {

		JoinThread joinThread = new JoinThread();
		joinThread.start();
		try {
			joinThread.join();  // joinThread가 종료될때까지 메인스레드가 일시정지 된다.
		} catch (InterruptedException e) {
			
		}
		System.out.println("1부터 100까지의 합 = " + joinThread.getSum());
	}

}
