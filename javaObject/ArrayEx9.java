package javaObject;

public class ArrayEx9 {

	public static void main(String[] args) {

		// 배열 복사
		int[] nums = {10, 20, 30};
		int[] copyNums = new int[5];
		for(int i = 0; i < nums.length; i++) {
			copyNums[i] = nums[i];
		}
		// 자료 출력
		for(int i = 0; i < copyNums.length; i++) {
			System.out.print(copyNums[i] + " ");
		}
	}

}
