package javaAPI;

import java.text.DecimalFormat;

public class FormatEx1 {

	public static void main(String[] args) {
		// 숫자 형식 클래스
		DecimalFormat df;
		double num1 = 23.526124;
		df = new DecimalFormat("0.000"); // .을 기준으로 정해진 자리만큼 소수점이 출력됨
		System.out.println(df.format(num1));
		int num2 = 7850000;
		df = new DecimalFormat("#,###원");
		System.out.println(df.format(num2));
		double num3 = 0.25264;
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num3));
	}

}
