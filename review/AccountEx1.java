package review;

public class AccountEx1 {

	public static void main(String[] args) {
		int amount = 0;
		Account chulsu = new Account();
		chulsu.accountNo = "111-1234-123456";
		chulsu.ownerName = "김자바";
		chulsu.balance = 1000;
		Account younghee = new Account();
		younghee.accountNo = "111-222-33333";
		younghee.ownerName = "이자바";
		younghee.balance = 500;
		
		younghee.deposit(1000);
		chulsu.deposit(300);
		younghee.deposit(1000);
		try {
			amount = younghee.withdraw(10000);
			System.out.println("찾은 금액 = " + amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("잔액 : " + younghee.balance);
		}
	}

}
