package javaClass;
 // ���� ���� Ŭ����
public class Account {
		// �ʵ�
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
	int withdraw(int amount) {
		if(balance < amount) {
			return 0;
			}
		balance -= amount;
		return amount;
		}
	
}
