package javaObject;

public class ArrayEx10 {

	public static void main(String[] args) {

		// API�� �̿��� �迭 ����
		String[] names = {"��ö��", "�̿���", "ȫ�浿"};
		String[] copyNames = new String[5];
		System.arraycopy(names, 0, copyNames, 0, names.length);
		for(int i = 0; i < copyNames.length; i++) {
			System.out.print(copyNames[i] + " , ");
		}
	}

}
