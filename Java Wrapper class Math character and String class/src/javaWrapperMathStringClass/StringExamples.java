package javaWrapperMathStringClass;

public class StringExamples {

	public static void main(String[] args) {
		String s1 = "welcome";
		String s2 = "welcome";

		// this is all ok with primitives
		int x = 4;
		int y = 6;

		if (x == y) {
		}

		// cannot ever use " == " with strings. Must always use " .equals "
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("The strings are equal");
		} else {
			System.out.println("The strings are not equal");
		}
		if (s1.toLowerCase().equals(s2.toLowerCase())) {
			// this is the same as equalsIgnoreCase
		}

		String upper = s1.toUpperCase();
		String lower = s1.toLowerCase();

		// make all of the lowerCase e into E
		String s = new String("Welcome");
		s = s.replaceAll("e", "E");
		System.out.println(s);
		// these 2 things are not the same
		// this is actually a string in memory that 0 characters and length of 0
		String empty = "";
		// this is a string that has not been allocated in memory yet
		String nullstring = null;

		if (empty.equals(nullstring)) {
			// this will evaluate to false
		}

		if (empty.equals("")) {
			// this is true
		}

		if (nullstring == null) {

		}
		
	}

}
