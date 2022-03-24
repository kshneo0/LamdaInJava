package Ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Biggest", "at", "ate","I","apple","ball","cat","rhino","series");
		List<String> orderedList = strings.stream()
				.sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList()); 
		System.out.println(orderedList);

	}

}
