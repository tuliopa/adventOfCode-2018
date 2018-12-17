package name.tuliopa.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Utils {

	public static void print(final Object s) {
		System.out.println(s);
	}
	
	/**
	 * Return a stream of lines from a file. So each String element is a line from the file.
	 * @param location Location of a File.
	 * @return Stream<String>
	 * @throws IOException
	 */
	public static Stream<String> convertFileToStream(String location) throws IOException {
		return Files.lines(Paths.get(location));
	}
}
