package week1.day1.methods;

public class CheckAge {

	public static boolean checkMaturity(int age) {
		if (age < 18)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkMaturity(18));
		System.out.println(checkMaturity(16));
		System.out.println(checkMaturity(21));
	}
}
