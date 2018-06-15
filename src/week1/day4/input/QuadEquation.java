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
		System.out.println(a);
		System.out.println("Please type three factors of the equation.");
		System.out.println("Please type factor \"b\":");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Not a correct number. Try again");
		}
		b = scan.nextInt();
		System.out.println(b);
		System.out.println("Please type three factors of the equation.");
		System.out.println("Please type factor \"c\":");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Not a correct number. Try again");
		}
		c = scan.nextInt();
		System.out.println(c);
		
		double delta = b*b - 4*a*c; 
		double eq1 = (-b - Math.sqrt(delta))/(2*a);
		double eq2 = (-b + Math.sqrt(delta))/(2*a);
		
		System.out.println("eq1 = " + eq1 + " eq2 = " + eq2);
		scan.close();
	}
	
	public static void main(String[] args) {
		equation();
	}
}
