package javaSpecial;

import java.util.ArrayList;
import java.util.List;

public class GenericEx1 {

	public static void main(String[] args) {

	/*	int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		} */
		
	/*	int[] nums = {10, 20, 30, 40, 50};
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		} */
		
		// ���� �迭
		List list = new ArrayList();
		list.add(10);	// �ε���0�� �ּҰ��� ����ǰ� ���󰡸� �� 10�� �ִ�.
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.remove(2);	// �迭������ ���� �ڿ� �� ����!	�ε���2�� �������鼭 �ε���3(40)�� �ε���2��  �ε���4(50)�� 3���� �������
		list.add(80);	// �ٽ� add�� ���ָ� �ε��� �� �ڷ� ������
		list.add(2, 25); // �߰��� ���� �������� �� ����
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
