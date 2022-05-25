package review;

public class GoodsInfo {
	
	String code; // 상품코드
	String name; // 상품명
	String maker; // 제조사
	int price; // 표준단가
	double discountRate; // 할인율
	
	
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