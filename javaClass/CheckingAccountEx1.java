package javaClass;

public class CheckingAccountEx1 {

	public static void main(String[] args) {

		CheckingAccount chulsu = new CheckingAccount("222-55-1234", "��ö��", 10000, "1111-2222-3333");
		
		chulsu.deposit(50000);
		try {
		int paidAmount = chulsu.pay("1111-2222-3333", 25000);
		System.out.println("���Ҿ� : " + paidAmount);
		System.out.println("�ܾ� : " + chulsu.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
