package week1.day4.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteToFile {

	static void writeToFile(String fileName) {
		try {
			Path path = Paths.get(fileName);
			if (!Files.exists(path)) {
				String str = "";
				Scanner scan = new Scanner(System.in);
				ArrayList<String> list = new ArrayList<>();
				while (true) {
					str = scan.nextLine();
					if ("quit".equals(str))
						break;
					else {
						str += "\n";
						list.add(str);
					}
				}
				scan.close();
				Files.write(path, list);
			} else
				System.out.println("File exist");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
