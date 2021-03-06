package javaClass;
 // 신체정보 클래스
public class PhysicalInfo {
	// 필드
	String name; // 이름
	int age; // 나이
	float height, weight; // 키, 몸무게
	
	// 생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드
	void update(int age) {
		this.age = age;
	}
	
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	 // 메소드 오버로딩
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
