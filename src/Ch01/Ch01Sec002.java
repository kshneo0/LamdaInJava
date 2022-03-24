package Ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ch01Sec002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Biggest", "at", "ate","I","apple","ball","cat","rhino","series");
		Map<Integer, List<String>> lengthMap = new HashMap<>();
		
		for (String string : strings) {
			List<String> sameLength = null;
			Integer length = string.length();
			
			if(lengthMap.get(length) == null) {
				sameLength = new ArrayList<> ();
				lengthMap.put(length,  sameLength);
			} else {
				sameLength = lengthMap.get(length);
			}
			sameLength.add(string);
		}
		System.out.println(lengthMap);
	}
	

}
