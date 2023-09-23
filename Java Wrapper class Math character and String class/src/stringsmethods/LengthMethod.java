package stringsmethods;

public class LengthMethod {

	public static void main(String[] args) {
		// The length() method returns the length of the string,
		// or it returns the count of the total number of characters present in the string.
		
        String str1 = "Java";
        String str2 = "";
        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5 ( " \n " is considered ONE character)
        System.out.println("Learn Java".length()); // 10
    }
}