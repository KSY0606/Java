package example;

public class MemberServiceEx {

	public static void main(String[] args) {

		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong", "12345");
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			memberservice.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}