package javaClass;

public class Tire {

	// �ʵ�
	public int maxRotation; // �ִ�ȸ����(Ÿ�̾����)
	public int accmulateRotation; // ����ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	// ������
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//�޼ҵ�
	public boolean roll() {
		accmulateRotation++; // ���� ȸ���� ����
		if(accmulateRotation < maxRotation) {
			System.out.println(location + "Tire�� ���� : " + (maxRotation-accmulateRotation) + "ȸ");
			return true;
		}else {
			System.out.println("****" + location + "Tire ��ũ ****");
			return false;
		}
	}
}
