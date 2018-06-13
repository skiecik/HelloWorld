package week1.day4.input;

import java.util.Scanner;

public class PrintLines {

	static void textLines () {
		Scanner scan = new Scanner(System.in);
		String strToPrint = "";
		
		System.out.println("Type text you want to print or quit to end program.");
		while (true) {
			strToPrint = scan.nextLine();
			if (strToPrint.equals("quit"))
				break;
			else
				System.out.println(strToPrint);
		}
		scan.close();
		System.out.println("Bye bye!");
	}
	
	public static void main(String[] args) {
		textLines();
	}
}
