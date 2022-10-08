package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	private static final Predicate<? super Path> Predicate = path -> String.valueOf(path).contains(".java");

	public static void main(String[] args) throws IOException {
		Path CurrentDirectory = Paths.get(".");
		// Files.list(CurrentDirectory).forEach(System.out::println);

		// Files.walk(CurrentDirectory,
		// 5).filter(Predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path)
				.contains(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();

		Files.find(CurrentDirectory, 4, directoryMatcher).forEach(System.out::println);

	}
}
