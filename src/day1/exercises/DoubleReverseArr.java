package day1.exercises;

import java.util.Arrays;

import day1.arrays.RandomArray;

public class DoubleReverseArr {

	static int[] append(int[] arr) {
		int[] appendArray = new int[arr.length * 2];
		int counter = arr.length -1;
		
		for (int i = 0; i < appendArray.length; i++) {
			if (i < arr.length)
				appendArray[i] = arr[i];
			else {
				appendArray[i] = arr[counter--];
			}
		}
		
		return appendArray;
	}
	
	public static void main(String[] args) {
		int[] arr = RandomArray.randArrGenerator(10, 40);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(append(arr)));
	}
}
