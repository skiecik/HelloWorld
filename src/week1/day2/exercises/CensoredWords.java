package week1.day2.exercises;

import java.util.Arrays;

public class CensoredWords {

	static String censor (String str, String[] words) {

		StringBuilder stringBuilder = new StringBuilder();
		String[] arr = str.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			if (Arrays.asList(words).contains(arr[i])) {
				stringBuilder.append(" **** ");
				continue;
			} else {
				stringBuilder.append(arr[i]);
			}
		}
		
		return stringBuilder.toString();
	}
	
	public static void main(String[] args) {
		String[] words = { "skiecik", "dragon", "best"};
		System.out.println(censor("skiecik is the best in dragon age", words));
	}
}
