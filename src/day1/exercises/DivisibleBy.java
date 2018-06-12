package day1.exercises;

public class DivisibleBy {

	static boolean divisibleBy (int a, int b) {
		if (a%b == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println(divisibleBy(4, 2));
		System.out.println(divisibleBy(5, 2));
	}
}
