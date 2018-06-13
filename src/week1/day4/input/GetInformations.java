package week1.day4.input;

import java.util.Scanner;

public class GetInformations {

	static void getInfo () {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type in your name: ");
		String name = scan.nextLine();
		System.out.println("Please type in your age: ");
		String age = scan.nextLine();
		System.out.println(name + " is " + age + " years old.");
		
		scan.close();
	}
	
	public static void main(String[] args) {
		getInfo();
	}
}
