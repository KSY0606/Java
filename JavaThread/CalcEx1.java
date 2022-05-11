package JavaThread;

public class CalcEx1 {

	public static void main(String[] args) {

		Calc calc = new Calc(); // 인스턴스 객체 생성
		MyThread1 mythread1 = new MyThread1();
		mythread1.setCalc(calc);
		mythread1.start();
		MyThread2 mythread2 = new MyThread2();
		mythread2.setCalc(calc);
		mythread2.start();
	}

}
