package week1.day4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	static void reading() {
		try {
			File file = new File("text1.txt");
			StringBuilder str = new StringBuilder();
			Scanner scan = new Scanner(file);
			
			while (scan.hasNextLine()) {
				str.append(scan.nextLine()+ "\n");
			}
			scan.close();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			System.out.println("There is no such file.");
		}
	}
	
	public static void main(String[] args) {
		reading();
	}
}
