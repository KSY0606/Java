package javaClass;

public class PolymorphismEx1 {
  // ������
	public static void main(String[] args) {

		/* Account chulsu = new Account();
		CheckingAccount gildong = new CheckingAccount();     ������ �ƴ�*/
		
		Account chulsu = new CheckingAccount();
		Account chanho = new CreditLineAccount();
		
	}

}
