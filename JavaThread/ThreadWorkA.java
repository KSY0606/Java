package JavaThread;

public class ThreadWorkA extends Thread{
	// ��ü �ʵ�
	private WorkObject object;
	// ������
	public ThreadWorkA(WorkObject object) {
		this.object = object;
	}
	// �޼��� �������̵�
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
