package example;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int count = 0;
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택 >> ");
			
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
				case 1:
					creatAccount();
					break;
				case 2:
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run = false;
					break;
			} // switch문
		} // while문
		System.out.println("프로그램 종료");
	} // 메인 메소드
	// 계좌생성하기
	private static void creatAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("초기입금액 : ");
		int balance = scanner.nextInt();
		Account newAccount = new Account(ano, owner, balance);
		accountArray[count] = newAccount;
		count++;
		System.out.println("결과 : 계좌가 생성되었습니다.");
	}
	// 계좌목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
		System.out.println("---------");
		for(int i = 0; i < count; i++) {
		System.out.print(accountArray[i].getAno() + "    " + accountArray[i].getOwner() + "    " + accountArray[i].getBalance());
		System.out.println();
		}
	}
	// 예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("예금액 : ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌번호가 존재하지않습니다.");
		}else {
			account.setBalance(account.getBalance() + balance);
			System.out.println("예금이 성공되었습니다.");
		}
	}
	// 출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("출금액 : ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("결과 : 계좌번호가 존재하지않습니다.");
		}else {
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금이 성공되었습니다.");
		}
	}
	//Account배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i = 0; i < count; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
		
	}
}
