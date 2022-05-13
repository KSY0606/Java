package JavaThread;

public class WorkObjectEx1 {

	public static void main(String[] args) {

		WorkObject object = new WorkObject();
		ThreadWorkA workA = new ThreadWorkA(object);
		ThreadWorkB workB = new ThreadWorkB(object);
		workA.start();
		workB.start();
	}

}
