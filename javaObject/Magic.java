package javaObject;

public class Magic {

	public static void main(String[] args) {

		int[][] ma = new int[3][3]; // ������ �迭
		int num = 1; // �迭�� �ִ� ����
		int row = 0; // �� ����
		int col = ma[0].length/2; // �� ����
		ma[row][col] = num;
		for(num = 2; num <= ma.length*ma[0].length; num++) {
			//�밢�� ���� �̵��ϴ� �˰���
			row--;
			col++;
			//�൵ ���� X ���� ���� X ���
			if(row < 0 && col == ma[0].length) {
				row+=2;
				col--;
			}
			//���� ������������ ��� => ������������ �̵�
			if(row < 0) {
				row = ma.length-1; 
			}
			//���� �������� ���� ��� => ù ���� �̵�
			if(col == ma[0].length) {
				col = 0;
			}
			//�̹� ���� �����ϴ� ���
			if(ma[row][col] != 0) { // �Ʒ��� ��ĭ �������� ��ĭ �̵�
				row+=2;
				col--; 
			}
			ma[row][col] = num;
		} // for�� ����
		//������ ���
		for(int a = 0; a < ma.length; a++) {
			for(int b = 0; b < ma[a].length; b++) {
				System.out.print(ma[a][b] + " ");
			}
			System.out.println();
		}
	}

}
