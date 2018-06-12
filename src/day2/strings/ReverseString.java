package day2.strings;

public class ReverseString {

	static String revStr (String str) {
		
		return new StringBuilder(str).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(revStr("skiecik"));
	}
}
