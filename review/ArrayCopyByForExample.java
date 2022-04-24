package review;

public class ArrayCopyByForExample {

	public static void main(String[] args) {

		// for문을 사용한 배열 복사
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) { // oldIntArray의 배열길이는 3 
			newIntArray[i] = oldIntArray[i];
		} // for문 종료
		
		for(int i = 0; i< newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
	}

}
