package javaClass;
//���� ��� ����
public class DokdoAccount extends Account{
	//�ʵ�
	int point = 0; // ���� ��� ��� ����Ʈ
	
	//������
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point = point;
	}
	public DokdoAccount() {
		
	}
	//�޼ҵ� �������̵�
	@Override
	void deposit(int amount) {
		super.deposit(amount); // �θ� �޼ҵ� ȣ��
		point += (int)(amount*0.001);
	}
}
