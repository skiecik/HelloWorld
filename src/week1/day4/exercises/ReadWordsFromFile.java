package week1.day4.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWordsFromFile {

	static void readWords(String fileName) {

		File file = new File(fileName);
		int counter = 0;

		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				scan.next();
				counter++;
			}
			scan.close();
			System.out.println("Words in file: " + counter);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		readWords("text1.txt");
	}
}
