package javaClass;
//체크카드 클래스
public class CheckingAccount extends Account { // Account는 부모클래스
	//필드
	String cardNo; // 체크카드번호
	
	//생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance); // super는 부모생성자를 호출하는 명령 
		this.cardNo = cardNo;
	}
	public CheckingAccount() {

	}
	// 메소드
	int pay(String cardNo, int amount) throws Exception{ // 카드로 지불하는 메소드
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("카드번호가 일치하지 않습니다.");
		}
		return withdraw(amount);
	}
	
}
