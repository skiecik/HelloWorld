package week1.day1.arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

	public static int[] randArrGenerator(int size, int scope) {
		
		Random random = new Random();
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(scope);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] randNumbers = randArrGenerator(20, 101);
		
		for (int i = 0; i < randNumbers.length; i++) {
			System.out.println(randNumbers[i]);
		}
		
		System.out.println("---------------------");
		
		Arrays.sort(randNumbers);
		
		for (int i = 0; i < randNumbers.length; i++) {
			System.out.println(randNumbers[i]);
		}
		
		System.out.println("The smallest number in array is: " + randNumbers[0]);
	}
}
