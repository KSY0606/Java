package javaClass;

public class HankookTire extends Tire{
	
	//�ʵ�
	//������/
	public HankookTire(String location, int maxlotation) {
		super(location, maxlotation);
	}
	
	//�޼ҵ�
	@Override
	public boolean roll() {
		accmulateRotation++; // ���� ȸ���� ����
		if(accmulateRotation < maxRotation) {
			System.out.println(location + "HankookTire�� ���� : " + (maxRotation-accmulateRotation) + "ȸ");
			return true;
		}else {
			System.out.println("****" + location + "HankookTire ��ũ ****");
			return false;
		}
	}
}
