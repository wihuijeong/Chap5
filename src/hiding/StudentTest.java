package hiding;

import hiding.test.Student;  //��Ʈ�� ����Ʈ o

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("ȫ�浿");
		System.out.println(student.getStudentName());
	}

}
