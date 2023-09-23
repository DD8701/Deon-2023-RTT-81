package stringsmethods;

public class ConcatMethod {

	public static void main(String[] args) {
// You can also use the + operator to concatenate two or more strings.
// But the Java String class provides the concat() method.
// This method combines a specific string at the end of another string,
// and ultimately returns a combined string.

// ------By using concat method----
		String str1 = "Learn ";
		String str2 = "Java";
		// concatenate str1 and str2
		System.out.println(str1.concat(str2)); // "Learn Java"

// concatenate str2 and str1
		System.out.println(str2.concat(str1)); // "JavaLearn "
//--- By using + operator---
		String s3 = "hello";
		String s4 = "Learners";
		

//  String s5 = s3.concat(s4); or
		String s5 = s3 + s4;
//both of the above statements will give you the same result

// Three strings are concatenated
		String message = "Welcome " + "to " + "Java";

// String Chapter is concatenated with number 2
		String s = "Chapter" + 2; // s becomes Chapter2

// String Supplement is concatenated with character B
		String s1 = "Supplement" + 'B'; // s1 becomes SupplementB

	}
}
