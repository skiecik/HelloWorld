package week1.day3.exceptions;

public class DivideException {

	static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(divide(4, 2));
			System.out.println(divide(4, 0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
