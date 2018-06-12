package week1.day2.exercises;

public class CharacterReplacement {

	static String replaceCharacter (String str, char forReplace, char replacement) {
		return str.replaceAll(Character.toString(forReplace), Character.toString(replacement));
	}
	
	public static void main(String[] args) {
		System.out.println(replaceCharacter("skiecik is happy that can learn java", 'a', 'z'));
	}
}
