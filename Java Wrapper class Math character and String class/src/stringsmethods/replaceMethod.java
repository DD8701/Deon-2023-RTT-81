package stringsmethods;

public class replaceMethod {

	public static void main(String[] args) {
		// The replace() method replaces each matching occurrence of the...
		// ...old character/text in the string with the new character/text.
		// The syntax of the replace() method is either:
		// stringobj.replace(char oldChar, char newChar) or
		// stringobj.replace(CharSequence oldText, CharSequence newText)

		String str1 = "abc cba";

		// all occurrences of 'a' is replaced with 'z'
		System.out.println(str1.replace('a', 'z'));

		// all occurences of 'L' is replaced with 'J'
		System.out.println("Lava".replace('L', 'J'));
		
		// character not in the string
		System.out.println("Hello".replace('4', 'J'));
		
		// all occurrences of "C++" is replaced with "Java"
		System.out.println(str1.replace("C++", "Java")); //Note: If the substring to be replaced is not in the string,...
		//... replace() returns the original string.
		// all occurences of "aa" is replaced with "zz"
		System.out.println("aa bb aa zz".replace("aa", "zz"));

		// substring not in the string
		System.out.println("Java".replace("C++", "C")); //Note: If the substring to be replaced is not in the string,...
		//... replace() returns the original string.
	}
}
