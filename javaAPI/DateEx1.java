package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// 날짜에 관련된 API
		Date date = new Date(); 
		System.out.println(date);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd (hh시 mm분 ss초"); // 날짜를 표현형식을 줌  ("yyyy년MM월dd일")도 가능하다. hh시 mm분 ss초
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd(E요일)");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년 D일");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd (HH시 mm분 ss초)"); // HH 0~23시로 표시
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd (a hh시 mm분 ss초(S))"); // a 오전,오후   (S)는 밀리세컨드
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd -W주차(a hh시 mm분 ss초(S))"); // W주차  몇주차인지 알려줌
		System.out.println(sdf6.format(date));
	}

}
