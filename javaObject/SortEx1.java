package javaObject;

public class SortEx1 {

	public static void main(String[] args) {

		int[] nums = {53, 78, 7, 23, 62};
		int temp;
		// ��Ʈ �� �ڷ� ���
		System.out.println("��Ʈ �� �ڷ�");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		// ��Ʈ �˰��� ����
		for(int a = 0; a < nums.length-1; a++) {
			for(int b = a+1; b < nums.length; b++) {
				if(nums[a] > nums[b]) {
					temp = nums[a];
					nums[a] = nums[b];
					nums[b] = temp;
				}
			}
		}
		// ��Ʈ �� �ڷ� ���
		System.out.println("\n��Ʈ �� �ڷ�");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
/*	1�����迭 Ȱ�� �˰��� ����
	���� = ��Ʈ(sort) :  �������� �ڷḦ ���ϴ� ������� ��迭�ϴ°�
	�������� ��Ʈ (Ascending) : ������ -> ū��
	�������� ��Ʈ (Descending) : ū�� -> ������ */