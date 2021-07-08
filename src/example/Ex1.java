package example;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Function Man = new Ex1Function();
		Man.setage(40);
		Man.setmanName("James");
		Man.setmanMarry(true);
		Man.setpossessionNumber(3);
		
		System.out.println("나이 : " + Man.getmanAge());
		System.out.println("이름 : " + Man.getmanName());
		System.out.println("결혼여부 : " + Man.getmanMarry());
		System.out.println("자녀 수 : " + Man.getpossessionNumber());
	}

}
