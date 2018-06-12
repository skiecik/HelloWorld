package week1.day1.exercises;

import week1.day1.matrix.MatrixCreation;

public class EvenSumArr {

	static int evenSum (int[][] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j%2 != 0)
					sum += arr[i][j];
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] arr = MatrixCreation.create(5, 5, 50);
		MatrixCreation.printMatrix(arr);
		System.out.println(evenSum(arr));
	}
}
