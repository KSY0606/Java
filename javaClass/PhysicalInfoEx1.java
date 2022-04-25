package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee = new PhysicalInfo("이영희", 10, 132.5f, 37.0f);
		printPhysicalInfo(younghee);
		younghee.update(11, 145.0f, 48.0f);
		printPhysicalInfo(younghee);
		younghee.update(12, 157.0f);
		printPhysicalInfo(younghee);
		younghee.update(13);
		printPhysicalInfo(younghee);
	} // main 메소드
	
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println();
	}
}
