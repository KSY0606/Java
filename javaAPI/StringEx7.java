package javaAPI;

public class StringEx7 {

	public static void main(String[] args) {

		String text = "ȫ�浿,��ö��,����ȣ,�̿���,������";   // "ȫ�浿,��ö��&����ȣ#�̿���,������"; �̷� ��쿡��
		String[] names = text.split(",");			//  String[] names = text.split(",|&|#); �� ����ؾ���. �̷� ������(, # & ��)�� .split������ ��밡��
		/*for(String na : names) {
			System.out.println(na);
		}*/
		for(int i = 0; i < names.length; i ++){
			System.out.println(names[i]);
		}
	}

}
