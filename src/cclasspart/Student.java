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
		std.studentName = "ȫ�浿";
		std.address = "�λ�� ��� �ַʵ�";
		std.showStudentInfo();
	}

}
