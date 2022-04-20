package javaObject;

public class Magic {

	public static void main(String[] args) {

		int[][] ma = new int[3][3]; // 마방진 배열
		int num = 1; // 배열에 넣는 숫자
		int row = 0; // 행 변수
		int col = ma[0].length/2; // 열 변수
		ma[row][col] = num;
		for(num = 2; num <= ma.length*ma[0].length; num++) {
			//대각선 위로 이동하는 알고리즘
			row--;
			col++;
			//행도 존재 X 열도 존재 X 경우
			if(row < 0 && col == ma[0].length) {
				row+=2;
				col--;
			}
			//행이 존재하지않을 경우 => 마지막행으로 이동
			if(row < 0) {
				row = ma.length-1; 
			}
			//열이 존재하지 않을 경우 => 첫 열로 이동
			if(col == ma[0].length) {
				col = 0;
			}
			//이미 값이 존재하는 경우
			if(ma[row][col] != 0) { // 아래로 두칸 왼쪽으로 한칸 이동
				row+=2;
				col--; 
			}
			ma[row][col] = num;
		} // for문 종료
		//마방진 출력
		for(int a = 0; a < ma.length; a++) {
			for(int b = 0; b < ma[a].length; b++) {
				System.out.print(ma[a][b] + " ");
			}
			System.out.println();
		}
	}

}
