package review;

public class ArrayCopyByForExample {

	public static void main(String[] args) {

		// for���� ����� �迭 ����
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i = 0; i < oldIntArray.length; i++) { // oldIntArray�� �迭���̴� 3 
			newIntArray[i] = oldIntArray[i];
		} // for�� ����
		
		for(int i = 0; i< newIntArray.length; i++) {
			System.out.print(newIntArray[i] + " ");
		}
	}

}
