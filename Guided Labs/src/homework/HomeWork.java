package homework;

public class HomeWork {

	public static void main(String[] args) {
		
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
		String example = "This is an example!";
		
		// find the position of the last space in the string
		int lastSpace = example.lastIndexOf(" ");
		int firstSpace = example.indexOf(" ");
		
		// substring of the characters between the first and the last space of the
		// string
		String chrBetween = example.substring(firstSpace + 1, lastSpace);
		System.out.println("---->" + chrBetween);

		// TOO Difficult -- DO NOT ATTEMPT
		// do the same thing to find the substring of the first and last vowel of the
		// string
		int firstVowelPosition = 0;
		int lastVowelPosition = 0;
		for (int i = 0; i < example.length(); i++) {
			if (example.charAt(i) == 'a'|| example.charAt(i) == 'e'|| example.charAt(i) == 'i'|| example.charAt(i) == '0'|| example.charAt(i) 'u') {
		firstVowelPosition = i;
		break;
	}
}
		System.out.println("\n\nSubstring between the first and last vowel of the string: " + example.substring(firstVowelPosition, lastVowelPosition));
		// use the string.charAt method and use a for loop to loop over the entire string
		// and print out each character with a new line after it.
		// you need to use the string.length() method also
		for (int pos = 0; pos < example.length(); pos++) {
			//not that using an array is slightly different in that it uses [] to reference the position.
			System.out.println(example.charAt(pos));
		}

		// using only indexOf(" "), print the substring that contains the word is.
		// this will require two substrings to do this
		// string example = "This is an example!"
		String is = example.substring(example.indexOf(" ") +1);
		is = is.substring(0, is.indexOf(" "));
		System.out.println(is);
		

		// https://edabit.com/challenges
		// change to Java / Very Easy or Easy / Strings and try to do some of them

		//303.7.1 Arrays Practice assignment and READ 303.8 slides

	}

}
