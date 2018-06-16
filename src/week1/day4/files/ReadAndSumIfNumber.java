package week1.day4.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadAndSumIfNumber {

	static void readAndSum() {
		try {
			File file = new File("text1.txt");
			Scanner scan = new Scanner(file);
			double sum = 0;
			String str = "";
			
			while (scan.hasNextLine()) {
				str += scan.nextLine() + "\n";
			}
			
			StringTokenizer strTok = new StringTokenizer(str, ", \n");
			while (strTok.hasMoreTokens()) {
				String st = strTok.nextToken();
				try {
					double db = Double.parseDouble(st);
					sum+= db;
				} catch (NumberFormatException e) {
					continue;
				}
			}
			System.out.println(sum);
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		readAndSum();
	}
}
