package javaObject;

public class ArrayEx8 {

	public static void main(String[] args) {

		System.out.println("�ζ� �ڵ���ȣ ������");
		int[] lotto = new int[6];
		boolean run = true;
		while(run) {
			// ��ȣ ���� 6��
			for( int i = 0; i < 6; i++) {
				lotto[i] = (int)(Math.random()*45)+1;
			}
			// ��Ʈ �˰��� Ȱ��
			run = false;
			for(int a = 0; a < lotto.length-1; a++) {
				for(int b = a+1; b < lotto.length; b++) {
					if(lotto[a] == lotto[b]) {
						run = true;
					}
				}
			}
		} // while ����
		for( int i = 0; i < 6; i++) {
			System.out.println(lotto[i]);
		}
	}

}
