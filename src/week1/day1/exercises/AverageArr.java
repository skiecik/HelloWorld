package week1.day1.exercises;

import java.util.Arrays;

import week1.day1.matrix.MatrixCreation;

public class AverageArr {

	static int[] lessMore(int[][] arr) {
		int counter = 0;
		int sum = 0;
		double avarage;
		int counterLess = 0;
		int counterMore = 0;
		int[] avgCompared = new int[2];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				counter++;
			}
		}
		
		avarage = sum/counter;
		System.out.println("Avarage = " + avarage);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < avarage)
					counterLess++;
				else if (arr[i][j] > avarage)
					counterMore++;
			}
		}
		
		avgCompared[0] = counterLess;
		avgCompared[1] = counterMore;
		
		return avgCompared;
	}
	
	public static void main(String[] args) {
		
		int[][] arr = MatrixCreation.create(5, 5, 31);
		MatrixCreation.printMatrix(arr);
		System.out.println(Arrays.toString(lessMore(arr)));
	}
}
