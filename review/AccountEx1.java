package review;

public class AccountEx1 {

	public static void main(String[] args) {
		int amount = 0;
		Account chulsu = new Account();
		chulsu.accountNo = "111-1234-123456";
		chulsu.ownerName = "���ڹ�";
		chulsu.balance = 1000;
		Account younghee = new Account();
		younghee.accountNo = "111-222-33333";
		younghee.ownerName = "���ڹ�";
		younghee.balance = 500;
		
		younghee.deposit(1000);
		chulsu.deposit(300);
		younghee.deposit(1000);
		try {
			amount = younghee.withdraw(10000);
			System.out.println("ã�� �ݾ� = " + amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�ܾ� : " + younghee.balance);
		}
	}

}
