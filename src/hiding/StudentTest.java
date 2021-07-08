package hiding;

import hiding.test.Student;  //컨트롤 쉬프트 o

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("홍길동");
		System.out.println(student.getStudentName());
	}

}
