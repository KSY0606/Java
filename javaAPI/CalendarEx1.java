package javaAPI;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx1 {

	public static void main(String[] args) {
		// 날짜와 시간을 나타내는 API
		// TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar date = Calendar.getInstance();   // Calendar date = Calendar.getInstance(tz);를 입력해주면 로스엔젤레스의 날짜,시간을 알 수 있음      
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년" + month + "월" + day + "일");
		int week = date.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월요일";
			break;
		case Calendar.TUESDAY:
			strWeek = "화요일";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수요일";
			break;
		case Calendar.THURSDAY:
			strWeek = "목요일";
			break;
		case Calendar.FRIDAY:
			strWeek = "금요일";
			break;
		case Calendar.SATURDAY:
			strWeek = "토요일";
			break;
		case Calendar.SUNDAY:
			strWeek = "일요일";
			break;
		}
		System.out.println("오늘은 " + strWeek + "입니다.");
		int hour = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int amPm = date.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		System.out.println("현재 시간은 " +strAmPm + " " + hour + "시 " + minute + "분 " + second + "초입니다.");
	}

}
