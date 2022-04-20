package javaObject;

public class SortEx1 {

	public static void main(String[] args) {

		int[] nums = {53, 78, 7, 23, 62};
		int temp;
		// 소트 전 자료 출력
		System.out.println("소트 전 자료");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// 소트 알고리즘 구현
		for(int a = 0; a < nums.length-1; a++) {
			for(int b = a+1; b < nums.length; b++) {
				if(nums[a] > nums[b]) {
					temp = nums[a];
					nums[a] = nums[b];
					nums[b] = temp;
				}
			}
		}
		// 소트 후 자료 출력
		System.out.println("\n소트 후 자료");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
/*	1차원배열 활용 알고리즘 문제
	정렬 = 소트(sort) :  무질서한 자료를 원하는 순서대로 재배열하는것
	오름차순 소트 (Ascending) : 작은것 -> 큰것
	내림차순 소트 (Descending) : 큰것 -> 작은것 */