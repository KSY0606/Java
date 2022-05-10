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
			System.out.println("���ش� ����Դϴ�. 2������ 29�ϱ��� �ֽ��ϴ�.");
		}else {
			System.out.println("���ش� ����Դϴ�. 2������ 28�ϱ��� �ֽ��ϴ�.");
		}
		System.out.println(currentDate.isLeapYear());
		System.out.println("���� ��¥ : " + currentDate);
		LocalDate targetDate = LocalDate.of(2022, 11, 25);
		System.out.println("���� ���� : " + targetDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);  // ��°� �ǵڴ� ���뼼����
		LocalTime targetTime = targetTime = LocalTime.of(7, 30);
		System.out.println("��� �ð� : " + targetTime);
		LocalDateTime currDT = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currDT);
		LocalDateTime targetDateTime = LocalDateTime.of(2022, 5, 25, 9, 10);
		System.out.println("���� ��¥�� �ð� : " + targetDateTime);
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� ���峯¥�� �ð� : " + newYorkDateTime);
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.getYear() + "�� " + now.getMonthValue() + "�� " + now.getDayOfMonth() + "��");
		System.out.println(now.getDayOfWeek());
	}

}
