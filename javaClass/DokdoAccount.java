package javaClass;
//독도 사랑 통장
public class DokdoAccount extends Account{
	//필드
	int point = 0; // 독도 사랑 기금 포인트
	
	//생성자
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point = point;
	}
	public DokdoAccount() {
		
	}
	//메소드 오버라이드
	@Override
	void deposit(int amount) {
		super.deposit(amount); // 부모 메소드 호출
		point += (int)(amount*0.001);
	}
}
