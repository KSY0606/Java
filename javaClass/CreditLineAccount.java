package javaClass;
// ���̳ʽ� ����
public class CreditLineAccount extends Account{
	//�ʵ�
	int creditLine; // ���̳ʽ� �ѵ�
	
	public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
		super(accountNo, owner, balance);
		this.creditLine = creditLine;
	}
	public CreditLineAccount() {

	}
	//�޼ҵ� �������̵�
	@Override
	int withdraw(int amount) throws Exception{
		if((balance + creditLine) < amount) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		balance -= amount;  
		return amount;
	}
}
