package javaClass;
 // 컴퓨터(계산기)
public class Computer {

	// 배열 처리 메소드
	int sum(int[] values) {
		int hap = 0;
		for(int i = 0; i < values.length; i++) {
			hap += values[i];
		}
		return hap;
	}
	int sum2(int ... values ) {  // 배열을 사용하지않고 매개변수의 값이 몇개인지 모를때 ...을 사용
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	} 
}
