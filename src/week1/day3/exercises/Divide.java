package week1.day3.exercises;

public class Divide {

	static int divide (String a, String b) {
		int intA, intB;
		int result = 0;
		
		try {
			intA = Integer.parseInt(a);
			intB = Integer.parseInt(b);
			result = intA/intB;
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(divide("4", "2"));
		System.out.println(divide("4", "asd"));
		System.out.println(divide("4", "0"));
		System.out.println(divide("6", "2"));
	}
}
