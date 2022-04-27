package javaClass;
//üũī�� Ŭ����
public class CheckingAccount extends Account { // Account�� �θ�Ŭ����
	//�ʵ�
	String cardNo; // üũī���ȣ
	
	//������
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); // super�� �θ�����ڸ� ȣ���ϴ� ��� 
		this.cardNo = cardNo;
	}
	public CheckingAccount() {

	}
	// �޼ҵ�
	int pay(String cardNo, int amount) throws Exception{ // ī��� �����ϴ� �޼ҵ�
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("ī���ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		return withdraw(amount);
	}
	
}
