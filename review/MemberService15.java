package review;

public class MemberService15 {
	// 클래스 15
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
