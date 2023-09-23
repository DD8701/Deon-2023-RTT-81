package stringsmethods;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		String str1 = "a";
		String str2 = "b";
		//
		String sum = ("a" + "b");
		System.out.println(str1.length() + str2.length());
		if (str1.length() > str2.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		String str1upper = str1.toUpperCase();
		String str2upper = str2.toUpperCase();
		System.out.println(str1upper +" " +  str2upper);
		
	}
		
}
