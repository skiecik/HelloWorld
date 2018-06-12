package week1.day3.exercises;

public class ToInteger {

	static int toInt (String str) {
		
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(toInt("23"));
		System.out.println(toInt("sadf"));
		System.out.println(toInt("4"));
	}
}
