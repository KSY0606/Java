package review;

public class Car1 {
		// 생성자 오버로딩
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car1(){    // 1생성자
	}
	
	Car1(String model){    // 2생성자
		this.model = model;
	}
	Car1(String model, String color){    // 3생성자
		this.model = model;
		this.color = color;
	}
	Car1(String model, String color, int maxSpeed){    // 4생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
