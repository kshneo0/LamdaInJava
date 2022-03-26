package Ch08;


import java.util.Optional;

public class OptionalMethodsTest {
	
	public static void main(String[] args) {

		//use when we know it can never be null else NullPointer - bug indicator
		Optional<String> str = Optional.of("Hello Streams"); // 

		System.out.println(str.isPresent()); //checks for != null
		
		System.out.println(str.isEmpty());   //checks for == null
				
		//orElse
		Optional<String> canBeEmpty = Optional.empty();
		System.out.println(canBeEmpty.orElse("Lambdas"));
		
		//convenience method- uses 'empty' and 'of' together.
		Optional<String> object = Optional.ofNullable(getObject());	// might return null
		System.out.println(object.orElse("Streams"));
					
	}
	
	private static String getObject() {
		return "Learning"; // might return null
	}
	
	

}
