package example;

public class MemberService {

	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	// 로그아웃 메소드
	void logout(String id) {
		if(id.equals("hong")) {
		System.out.println("로그아웃 되었습니다.");
		}
	}
}
