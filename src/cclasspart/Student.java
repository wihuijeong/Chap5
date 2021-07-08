package cclasspart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.studentName = "홍길동";
		std.address = "부산시 사상구 주례동";
		std.showStudentInfo();
	}

}
