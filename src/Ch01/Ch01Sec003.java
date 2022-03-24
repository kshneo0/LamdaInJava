package Ch01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ch01Sec003 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Biggest", "at", "ate","I","apple","ball","cat","rhino","series");
		System.out.println(strings.stream().collect(Collectors.groupingBy(String::length)));
	}

}
