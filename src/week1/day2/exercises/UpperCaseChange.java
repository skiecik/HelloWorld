package week1.day2.exercises;

public class UpperCaseChange {

	static String upperCase (String str, int index) {
		char[] arr = str.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			if (i % index == 0)
				 stringBuilder.append(Character.toUpperCase(arr[i]));
			else
				stringBuilder.append(arr[i]);
		}
		
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(upperCase("skiecik is a programmer", 2));
	}
}
