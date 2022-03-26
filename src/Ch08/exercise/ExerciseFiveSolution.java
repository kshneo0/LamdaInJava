package Ch08.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExerciseFiveSolution {
	
	private static String FILE_PATH = "/Users/sanghoonkim/Documents/java/workspace/LamdaInJava/src/Ch08/dictionary.txt";

	public static void main(String[] args) throws IOException {
		boolean isValidFile = false;
		try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){
			isValidFile = lines.allMatch(line -> isLineProperlyDelimited(line));			
		}
		
		System.out.println(isValidFile);	
	}
	
	private static boolean isLineProperlyDelimited(String line) {
		return line.startsWith("#")&& line.endsWith("#");
	}

}
