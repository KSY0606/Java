package javaClass;

public class RectangleEx1 {

	public static void main(String[] args) {

		try {
			Rectangle rect1 = new Rectangle(2, 30);
			rect1.setWidth(20);
			System.out.println("사각형의 너비 : " + rect1.getWidth());
			System.out.println("사각형의 높이 : " + rect1.getHeight());
			System.out.println("사각형의 면적 : " + rect1.getArea());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
