package JavaThread;

public class YieldEx1 {

	public static void main(String[] args) {

		ThreadJob1_yield tJob1 = new ThreadJob1_yield();
		ThreadJob2_yield tJob2 = new ThreadJob2_yield();
		// 2���� ������ ����
		tJob1.start();
		tJob2.start();
		// ������ 2�ʵ��� �Ͻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		tJob1.work = false; // ù��° ������ �纸 ���(tJob2 �����常 ����)
		// ������ 2�ʵ��� �Ͻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
				
		}
		// ù��° ������ �ٽ� ����
		tJob1.work = true;
		
		//������ 2�ʵ��� �Ͻ�����
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
				
		}
		//�� ������ ��� ����
		tJob1.stop = false;
		tJob2.stop = false;
	}

}
