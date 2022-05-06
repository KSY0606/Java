package javaAPI;

public class Member2Ex1 {

	public static void main(String[] args) {

		Member2 original = new Member2("홍길동", 50, new int[] {80,90,70}, new Car("소나타"));
		Member2 cloned = original.getMember();
		cloned.scores[1] = 95;
		cloned.car.model = "그랜저";
		System.out.println("원본객체 필드값 출력");
		System.out.println(original.name);
		System.out.println(original.age);
		for(int i = 0; i < original.scores.length; i++) {
			System.out.println((i+1) + "번쨰 점수 : " + original.scores[i]);
		}
		System.out.println(original.car.model);
		System.out.println("----------------------------");
		
		System.out.println("복제객체 필드값 출력");
		System.out.println(cloned.name);
		System.out.println(cloned.age);
		for(int i = 0; i < cloned.scores.length; i++) {
			System.out.println((i+1) + "번쨰 점수 : " + cloned.scores[i]);
		}
		System.out.println(cloned.car.model);
		System.out.println("----------------------------");
	}
	

}
