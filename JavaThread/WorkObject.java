package JavaThread;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadWorkA�� methodA �۾� ����");
		notify(); // �Ͻ����� => ���������
		try {
			wait();  // �Ͻ����� ���·� ����
		} catch (InterruptedException e) {
			
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadWorkB�� methodB �۾� ����");
		notify(); // �Ͻ����� => ���������
		try {
			wait();  // �Ͻ����� ���·� ����
		} catch (InterruptedException e) {
			
		}
	}
}
