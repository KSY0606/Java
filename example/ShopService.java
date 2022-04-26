package example;

public class ShopService {  // ΩÃ±€≈Ê

	private static ShopService shopservice = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return shopservice;
	}
}
