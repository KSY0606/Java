package javaObject;

public class ArrayForEx1 {

	public static void main(String[] args) {

		// ���� for��   13,14����
		int[] scores = {95, 80, 90, 76, 88};
		int sum = 0;
		double avg;
		/*for(int i = 0; i < scores.length; i++) {
			sum += scores[i];*/
		for(int sc:scores) {		// for(Ÿ�� ����:�迭��)  �迭���� 8������ �迭������ ������ �����̸�	
			sum+=sc;
		}
		avg = (double)sum/scores.length;
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);
	}

}
