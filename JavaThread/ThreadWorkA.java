package JavaThread;

public class ThreadWorkA extends Thread{
	// 객체 필드
	private WorkObject object;
	// 생성자
	public ThreadWorkA(WorkObject object) {
		this.object = object;
	}
	// 메서드 오버라이드
	@Override
	public void run() {
		for(int i = 0; i <= 10; i++) {
			object.methodA();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
