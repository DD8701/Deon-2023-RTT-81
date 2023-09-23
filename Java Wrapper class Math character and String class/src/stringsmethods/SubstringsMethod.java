package stringsmethods;

public class SubstringsMethod {

	public static void main(String[] args) {
		// The substring() method extracts a substring from the string and returns it.
		// The syntax of the substring() method is...
		// ..." stringObj.substring(int startIndex, int endIndex) "

		String str1 = "java is fun";

		// extract substring from index 0 to 3
		System.out.println(str1.substring(0, 4));  // is this counting from 0 then starting at 4 and beyond, removes the characters?

	}
}
