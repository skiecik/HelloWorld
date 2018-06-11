package day1.matrix;

public class MatrixTasks {

	public static void main(String[] args) {
		int[][] task1 = MatrixCreation.create(5, 7, 20);
		System.out.println(task1[2][3]);
		System.out.println("-----------");
		
		int[][] task2 = MatrixCreation.create(5, 7, 20);
		System.out.println(task2[1].length);
		System.out.println("-----------");
		
		int[][] task3 = MatrixCreation.create(5, 7, 20);
		for (int i = 0; i < task3.length; i++) {
			for (int j = 0; j < task3[i].length; j++) {
				System.out.print(task3[i][j] + " ");
			}
		}
	}
}
