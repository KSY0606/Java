package javaAPI;

import java.util.Arrays;

public class Member2 implements Cloneable {

	//필드
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	//생성자
	public Member2(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
		
	}
	//메서드 오버라이드
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member2 cloned = (Member2) super.clone(); // name과 age는 얕은복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	//메서드
	public Member2 getMember() {
		Member2 cloned = null;
		try {
			cloned = (Member2)clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return cloned;
	}
}
