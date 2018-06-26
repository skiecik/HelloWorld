package week3.day1.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetCollectionCase {

	public static void main(String[] args) {
		
		Set<String> words = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		String option = "";
		int count = 0;
		while (true) {
			System.out.println("Type word to add to set");
			option = scan.nextLine();
			
			if ("exit".equals(option)) {
				break;
			} else {
				words.add(option);
				count++;
			}
		}
		scan.close();
		System.out.println("Typed words: " + count);
		System.out.println("Collection size: " + words.size());
	}
}
