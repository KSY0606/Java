package javaSpecial;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx1 {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<String, String>();
		map.put("hong" , "12345");
		map.put("chan", "11111");
		map.put("young", "22222");
		map.put("son", "77777");
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� >> ");
			String id = scan.next();
			System.out.print("��й�ȣ >> ");
			String pw = scan.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��� ���̵�� �������� �ʽ��ϴ�.");
			}
		} // while��
	}

}
