package day2.strings;

public class CheckPalindrome {

	static boolean checkPalindrome(String str) {
		String toCheck = str.replaceAll(" ", "");
		char[] arr = toCheck.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[arr.length-1-i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("kajak"));
		System.out.println(checkPalindrome("skiecik"));
	}
}
