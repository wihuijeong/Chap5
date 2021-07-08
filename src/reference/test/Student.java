package reference.test;

public class Student {
	int studentID;
	String studentName;
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject("����");
		math = new Subject("����");
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		korea = new Subject("����");
		math = new Subject("����");
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
		System.out.println(studentName + "�л��� " + korea.subjectName + "������ ������ "
				 + korea.getSubjectScore() + "��, " + math.subjectName + "������ ������ "
				 + math.getSubjectScore() + "��, ������" + total + "�Դϴ�.");
	}

}
