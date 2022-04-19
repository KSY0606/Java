package conditional_statements;

public class IFstatementEX1 {

	public static void main(String[] args) {

		int score = 75;
		if(score >= 80) {
			System.out.println("합격입니다");
		}else if(score >= 70){
			System.out.println("대기자입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		System.out.println("수고하셨습니다."); // if문과는 상관없이 무조건 출력됨
		
	}

}
