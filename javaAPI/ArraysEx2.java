package javaAPI;

import java.util.Arrays;

public class ArraysEx2 {

	public static void main(String[] args) {
		// �迭 ���� API
		int[] scores = {75,96,80,90,83};
		Arrays.sort(scores); 	// ������������ �������ְ� �Էµ� ���� �迭��ġ�� �˷��� 
		int index = Arrays.binarySearch(scores, 80);
		System.out.println("ã�� ��ġ = " + index);
		
		String[] names = {"��ö��","ȫ�浿","�̿���"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� ��ġ = " + index);
		
	}

}
