package JavaThread;

public class CalcThread extends Thread {
	
	// ������
	public CalcThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		int sum = 0;
		for(int i = 1; i <1000000000; i++) {
		//	sum += i;
		}
		System.out.println(getName()+"�� �� �۾� : " + sum);
	}
}
