package javaSpecial;

public class Student {
	// 필드
	private String name;
	private int korScore;
	private int engScore;
	private int matScore;
	
	// 생성자
	public Student(String name, int korScore, int engScore, int matscore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matscore;
	}

	public String getName() {
		return name;
	}

	public int getKorScore() {
		return korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}
	
}
