package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee = new PhysicalInfo("�̿���", 10, 132.5f, 37.0f);
		printPhysicalInfo(younghee);
		younghee.update(11, 145.0f, 48.0f);
		printPhysicalInfo(younghee);
		younghee.update(12, 157.0f);
		printPhysicalInfo(younghee);
		younghee.update(13);
		printPhysicalInfo(younghee);
	} // main �޼ҵ�
	
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("�̸� : " + obj.name);
		System.out.println("���� : " + obj.age);
		System.out.println("Ű : " + obj.height);
		System.out.println("������ : " + obj.weight);
		System.out.println();
	}
}
