package day1.arrays;

import java.util.Arrays;

public class SumArrays {

	public static void main(String[] args) {
	
		int[] arr1 = RandomArray.randArrGenerator(10, 20);
		int[] arr2 = RandomArray.randArrGenerator(10, 20);
		int[] arr3 = new int[10];
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		
		System.out.println(Arrays.toString(arr3));
	}
}
