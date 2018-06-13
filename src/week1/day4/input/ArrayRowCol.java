package week1.day4.input;

import java.util.Scanner;

public class ArrayRowCol {

	static void rowsColumns () {
		Scanner scan = new Scanner(System.in);
		int row, col;
		
		System.out.println("Type two numbers, one for rows in your array, one for columns");
		System.out.println("Type number for rows: ");
		while (!scan.hasNextInt()) {
			System.out.println("Type number for rows: ");
			scan.nextLine();
			System.out.println("Not a number, try again.");
		}
		row = scan.nextInt();
		
		System.out.println("Type number for columns: ");
		while (!scan.hasNextInt()) {
			System.out.println("Type number for columns: ");
			scan.nextLine();
			System.out.println("Not a number, try again.");
		}
		col = scan.nextInt();
		scan.close();
		
		int[][] arr = new int[row][col];
		int counter = 1;
		int sum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = counter++;
				sum += arr[i][j];
			}
		}
		
		System.out.println("Sum of all emements is: " + sum);
		int avarage = sum/counter;
		System.out.println("Avarage = " + avarage);
	}
	
	public static void main(String[] args) {
		rowsColumns();
	}
}
