package javaClass;
 // 은행 계좌 클래스
public class Account {
		// 필드
	String accountNo; // 계좌번호 필드
	String ownerName; // 예금주 이름 필드
	int balance; // 잔액 필드
	
	// 생성자
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	// 디폴트 생성자  는 매개변수가 없음
	Account() {
		
	}
	
		// 메소드
	//예금한다는 메소드
	void deposit(int amount) {
		balance += amount;
	}
	//인출하는 메소드
	int withdraw(int amount) {
		if(balance < amount) {
			return 0;
			}
		balance -= amount;
		return amount;
		}
	
}
