package javaSpecial;
 // ���ٽ� (�Լ���ǥ��) = �͸�����ü�� �����ϰ� ǥ���ϴ� ��
public class PersonEx1 {

	public static void main(String[] args) {
			//�Ϲ����� �͸� ��ü ����
		/*Person gildong = new Person() {
			
			@Override
			public void info() {
				System.out.println("���� ���ο� ��� ȫ�浿�Դϴ�.");
				
			}
		};
		gildong.info();*/
		
			// ���ٽ� ǥ��
		/*Person gildong;
		gildong = () -> {
			System.out.println("���� ���ο� ��� ȫ�浿�Դϴ�.");
			System.out.println("�ڹ� �� ������ ���� �ֽ��ϴ�.");
		};
		gildong.info();*/
		
		Person gildong;
		gildong = () -> System.out.println("���� ���ο� ��� ȫ�浿�Դϴ�.");   // ���๮�� �ϳ���� �߰�ȣ{} ���̵� ��� ����
		gildong.info();
	}

}
