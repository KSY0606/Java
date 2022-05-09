package javaAPI;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// ��¥�� ���õ� API
		Date date = new Date(); 
		System.out.println(date);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd (hh�� mm�� ss��"); // ��¥�� ǥ�������� ��  ("yyyy��MM��dd��")�� �����ϴ�. hh�� mm�� ss��
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd(E����)");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy�� D��");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd (HH�� mm�� ss��)"); // HH 0~23�÷� ǥ��
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy-MM-dd (a hh�� mm�� ss��(S))"); // a ����,����   (S)�� �и�������
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyy-MM-dd -W����(a hh�� mm�� ss��(S))"); // W����  ���������� �˷���
		System.out.println(sdf6.format(date));
	}

}
