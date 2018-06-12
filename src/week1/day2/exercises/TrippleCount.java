package week1.day2.exercises;

public class TrippleCount {

	static int countTriple (String str) {
		int counter = 0;
		
		for (int i = 0; i < str.length()-2; i++) {
			if (str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2))
				counter++;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		System.out.println(countTriple("skieeecik iss"));
	}
}
