package javaClass;
 // ��ü���� Ŭ����
public class PhysicalInfo {
	// �ʵ�
	String name; // �̸�
	int age; // ����
	float height, weight; // Ű, ������
	
	// ������
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//�޼ҵ�
	void update(int age) {
		this.age = age;
	}
	
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	 // �޼ҵ� �����ε�
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
