package javaSpecial;

public class ProductEx1 {

	public static void main(String[] args) {

		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTV");
		Tv tv = product1.getKind();
		String tvmodel = product1.getModel();
		
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("�ҳ�Ÿ");
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}