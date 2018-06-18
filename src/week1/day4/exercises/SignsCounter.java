package week1.day4.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SignsCounter {

	static void count(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			int counter = 0;
			
			while (br.read() != -1) {
				counter++;
			}
			
			System.out.println("Signs in file: " + counter);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		count("text1.txt");
	}
}
