package conditional_statements;

public class SwitchEX2 {

	public static void main(String[] args) {

		char fruit = 'B';
		switch(fruit) {
		case 'A':
		case 'a':
			System.out.println("apple은 개당 1200원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("banana는 개당 4500원입니다.");
			break;
		case 'G':
		case 'g':
			System.out.println("grape는 개당 3700원입니다.");
			break;
		default :
			System.out.println("없는 과일입니다.");
		}
	
	}

}
