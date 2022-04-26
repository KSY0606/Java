package example;

public class Account {
		// 필드
	private String ano; // 계좌번호
	private String owner; // 예금주 이름
	private int balance; // 잔액
	
		// 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
		// 메소드 (Getter, Setter)  필드가 private이면 필드의 값을 사용할 수가 없어서 Getter와 Setter가 필요하다
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}
