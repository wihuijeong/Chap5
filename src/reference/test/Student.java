package reference.test;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject("국어");
		math = new Subject("수학");
	}
	
	public void setKorea(int score) {
//		korea.subjectScore = score;
		korea.setSubjectScore(score);
	}
	
	public void setMath(int score) {
//		math.subjectScore = score;
		math.setSubjectScore(score);
	}
	
	public void printStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName + "학생의 " + korea.subjectName + "과목의 점수는 "
				 + korea.getSubjectScore() + "점, " + math.subjectName + "과목의 점수는 "
				 + math.getSubjectScore() + "점, 총점은" + total + "입니다.");
	}

}
