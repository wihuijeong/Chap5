package cclasspart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		int sum = add(3, 5);
		System.out.println(num1 + " + " + num2 + " = " + sum);
		
		System.out.println("1부터10까지의 합 : " + gettotal());
	}
	
	public static int gettotal() {
		int total = 0;
		for(int i=1; i<11; i++) {
			total += i;
		}
		return total;
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		return result;
	}

}
