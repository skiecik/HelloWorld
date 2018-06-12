package week1.day2.strings;

public class LettersInside {

	public static void main(String[] args) {
		String str = "ala ma kota, a kot ma ale";
		char c = str.charAt(str.length() - 2);
		
		System.out.println(c);
		
		int counter = 0;
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c)
				counter++;
		}
		
		System.out.println(counter);
	}
}
