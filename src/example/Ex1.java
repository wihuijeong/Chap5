package example;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Function Man = new Ex1Function();
		Man.setage(40);
		Man.setmanName("James");
		Man.setmanMarry(true);
		Man.setpossessionNumber(3);
		
		System.out.println("���� : " + Man.getmanAge());
		System.out.println("�̸� : " + Man.getmanName());
		System.out.println("��ȥ���� : " + Man.getmanMarry());
		System.out.println("�ڳ� �� : " + Man.getpossessionNumber());
	}

}
