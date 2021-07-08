package classpart.method;

public class Student {
	int studentID;
	String studentName;
	int grdae;
	String address;
	
	public String getstudentName() {	//이름을 얻기 위한
		return studentName;
	}
	
	public void setStudentName(String name) {	//이름을 지정하는 
		studentName = name;
//		return;
	}
}
