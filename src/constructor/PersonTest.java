package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "홍길동";
		person.weight = 75.5f;
		person.height = 180;
		
		System.out.println(person.name + "님의 키는 " + person.height + "cm이고, "
				+ "몸무게는 " + person.weight + "kg 입니다.");
		
		Person personWi = new Person("위희정",160, 10);
		
		System.out.println(personWi.name + "님의 키는 " + personWi.height + "cm이고, "
				+ "몸무게는 " + personWi.weight + "kg 입니다.");
		
	}

}
