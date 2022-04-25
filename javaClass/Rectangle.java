package javaClass;
 // 사각형의 면적 클래스
public class Rectangle {
	// 필드
	private int width, height; // 넓이, 높이
	
	// 생성자
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("너비와 높이는 양수여야 합니다.");
		}
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드   사각형의 면적
	int getArea() {
		return width*height;
	}
	
}
