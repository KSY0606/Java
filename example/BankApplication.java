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
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("���� >> ");
			
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
			} // switch��
		} // while��
		System.out.println("���α׷� ����");
	} // ���� �޼ҵ�
	// ���»����ϱ�
	private static void creatAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String owner = scanner.next();
		System.out.print("�ʱ��Աݾ� : ");
		int balance = scanner.nextInt();
		Account newAccount = new Account(ano, owner, balance);
		accountArray[count] = newAccount;
		count++;
		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}
	// ���¸�Ϻ���
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
		for(int i = 0; i < count; i++) {
		System.out.print(accountArray[i].getAno() + "    " + accountArray[i].getOwner() + "    " + accountArray[i].getBalance());
		System.out.println();
		}
	}
	// �����ϱ�
	private static void deposit() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("���ݾ� : ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���¹�ȣ�� ���������ʽ��ϴ�.");
		}else {
			account.setBalance(account.getBalance() + balance);
			System.out.println("������ �����Ǿ����ϴ�.");
		}
	}
	// ����ϱ�
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("��ݾ� : ");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���¹�ȣ�� ���������ʽ��ϴ�.");
		}else {
			account.setBalance(account.getBalance() - balance);
			System.out.println("����� �����Ǿ����ϴ�.");
		}
	}
	//Account�迭���� ano�� ������ Account ��ü ã��
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
