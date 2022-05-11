package JavaThread;

public class StartThread extends Thread{
	//객체 필드
	private Thread targetThread;
	
	//생성자
	public StartThread(Thread target) {
		targetThread = target;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); // 쓰레드 상태
			System.out.println("현재 쓰레드 상태 : " + state);
			if(state == Thread.State.NEW) { // 생성상태라면 -> 실행대기상태로 만듦
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { // 쓰레드가 실행은 마친 상태
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
