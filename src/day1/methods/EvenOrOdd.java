package day1.methods;

public class EvenOrOdd {

	public static String checkEven(int number) {
		if (number%2 == 0)
			return "even";
		else
			return "odd";
	}
	
	public static void main(String[] args) {
		System.out.println(checkEven(24));
		System.out.println(checkEven(13));
		System.out.println(checkEven(52));
		System.out.println(checkEven(7));
	}
}
