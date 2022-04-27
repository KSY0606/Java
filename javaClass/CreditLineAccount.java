package javaClass;
// 마이너스 통장
public class CreditLineAccount extends Account{
	//필드
	int creditLine; // 마이너스 한도
	
	public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
		super(accountNo, owner, balance);
		this.creditLine = creditLine;
	}
	public CreditLineAccount() {

	}
	//메소드 오버라이드
	@Override
	int withdraw(int amount) throws Exception{
		if((balance + creditLine) < amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance -= amount;  
		return amount;
	}
}
