package week1.day4.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

	static void writing() {
		try {
			FileWriter fileWriter = new FileWriter("text1.txt", true);
			Scanner scan = new Scanner(System.in);
			String line = "";

			System.out.println("Type text to write to file, or \"quit\" to exit");
			while (true) {
				line = scan.nextLine();

				if ("quit".equals(line))
					break;
				else
					fileWriter.append(line + "\n");
			}
			scan.close();
			fileWriter.close();
			
		} catch (IOException e) {
			System.out.println("Writing to file error");
		}
	}
	public static void main(String[] args) {
		writing();
	}
}
