package Ch08.exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExerciseFourSolution {
	
	private static String FILE_PATH = "/Users/sanghoonkim/Documents/java/workspace/LamdaInJava/src/Ch08/dictionary.txt";

	public static void main(String[] args) throws IOException {
		
		boolean isValidPassword = true;	
		String password = "baseball";
		
		try(Stream<String> lines = Files.lines(Paths.get(FILE_PATH))){			
			isValidPassword = lines.noneMatch(line -> line.equals(password));
		}
		
		System.out.println("Is a valid password ? "+ isValidPassword);
	}

}
