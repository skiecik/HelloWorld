package week1.day4.exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortedRandomArrayWithInput {

	static int[] sortedArray () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in how many numbers you want to draw");
		while (!scan.hasNextInt()) {
			System.out.println("Not a number");
			scan.nextLine();
		}
		int number = scan.nextInt();
		Random rand = new Random();
		
		int[] arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(101);
		}
		Arrays.sort(arr);
		scan.close();
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortedArray()));
	}
}
