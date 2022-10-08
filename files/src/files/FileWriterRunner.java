package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriterRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");
		List<String> list = List.of("Apple", "Bat", "cat", "dog", "Elephant");

		Files.write(pathFileToWrite, list);
	}
}
