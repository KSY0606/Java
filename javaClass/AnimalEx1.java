package javaClass;

public class AnimalEx1 {

	public static void main(String[] args) {

		Tiger tiger1 = new Tiger();
		Eagle eagle1 = new Eagle();
		tiger1.name = "ȣ����";
		tiger1.age = 2;
		eagle1.name = "����";
		eagle1.home = "�ҳ�������";
		System.out.println(tiger1.name + "�� " + tiger1.age + "�� �Դϴ�.");
		tiger1.move();
		System.out.println(eagle1.name + "�� " + eagle1.home + "�� ��ϴ�.");
		eagle1.move();
	}

}
