package coding.recursion;

public class Recursion {
	
	// "01"
	// "002"
	public String stripLeadingZeros(String input) {
		char charAtZero = input.charAt(0);
		if(charAtZero != '0') {
			return input.toString();
		} else {
			input = stripLeadingZeros(input.substring(1));
		}		
		return input;
	}

}
