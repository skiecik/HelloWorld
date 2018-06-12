package week1.day2.exercises;

public class CaesarCipher {

	public static String encode(String str, int shift) {
		char[] arr = str.toCharArray();
		StringBuilder strBuild = new StringBuilder();
		
		for (char c : arr) {
			
			if (Character.isWhitespace(c)) {
				strBuild.append(c);
				continue;
			}
			
			int ch = (int) c + shift;
			
			if (Character.isLetter((char) ch)) {
				strBuild.append((char) ch);
			} else {
				ch = ch - 'z' + 'a' -1;
				strBuild.append((char) ch);
			}
		}
		
		return strBuild.toString();
	}
	
	public static String decode (String str, int shift) {
		char[] arr = str.toCharArray();
		StringBuilder strBuild = new StringBuilder();
		
		for (char c : arr) {
			if (Character.isWhitespace(c)) {
				strBuild.append(c);
				continue;
			}
			
			int ch = (int) c - shift;
			
			if (Character.isLetter((char) ch)) {
				strBuild.append((char) ch);
			} else {
				ch = ch -'a' + 'z' +1;
				strBuild.append((char) ch);
			}
		}
		
		return strBuild.toString();
	}
	
	public static void main(String[] args) {
		String str = "Zkie cikz";
		String encoded = encode(str, 3);
		System.out.println(encoded);
		String decoded = decode(encoded, 3);
		System.out.println(decoded);
	}
}
