package iteration_statements;

public class ForEx7 {

	public static void main(String[] args) {

		int footTotal;
		long time1 = System.nanoTime();
		for(int pig = 1; pig <= 17; pig++) {
				for(int ost = 1; ost <= 17; ost++) {
					footTotal = pig * 4 + ost * 2; 
					if(footTotal == 56 && pig + ost == 17) {
						System.out.println("���� " + pig + "���� , Ÿ�� " + ost + "����");
					}
				}
			}
		long time2 = System.nanoTime();
		System.out.println("���α׷� ����ð� = " + (time2-time1));
	}
	
	}
