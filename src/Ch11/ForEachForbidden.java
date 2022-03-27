package Ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachForbidden {
	
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("abcded","bcdefe","cdedf","def");
		for(int i = 0 ; i < 10 ;i ++) {
//			List<String> result = new ArrayList<>();
//			data.stream()
//			    .filter(s -> s.length() >3)
//			    .forEach(s -> result.add(s));
			
//			data.parallelStream()
//		    .filter(s -> s.length() >3)
//		    .forEach(s -> result.add(s));
			
			List<String> result = data.parallelStream()
		    .filter(s -> s.length() >3)
		    .collect(Collectors.toList());		
			
			System.out.println(result);
		}
	}

}
