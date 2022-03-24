package Ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ch01Sec004 {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Biggest", "at", "ate","I","apple","ball","cat","rhino","series");
		
		strings.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) {
					return 1;
				}else if(s1.length() < s2.length()) {
					return -1;
				}
				return s1.compareTo(s2);
			}
		});
		System.out.println(strings);
	}

}
