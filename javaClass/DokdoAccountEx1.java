package javaClass;

public class DokdoAccountEx1 {

	public static void main(String[] args) {

		DokdoAccount younghee = new DokdoAccount("111-222-1234", "�̿���", 0, 0);
		younghee.deposit(50000);
		System.out.println("���� ��� ��� : " + younghee.point);
		System.out.println("�ܾ� : " + younghee.balance);
		younghee.deposit(30000);
		System.out.println("���� ��� ��� : " + younghee.point);
		System.out.println("�ܾ� : " + younghee.balance);
	}

}
