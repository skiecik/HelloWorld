package week1.day2.strings;

public class UpperLowerChange {

	static String uppLowChange (String str) {

		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i]))
				arr[i] = Character.toUpperCase(arr[i]);
			else
				arr[i] = Character.toLowerCase(arr[i]);
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		System.out.println(uppLowChange("skIeCiK"));
	}
}
