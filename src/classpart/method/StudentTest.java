package classpart.method;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentName("�̷縶");
		System.out.println(student.getstudentName());
		
		Student student2 = new Student();
		student2.setStudentName("ȫ�浿");
		System.out.println(student2.getstudentName());
		
		System.out.println(student);
		System.out.println(student2);
	}

}
