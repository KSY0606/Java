package javaClass;
 // �簢���� ���� Ŭ����
public class Rectangle {
	// �ʵ�
	private int width, height; // ����, ����
	
	// ������
	public Rectangle(int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("�ʺ�� ���̴� ������� �մϴ�.");
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

	// �޼ҵ�   �簢���� ����
	int getArea() {
		return width*height;
	}
	
}
