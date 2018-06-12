package week1.day2.division;

public class Sentences {

	static void sentDivi(String str) {
		
		String[] strArr = str.split("\\.");
		for (String s : strArr)
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		sentDivi("skiecik always goes a hard way. But always looking for easiest way to do stuff. And likes to be happy.");
	}
}
