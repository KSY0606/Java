package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {

		int amount = 0;
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
		try {
			amount = younghee.withdraw(10000);
			System.out.println("Ã£Àº ±Ý¾× = " + amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ÀÜ¾× : " + younghee.balance);
		}
	}

}
