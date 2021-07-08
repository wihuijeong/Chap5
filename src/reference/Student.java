package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setsubjectScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setsubjectScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getsubjectScore() + math.getsubjectScore();
		System.out.println(studentName + "학생의 국어 점수는 " + korea.getsubjectScore()
		+ "점, 수학 점수는 " + math.getsubjectScore() + "점, 총점은 " + total + "점입니다.");
	}
	
}