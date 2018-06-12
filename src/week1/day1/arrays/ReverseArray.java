package week1.day1.arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		int[] arr = RandomArray.randArrGenerator(10, 20);
		int[] reverseArr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		for (int i = 0; i < arr.length; i++) {
			reverseArr[i] = arr[arr.length-1-i];
			System.out.print(reverseArr[i]+" ");
		}
	}
}
