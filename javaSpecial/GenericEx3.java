package javaSpecial;

import java.util.ArrayList;
import java.util.List;

public class GenericEx3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); // <String>�� ���ָ鼭 StringŸ�Ը� ��밡������
		list.add("ȫ�浿");
		list.add("��ö��");
		String str = list.get(0); // String�� ��� �� �� �ֱ� ������ ����Ÿ�Ժ�ȯ�� ������ �ʾƵ� ������ �ȳ�
		
	}

}
