package week3.day1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCollectionCase {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("hot", "cold");
		map.put("black", "white");
		map.put("sweet", "sour");
		map.put("big", "small");
		map.put("fat", "thin");
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		
		for (String key : map.keySet()) {
			System.out.println("Type opposite to:");
			System.out.println(key);
			String option = scan.next();
			if (map.get(key).equals(option)) {
				count++;
			}
		}
		System.out.println("Correct guesses: " + count);
	}
}
