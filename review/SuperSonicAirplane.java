package review;

public class SuperSonicAirplane extends Airplane{

	static final int NOMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode = NOMAL;
	
	@Override
	void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����մϴ�.");
		}else {
			//Airplane ��ü�� fly() �޼��� ȣ��
			super.fly();
		}
	}
}
