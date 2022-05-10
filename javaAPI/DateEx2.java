package javaAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateEx2 {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		if(currentDate.isLeapYear()) {
			System.out.println("올해는 운년입니다. 2월달이 29일까지 있습니다.");
		}else {
			System.out.println("올해는 평년입니다. 2월달이 28일까지 있습니다.");
		}
		System.out.println(currentDate.isLeapYear());
		System.out.println("현재 날짜 : " + currentDate);
		LocalDate targetDate = LocalDate.of(2022, 11, 25);
		System.out.println("수료 일자 : " + targetDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);  // 출력값 맨뒤는 나노세컨드
		LocalTime targetTime = targetTime = LocalTime.of(7, 30);
		System.out.println("기상 시간 : " + targetTime);
		LocalDateTime currDT = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + currDT);
		LocalDateTime targetDateTime = LocalDateTime.of(2022, 5, 25, 9, 10);
		System.out.println("시험 날짜와 시간 : " + targetDateTime);
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("현재 뉴욕날짜와 시간 : " + newYorkDateTime);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.getYear() + "년 " + now.getMonthValue() + "월 " + now.getDayOfMonth() + "일");
		System.out.println(now.getDayOfWeek());
	}

}
