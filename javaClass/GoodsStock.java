package javaClass;

public class GoodsStock {

	// �ʵ�
	String goodsCode; // ��ǰ�ڵ� 
	int stockNum; // ������
	
	// �޼ҵ�
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
