package week1.day3.exercises;

public class SafeSubstring {

	static String safeGet(String str, int index) {
		try {
			return str.substring(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(safeGet("skiecik", 3));
		System.out.println(safeGet("skiecik", 9));
	}
}
