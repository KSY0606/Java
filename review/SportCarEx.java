package review;

public class SportCarEx extends SportCar {
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//�������̵� �� �� ���� final�̱⋚��
	/*@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
		
	}*/
}
