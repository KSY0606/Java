package example;
// ���� ���� Ŭ����
public class Account19 {

	// ���
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	// �ʵ�
	private int balance;
	
	public int getBalance() {
			return balance;
		}
	
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
		this.balance = balance;
		
	}
}
}