package day1.matrix;

import java.util.Random;

public class MatrixCreation {

	public static int[][] create(int length, int width, int scope){
		
		Random rand = new Random();
		int[][] matr = new int[length][width];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j<width; j++) {
				matr[i][j] = rand.nextInt(scope);
			}
		}
		
		return matr;
	}
}
