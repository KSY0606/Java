package javaAPI;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		// �迭 ���� API
		int[] scores = {75,96,80,90,83};
		Arrays.sort(scores); // ������������ ��������
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
    	/* for(int i = scores.length-1; i >= 0; i--) {
			System.out.println(scores[i]);  �� �������� */    // for�� ���ǽĿ��� length-1�� �����, i�� 4�� �Ǹ鼭 scores[i]�� �����ȴ�. 
		}
		String[] names = {"��ö��","ȫ�浿","�̿���"};
		Arrays.sort(names);
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
