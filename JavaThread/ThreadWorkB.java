package JavaThread;

public class ThreadWorkB extends Thread{
	// ��ü �ʵ�
		private WorkObject object;
		// ������
		public ThreadWorkB(WorkObject object) {
			this.object = object;
		}
		// �޼��� �������̵�
		@Override
		public void run() {
			for(int i = 0; i <= 10; i++) {
				object.methodB();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
