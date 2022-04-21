package javaObject;

public class ArrayEx10 {

	public static void main(String[] args) {

		// API를 이용한 배열 복사
		String[] names = {"김철수", "이영희", "홍길동"};
		String[] copyNames = new String[5];
		System.arraycopy(names, 0, copyNames, 0, names.length);
		for(int i = 0; i < copyNames.length; i++) {
			System.out.print(copyNames[i] + " , ");
		}
	}

}
