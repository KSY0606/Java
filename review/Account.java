package review;

public class Account {
	static final String BANKNAME = "��������";
	String accountNo; // ���¹�ȣ
	String ownerName; // ������ �̸�
	int balance; // �ܾ�
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	Account() {
	}
	
	//����
	void deposit(int amount) {
		balance += amount;
	}
	//����
	int withdraw(int amount) throws Exception { 
		if(balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");
			}
		balance -= amount;
		return amount;
		}
}
