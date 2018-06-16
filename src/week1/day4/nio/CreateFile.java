package week1.day4.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {

	static void createFile (String fileName) {
		try {
			Path path = Paths.get(fileName);
			if (!Files.exists(path))
				Files.createFile(path);
			else
				System.out.println("File exist");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
