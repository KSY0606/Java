package javaClass;
 // ��ǻ��(����)
public class Computer {

	// �迭 ó�� �޼ҵ�
	int sum(int[] values) {
		int hap = 0;
		for(int i = 0; i < values.length; i++) {
			hap += values[i];
		}
		return hap;
	}
	int sum2(int ... values ) {  // �迭�� ��������ʰ� �Ű������� ���� ����� �𸦶� ...�� ���
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	} 
}
