package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.studentName = "위희정";
		std1.korea.setSubjectName("국어");
		std1.korea.setsubjectScore(95);
		std1.math.setSubjectName("수학");
		std1.math.setsubjectScore(100);
		std1.showStudentInfo();
		
		Student std2 = new Student(1111, "이루마");
		std2.setKorea("국어", 100);
		std2.setMath("수학", 90);
		std2.showStudentInfo();
	}

}
