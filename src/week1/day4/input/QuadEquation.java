package week1.day4.input;

import java.util.Scanner;

public class QuadEquation {

	static void equation () {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Please type three factors of the equation.");
		System.out.println("Please type factor \"a\":");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Not a correct number. Try again");
		}
		a = scan.nextInt();
		
	}
}
