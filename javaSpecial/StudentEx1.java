package javaSpecial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class StudentEx1 {

	// List 동적 배열 객체 필드
		private static List<Student> list = Arrays.asList(new Student("김철수", 80, 96, 85), new Student("홍길동", 90, 70, 65), new Student("이영희", 77, 80, 90));

	public static void main(String[] args) {

		System.out.println("[학생 이름]");
		printName(t -> t.getName());
		System.out.println("[국어 점수]");
		printScore(t -> t.getKorScore());
		System.out.println("[영어 점수]");
		printScore(t -> t.getEngScore());
		System.out.println("[수학 점수]");
		printScore(t -> t.getMatScore());
		
	} // main
	
	// 성적 자료 출력 메서드 (이름출력)
	public static void printName(Function<Student, String> function) {
		for(Student stu:list) {
			System.out.print(function.apply(stu) + "  ");
		}
		System.out.println();
	}
	// 성적 자료 출력 메서드 (점수출력)
	public static void printScore(ToIntFunction<Student> function) {
		for(Student stu:list) {
			System.out.print(function.applyAsInt(stu) + "  ");
		}
		System.out.println();
	}
}
