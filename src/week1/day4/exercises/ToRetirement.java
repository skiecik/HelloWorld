package week1.day4.exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ToRetirement {

	static List<String> peopleToRetirement () {
		Scanner scan = new Scanner(System.in);
		List<List<String>> dataList = new ArrayList<List<String>>();
		List<String> retirement = new ArrayList<>();
		
		System.out.println("Type in file name");
		String fileName = scan.nextLine();
		scan.close();
		String line = "";
		
		try {
			
			//in file data has to be written line by line
			//in format: name surname year M/F
			//example: John Johnson 1950 M
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				StringTokenizer strTok = new StringTokenizer(line);
				List<String> row = new ArrayList<>();
				while (strTok.hasMoreTokens()) {
					row.add(strTok.nextToken());
				}
				dataList.add(row);
			}
			br.close();
			int year = Calendar.getInstance().get(Calendar.YEAR);
			for (List<String> worker : dataList) {
				if ("M".equals(worker.get(3))) {
					if (year - Integer.parseInt(worker.get(2)) >= 65) {
						String toAdd = worker.get(0) + " " + worker.get(1);
						retirement.add(toAdd);
					}
				}
				else if ("F".equals(worker.get(3))) {
					if (year - Integer.parseInt(worker.get(2)) >= 60) {
						String toAdd = worker.get(0) + " " + worker.get(1);
						retirement.add(toAdd);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return retirement;
	}
	
	public static void main(String[] args) {
		System.out.println(peopleToRetirement().toString());
	}
}
