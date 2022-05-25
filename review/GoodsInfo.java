package review;

public class GoodsInfo {
	
	String code; // ��ǰ�ڵ�
	String name; // ��ǰ��
	String maker; // ������
	int price; // ǥ�شܰ�
	double discountRate; // ������
	
	
	public GoodsInfo(String code, String name, String maker, int price, int discountRate) {
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	void updateDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	int getSellingPrice() {
		return price-(int)(price * discountRate);
	}
	
}