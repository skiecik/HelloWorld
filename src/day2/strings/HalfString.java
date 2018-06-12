package day2.strings;

public class HalfString {

	static String half(String str) {
		return str.substring(0, str.length()/2);
	}
	
	public static void main(String[] args) {
		System.out.println(half("skiecik is the best"));
	}
}
