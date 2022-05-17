package review;

public class DmbCellPhoneEx {

	public static void main(String[] args) {

		//DmbCellPhoone 객체 생성
		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로부터 상속받은 필드
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널 : " + dmb.channel);
		
		//CellPhone으로부터 상속받은 메서드 호출
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("여보세요");
		dmb.receiveVoice("안녕하세요 저는 홍길동인데요");
		dmb.sendVoice("아 네 반갑습니다");
		dmb.hangUp();
		
		//DmbCellPhone의 메서드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
	}

}
