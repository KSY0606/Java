package javaClass;

public class AClassEx1 {

	public static void main(String[] args) {

		AClass aClass = new AClass(); // �ν��Ͻ� ��ü ����
		AClass.BClass bClass = aClass.new BClass(); // AClass���ο� �ִ� BClass ��ü ����
		bClass.bField = 10;
		bClass.bMethod();
	}
		//���� Ŭ������ ����Ϸ��� �ܺ�Ŭ������ �ν��Ͻ� ��ü�� ���� �����Ͽ� ����Ѵ�.
}
