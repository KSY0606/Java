package review;

public class MemberService15Ex {

	public static void main(String[] args) {

		MemberService15 memberService = new MemberService15();
		
		boolean result = memberService.login("hong" , "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		}else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
