package APIConfirm;

public class Student {
	// �ʵ�
	private String studentNum;
	// ������
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	// �޼���
	public String getStudentNum() {
		return studentNum;
	}
	// �޼��� �������̵�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) { // ��ü Ȯ�� 
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
