package review;

public class Tire {

	//�ʵ�
	public int maxRotation; // �ִ� ȸ����
	public int accmulatedRotation; // ���� ȸ����
	public String location; // Ÿ�̾� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		this.location = location; // 8���� �ʱ�ȭ
		this.maxRotation = maxRotation; // 6���� �ʱ�ȭ
	}
	
	//�޼���
	public boolean roll() {
		++accmulatedRotation; // ���� ȸ���� 1����
		if(accmulatedRotation < maxRotation) { // ����ȸ��  ���� < �ִ��� ��� ����
			System.out.println(location + "Tire ���� : " + (maxRotation-accmulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + " Tire ��ũ ***"); // ��ũ( ���� = �ִ�)�� ��� ���� 
			return false;
		}
	}
	
}
