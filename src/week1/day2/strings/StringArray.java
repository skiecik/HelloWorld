package week1.day2.strings;

public class StringArray {

	static String stringFromArray (String[] arr) {
		
		String str = "";
		
		for (String s : arr) {
			str+= s;
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String[] arr = {"skiecik", " is", " the", " best"};
		System.out.println(stringFromArray(arr));
	}
}
