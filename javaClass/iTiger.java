package javaClass;

public class iTiger extends Animal implements iAnimal{

	@Override // iAnimal�� �߻�޼���
	public void eat() {

		System.out.println("������� ��ƸԽ��ϴ�.");
	}

	@Override // Animal�� �߻�޼���
	void move() {
		System.out.println("�׹߷� �̵��մϴ�.");
		
	}

	
}
