package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {

		Account gildong = new Account("111-5555-77777", "홍길동", 10);
		Account chanho = new Account("333-888-9999", "박찬호", 1000);
		gildong.deposit(2000);
		chanho.deposit(600);
		gildong.withdraw(750);
		printAccount(gildong);
		printAccount(chanho);
	}
	// 통장 내역 출력 메소드
	static void printAccount(Account obj){
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("예금주 이름 : " + obj.ownerName);
		System.out.println("잔액 : " + obj.balance);
		System.out.println("=============================");
	}

}
