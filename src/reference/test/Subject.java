package reference.test;

public class Subject {
	String subjectName;
	int subjectScore;
	
	public Subject(String name) {
		subjectName = name;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String name) {
		this.subjectName = name;
	}

	public int getSubjectScore() {
		return subjectScore;
	}

	public void setSubjectScore(int score) {
		this.subjectScore = score;
	}
	
	
}
