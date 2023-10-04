package inClassPractice;

public class SubStringDemo {

	public static void main(String[] args) {

		// ---------------0123456789012345
		String string = "This is a string";

		// substring with a start and an end.
		String sub = string.substring(5, 7);// will print "is". Not inclusive of 7.
		System.out.println(sub);

		// substring with just a start.
		String sub1 = string.substring(5);
		System.out.println(sub1);

		// ----------------0123456789012
		String filename = "someimage.jpg";

		int lastDot = filename.lastIndexOf(".");

		String ext = filename.substring(filename.lastIndexOf(".") + 1);
		System.out.println(ext);

		String name = "Deaundra Davis";

		int spacePosition = name.indexOf(" ");
		String firstname = name.substring(0, spacePosition);
		System.out.println(firstname);

		String lastname = name.substring(name.indexOf(" ") + 1);
		System.out.println(lastname);
		
		
		// TODO -- HOMEWORK --
		
		// find the position of the last space in the string
		// substring of the characters between the first and the last space of the
		// string

		// do the same thing to find the substring of the first and last vowel of the
		// string

		// use the string.charAt method and use a for loop to loop over the entire
		// string
		// and print out each character with a new line after it.
		// you need to use the string.length() method also

		// using only indexOf(" "), print the substring that contains the word is.
		// this will require two substrings to do this

		// https://edabit.com/challenges
		// change to Java / Very Easy or Easy / Strings and try to do some of them

		//303.7.1 Arrays Practice assignment and READ 303.8 slides
	}
}
