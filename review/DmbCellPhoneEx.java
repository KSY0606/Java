package review;

public class DmbCellPhoneEx {

	public static void main(String[] args) {

		//DmbCellPhoone ��ü ����
		DmbCellPhone dmb = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmb.model);
		System.out.println("���� : " + dmb.color);
		
		//DmbCellPhone�� �ʵ�
		System.out.println("ä�� : " + dmb.channel);
		
		//CellPhone���κ��� ��ӹ��� �޼��� ȣ��
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice("��������");
		dmb.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿�ε���");
		dmb.sendVoice("�� �� �ݰ����ϴ�");
		dmb.hangUp();
		
		//DmbCellPhone�� �޼��� ȣ��
		dmb.turnOnDmb();
		dmb.changeChannelDmb(12);
		dmb.turnOffDmb();
	}

}
