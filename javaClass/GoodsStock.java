package javaClass;

public class GoodsStock {

	// 필드
	String goodsCode; // 상품코드 
	int stockNum; // 재고수량
	
	// 메소드
	void addStock(int stock) {
		stockNum += stock;
	}
	
	int subtrackStock(int stock) {
		if(stockNum < stock) {
			return 0;
		}
		stockNum -= stock;
		return stock;
	}
}
