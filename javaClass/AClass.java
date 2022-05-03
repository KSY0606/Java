package javaClass;
 // 중첩클래스
public class AClass {

	class BClass {
		//필드
		int bField;
		// static int bField2; 인스턴스 클래스에서는 정적필드 불가능
		//생성자
		public BClass() {
			
		}
		//메소드
		void bMethod() {
			
		}
	}
	static class CClass { // 정적클래스
		int cField;
		static int cField2; // 정적클래스에서는 정적필드 가능
		//생성자
		public CClass() {
			
		}
		void cMethod() {
			
		}
		//정적메소드 가능
		static void cMethod2() {
			
		}
	}
	void aMethod() {
		class DClass {
			//필드
			int dField;
			//static int dField2;
			//생성자
			public DClass() {
				System.out.println("DClass가 생성됨");
			}
			//메서드
			void dMethod() {
			}
			//	static void dMethod2() {}
		}
	} // aMethod()
}