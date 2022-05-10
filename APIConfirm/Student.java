package APIConfirm;

public class Student {
	// 필드
	private String studentNum;
	// 생성자
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	// 메서드
	public String getStudentNum() {
		return studentNum;
	}
	// 메서드 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // 객체 확인 
			Student student = (Student)obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
