package javaClass;

public class KumhoTire extends Tire{
	//�ʵ�
		//������/
		public KumhoTire(String location, int maxlotation) {
			super(location, maxlotation);
		}
		
		//�޼ҵ�
		@Override
		public boolean roll() {
			accmulateRotation++; // ���� ȸ���� ����
			if(accmulateRotation < maxRotation) {
				System.out.println(location + "KumhoTire�� ���� : " + (maxRotation-accmulateRotation) + "ȸ");
				return true;
			}else {
				System.out.println("****" + location + "KumhoTire ��ũ ****");
				return false;
			}
		}
}
