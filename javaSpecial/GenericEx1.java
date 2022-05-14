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
		
		// 동적 배열
		List list = new ArrayList();
		list.add(10);	// 인덱스0에 주소값이 저장되고 따라가면 값 10이 있다.
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.remove(2);	// 배열에서는 겂울 자울 수 없음!	인덱스2가 지워지면서 인덱스3(40)이 인덱스2로  인덱스4(50)가 3으로 당겨진다
		list.add(80);	// 다시 add를 해주면 인덱스 맨 뒤로 생성됨
		list.add(2, 25); // 중간에 값을 끼워넣을 수 있음
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
