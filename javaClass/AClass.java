package javaClass;
 // ��øŬ����
public class AClass {

	class BClass {
		//�ʵ�
		int bField;
		// static int bField2; �ν��Ͻ� Ŭ���������� �����ʵ� �Ұ���
		//������
		public BClass() {
			
		}
		//�޼ҵ�
		void bMethod() {
			
		}
	}
	static class CClass { // ����Ŭ����
		int cField;
		static int cField2; // ����Ŭ���������� �����ʵ� ����
		//������
		public CClass() {
			
		}
		void cMethod() {
			
		}
		//�����޼ҵ� ����
		static void cMethod2() {
			
		}
	}
	void aMethod() {
		class DClass {
			//�ʵ�
			int dField;
			//static int dField2;
			//������
			public DClass() {
				System.out.println("DClass�� ������");
			}
			//�޼���
			void dMethod() {
			}
			//	static void dMethod2() {}
		}
	} // aMethod()
}