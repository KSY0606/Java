package review;

public class SportCar {

	//�ʵ�
	public int speed;
	
	//�޼���
	public void speedUp() {
		speed += 1;
	}
	// final�޼���
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
	
}
