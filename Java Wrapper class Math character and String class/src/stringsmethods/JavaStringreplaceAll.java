package stringsmethods;

public class JavaStringreplaceAll {

	public static void main(String[] args) {
		// The replaceAll() method replaces each substring that matches the regex
		// of the string with the specified text.
		//The syntax of the replaceAll() method is:
		// string.replaceAll(String regex, String replacement)
		// regex - a regex (can be a typical string) that is to be replaced
		// replacement - matching substrings are replaced with this string
		
		// Create a class named DemoReplaceAll and add the code below to it.
		
	    String str1 = "Java123is456fun";

	    // regex for sequence of digits
	    String regex = "\\d+"; // "\\d+" is a regular expression that matches one or more digits.

	    // replace all occurrences of numeric
	    // digits by a space
	    System.out.println(str1.replaceAll(regex, " ")); // so it found all of the number digits and replaced with a space?
	  }
	}

