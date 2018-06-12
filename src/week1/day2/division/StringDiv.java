package week1.day2.division;

import java.util.Arrays;

public class StringDiv {

	static String[] strDiv(String str) {
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		return strArr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(strDiv("skiecik is the best programmer ever")));
	}
}
