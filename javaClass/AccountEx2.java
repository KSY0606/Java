package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {

		try {
			Account gildong = new Account("111-5555-77777", "ȫ�浿", 10);
			Account chanho = new Account("333-888-9999", "����ȣ", 1000);
			gildong.deposit(2000);
			chanho.deposit(600);
			gildong.withdraw(700);
			printAccount(gildong);
			printAccount(chanho);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// ���� ���� ��� �޼ҵ�
	static void printAccount(Account obj){
		System.out.println("�ŷ� ���� : " + Account.BANKNAME);
		System.out.println("���¹�ȣ : " + obj.accountNo);
		System.out.println("������ �̸� : " + obj.ownerName);
		System.out.println("�ܾ� : " + obj.balance);
		System.out.println("=============================");
	}

}
