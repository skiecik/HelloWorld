package day2.division;

import java.util.Arrays;

public class TwoParts {

	static String[] twoParts(String str, char separator) {
		int index = str.indexOf(separator);
		String[] arr = new String[2];
		
		arr[0] = str.substring(0, index);
		arr[1] = str.substring(index+1);
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoParts("java - best-language-ever", '-')));
	}
}
