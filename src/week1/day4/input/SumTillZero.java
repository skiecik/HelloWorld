package week1.day4.input;

import java.util.Scanner;

public class SumTillZero {

	static void getData () {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		while (true) {
			int numberToAdd = 0;
			System.out.println("Type number to add to sum or 0 (zero) to exit: ");

			while (!scan.hasNextInt()) {
				scan.nextLine();
				System.out.println("This is not a number, try again");
			}
			numberToAdd = scan.nextInt();
			
			if (numberToAdd == 0)
				break;
			else
				sum += numberToAdd;
		}
		scan.close();
		System.out.println("Result = " + sum);
	}
	
	public static void main(String[] args) {
		getData();
	}
}
