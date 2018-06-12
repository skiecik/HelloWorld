package week1.day2.division;

import java.util.StringTokenizer;

public class TokenCount {

	static int countTokens(String str) {
		StringTokenizer strTok = new StringTokenizer(str);
		return strTok.countTokens();
	}
	
	public static void main(String[] args) {
		System.out.println(countTokens("Best way to do something is not always the easiest"));
	}
}
