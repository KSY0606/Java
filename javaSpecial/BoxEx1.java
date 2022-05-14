package javaSpecial;

public class BoxEx1 {

	public static void main(String[] args) {

		Box<String> box1 = new Box<String>();
		box1.setT("홍길동");
		String name = box1.getT();
		Box<Integer> box2 = new Box<Integer>();
		box2.setT(23);
		int age = box2.getT();
		System.out.println("이름은 " + name + "\n나이는 " + age);
	}

}
