package review;

public class AdvancedForExample {

	public static void main(String[] args) {

		// ���� for��
		
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		} // for�� ����
		System.out.println("���� = " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("��� = " + avg);
	}

}
