package javaAPI;

public class MemberEx1 {

	public static void main(String[] args) {

		//인스턴스 객체 생성
		Member original = new Member("hong", "홍길동", "12345", 50, true);
		Member cloned = original.getMember();
		cloned.password = "77777";
		System.out.println("원본객체 필드값 출력");
		System.out.println(original.id);
		System.out.println(original.name);
		System.out.println(original.password);
		System.out.println(original.age);
		System.out.println(original.adult);
		System.out.println("-----------------------");
		System.out.println("복제객체 필드값 출력");
		System.out.println(cloned.id);
		System.out.println(cloned.name);
		System.out.println(cloned.password);
		System.out.println(cloned.age);
		System.out.println(cloned.adult);
	}

}
