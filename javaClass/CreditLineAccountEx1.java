package javaClass;

public class CreditLineAccountEx1 {

	public static void main(String[] args) {

		CreditLineAccount sundal = new CreditLineAccount("111-12-56789", "�輱��", 10, 1000000);
		
		sundal.deposit(500);
		try {
			int amount = sundal.withdraw(300000);
			System.out.println("ã�� �ݾ� : " + amount);
			System.out.println("�ܾ� : " + sundal.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
