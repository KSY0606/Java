package javaClass;

public class AnimalEx1 {

	public static void main(String[] args) {

		Tiger tiger1 = new Tiger();
		Eagle eagle1 = new Eagle();
		tiger1.name = "호돌이";
		tiger1.age = 2;
		eagle1.name = "위니";
		eagle1.home = "소나무둥지";
		System.out.println(tiger1.name + "는 " + tiger1.age + "살 입니다.");
		tiger1.move();
		System.out.println(eagle1.name + "는 " + eagle1.home + "에 삽니다.");
		eagle1.move();
	}

}
