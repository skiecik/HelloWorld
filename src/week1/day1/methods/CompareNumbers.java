package week1.day1.methods;

public class CompareNumbers {

	public static int maxOfThree(int num1, int num2, int num3) {
		if ((num1 >= num2) && (num1 >= num3))
			return num1;
		else if ((num2 >= num1) && (num2 >= num3))
			return num2;
		else
			return num3;
	}
	
	public static void main(String[] args) {
		System.out.println(maxOfThree(8, 8, 6));
		System.out.println(maxOfThree(4, 9, 2));
		System.out.println(maxOfThree(3, 1, 7));
	}
}
