package week1.day1.exercises;

public class DogAge {

	static double dogYears (double dogAge) {
		if (dogAge > 2)
			return 21 + (dogAge - 2)*4;
		else
			return dogAge*10.5;
	}
	
	public static void main(String[] args) {
		
		System.out.println(dogYears(1.5));
		System.out.println(dogYears(5));
	}
}
