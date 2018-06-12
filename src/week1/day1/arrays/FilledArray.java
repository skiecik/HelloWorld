package week1.day1.arrays;

import java.util.Arrays;

public class FilledArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Arrays.fill(arr, 2);
		
		System.out.println(Arrays.toString(arr));
	}
}
