package day1.arrays;

public class ArrayOfInts {

	public static int[] arrCreation(int scope) {
		int[] arr = new int[scope];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] mainTab = arrCreation(50);
		
		for (int i = 0; i < mainTab.length; i++) {
			System.out.println(mainTab[i]);
		}
	}
}
