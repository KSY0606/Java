package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {

		int amount = 0;
		Account chulsu = new Account();
		chulsu.accountNo = "111-222-3333";
		chulsu.ownerName = "��ö��";
		chulsu.balance = 1500;
		Account younghee = new Account();
		younghee.accountNo = "111-333-5555";
		younghee.ownerName = "�̿���";
		younghee.balance = 0;
		
		younghee.deposit(2000);
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
