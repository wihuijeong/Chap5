package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "ȫ�浿";
		person.weight = 75.5f;
		person.height = 180;
		
		System.out.println(person.name + "���� Ű�� " + person.height + "cm�̰�, "
				+ "�����Դ� " + person.weight + "kg �Դϴ�.");
		
		Person personWi = new Person("������",160, 10);
		
		System.out.println(personWi.name + "���� Ű�� " + personWi.height + "cm�̰�, "
				+ "�����Դ� " + personWi.weight + "kg �Դϴ�.");
		
	}

}
