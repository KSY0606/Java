package javaAPI;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {

		// ����ǥ����
		Scanner scan = new Scanner(System.in);
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";//"����ǥ����";
		System.out.print("��ȭ��ȣ�� �Է� >> ");
		String data = scan.next();
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("��ȭ��ȣ ������ ��ġ�մϴ�.");
		}else {
			System.out.println("��ȭ��ȣ ������ Ʋ���ϴ�.");
		}
		System.out.print("�̸����� �Է� >> ");
		String email = scan.next();
		String regExpExpEmail = "\\w+@\\w+\\.\\w+(\\.\\w+)?";  //  (\\.\\w+)?"; co.kr���� �̸����� ��� ���Ǿ���ϹǷ� �Է�����
		result = Pattern.matches(regExpExpEmail, email);
		if(result) {
			System.out.println("�̸����ּ� �����Դϴ�.");
		}else {
			System.out.println("�̸����ּ� ������ �ƴմϴ�.");
		}
	}

}
