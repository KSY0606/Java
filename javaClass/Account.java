package javaClass;
 // ���� ���� Ŭ����
public class Account {
		// �ʵ�
	static final String BANKNAME = "��������";
	String accountNo; // ���¹�ȣ �ʵ�
	String ownerName; // ������ �̸� �ʵ�
	int balance; // �ܾ� �ʵ�
	
	// ������
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	// ����Ʈ ������  �� �Ű������� ����
	Account() {
		
	}
	
		// �޼ҵ�
	//�����Ѵٴ� �޼ҵ�
	void deposit(int amount) {
		balance += amount;
	}
	//�����ϴ� �޼ҵ�
	int withdraw(int amount) throws Exception { 
		if(balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
			}
		balance -= amount;
		return amount;
		}
	
}
