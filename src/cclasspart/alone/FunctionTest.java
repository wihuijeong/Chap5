package cclasspart.alone;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 20;
		
		int add = add(num1, num2);
		int sub = sub(num1, num2);
		double div = div(num1, num2);
		int mul = mul(num1, num2);
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		return result;
	}
	
	public static int sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
		return result;
	}
	
	public static double div(double num1, double num2) {
		double result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
		return result;
	}
	
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
		return result;
	}

}
