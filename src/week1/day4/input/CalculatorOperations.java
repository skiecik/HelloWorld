package week1.day4.input;

import java.util.Scanner;

public class CalculatorOperations {

	static void operations() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type in first number: ");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("That is not a number. Please try again:");
		}
		int firstNumber = scan.nextInt();
		System.out.println("Please type in second number: ");
		while (!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("That is not a number. Please try again:");
		}
		int secondNumber = scan.nextInt();
		
		int sum = firstNumber + secondNumber;
		int subtraction = firstNumber - secondNumber;
		int multiplication = firstNumber * secondNumber;
		
		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
		if (secondNumber == 0) {
			System.out.println("You can't divide by zero");
		} else {
			int division = firstNumber / secondNumber;
			System.out.println(firstNumber + " / " + secondNumber + " = " + division);
		}
		System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
		
		scan.close();
	}
	
	public static void main(String[] args) {
		operations();
	}
}
