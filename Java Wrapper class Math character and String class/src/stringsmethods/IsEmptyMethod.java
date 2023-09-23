package stringsmethods;

public class IsEmptyMethod {

	public static void main(String[] args) {
		// this method checks whether the String contains anything or not.
		
		String s1 = ""; // string is empty so it returns " false "
		String s2 = "hello"; // string is NOT empty so it returns " true "
		System.out.println(s1.isEmpty()); // true
		System.out.println(s2.isEmpty()); // false
	}
}