package stringsmethods;

public class JavaStringReverse {

	public static void main(String[] args) {
		// A palindrome is a word, phrase, number,
		// or other sequence of characters which reads the same backward or forward.
		// Given a string A, print Yes if it is a palindrome, print No otherwise.

		String str = "lepel"; // assign A to a string " "
		String result = new StringBuilder(str).reverse().toString();  //create a new string to reverse the first string

		if (str.equals(result)) {
			System.out.println("Yes");
		} else if (!str.equals(result)) { // or can be written as " else " which will return the negation of the if statement
			System.out.println("No");
		}
	}
}
