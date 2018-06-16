package week1.day4.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDir {

	static void createDirectory(String dirName) {
		try {
			Path path = Paths.get(dirName);
			if (!Files.exists(path))
				Files.createDirectory(path);
			else
				System.out.println("Directory exist");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
