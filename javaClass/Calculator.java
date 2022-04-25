package javaClass;
 // 계산기
public class Calculator {

	// 총점 메소드
	int total(int kor, int eng, int mat) {
		int hap = kor + eng + mat;
		return hap;
	}
	
		double average(int kor, int eng, int mat) {
			double avg = (kor + eng + mat) / 3.0;
			return avg;
		
	}
}
