package javaClass;

public class Anonymous {

	Person field = new Person() {
		void work() {
			System.out.println("����մϴ�.");
		}
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	//�޼���
	void method1() {
		//���ú���
		Person mField = new Person() {
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		mField.wake(); // �޼���ȿ��� ���ú��� ���
	}
	//�޼���
	void method2(Person person) {
		person.wake();
	}
}