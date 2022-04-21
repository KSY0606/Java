package javaObject;

import java.util.Calendar;

public class EnumEx1 {

	public static void main(String[] args) {

		//열거타입
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일요일은 (1) ~ 토요일(7)로 출력됨
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		System.out.println("오늘 요일 : " + today);
		if(today == Week.SUNDAY) {
			System.out.println("그냥 편하게 쉽니다");
		}else {
			System.out.println("열심히 자바 공부합니다");
		}
	}

}
