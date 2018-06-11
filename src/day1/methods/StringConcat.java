package day1.methods;

public class StringConcat {

	public static String createName(String name, String surname, String nickname) {
		return name + " \"" + nickname + "\" " + surname; 
	}
	
	public static void main(String[] args) {
		System.out.println(createName("Barti", "Tycz", "Skiecik"));
	}
}
