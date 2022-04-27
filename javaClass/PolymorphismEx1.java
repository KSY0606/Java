package javaClass;

public class PolymorphismEx1 {
  // 다형성
	public static void main(String[] args) {

		/* Account chulsu = new Account();
		CheckingAccount gildong = new CheckingAccount();     다형성 아님*/
		
		Account chulsu = new CheckingAccount();
		Account chanho = new CreditLineAccount();
		
	}

}
