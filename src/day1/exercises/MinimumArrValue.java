package day1.exercises;

import java.util.Arrays;

import day1.matrix.MatrixCreation;

public class MinimumArrValue {

	static int[] miniArr (int[][] arr) {
		int[] minArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
			minArr[i] = arr[i][0];
		}
		
		return minArr;
	}
	
	public static void main(String[] args) {
		int[][] matrix = MatrixCreation.create(5, 4, 30);
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		System.out.println("-----------------------");
		System.out.println(Arrays.toString(miniArr(matrix)));
	}
}
