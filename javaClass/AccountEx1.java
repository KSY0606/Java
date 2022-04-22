package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {

		Account chulsu = new Account();
		chulsu.accountNo = "111-222-3333";
		chulsu.ownerName = "±èÃ¶¼ö";
		chulsu.balance = 1500;
		Account younghee = new Account();
		younghee.accountNo = "111-333-5555";
		younghee.ownerName = "ÀÌ¿µÈñ";
		younghee.balance = 0;
		
		younghee.deposit(2000);
		chulsu.deposit(300);
		younghee.deposit(1000);
		int amount = younghee.withdraw(500);
		System.out.println("Ã£Àº ±Ý¾× = " + amount);
		System.out.println("ÀÜ¾× = " + younghee.balance);
	}

}
