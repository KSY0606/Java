package javaClass;
 // ������̼� ���� Ŭ����
public class Service {
	// �޼ҵ�
	@PrintAnnotation
	public void method1() {
		System.out.println("�޼ҵ�1 ����");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("�޼ҵ�2 ����");
	}
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("�޼ҵ�3 ����");
	}
}
