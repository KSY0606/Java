package review;

public class MemberService15 {
	// Ŭ���� 15
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	public void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	}
}
