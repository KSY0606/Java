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
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 >> ");
			String id = scan.next();
			System.out.print("비밀번호 >> ");
			String pw = scan.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력한 아이디는 존재하지 않습니다.");
			}
		} // while문
	}

}
