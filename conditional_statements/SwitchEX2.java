package conditional_statements;

public class SwitchEX2 {

	public static void main(String[] args) {

		char fruit = 'B';
		switch(fruit) {
		case 'A':
		case 'a':
			System.out.println("apple�� ���� 1200���Դϴ�.");
			break;
		case 'B':
		case 'b':
			System.out.println("banana�� ���� 4500���Դϴ�.");
			break;
		case 'G':
		case 'g':
			System.out.println("grape�� ���� 3700���Դϴ�.");
			break;
		default :
			System.out.println("���� �����Դϴ�.");
		}
	
	}

}
