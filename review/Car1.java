package review;

public class Car1 {
		// ������ �����ε�
	
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car1(){    // 1������
	}
	
	Car1(String model){    // 2������
		this.model = model;
	}
	Car1(String model, String color){    // 3������
		this.model = model;
		this.color = color;
	}
	Car1(String model, String color, int maxSpeed){    // 4������
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
