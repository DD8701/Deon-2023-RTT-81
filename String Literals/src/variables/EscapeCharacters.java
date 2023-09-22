package variables;

public class EscapeCharacters {

	public static void main(String[] args) {
	
		// the main ones to know are ... \t, \n, and \"
		
		// for the Java language \ (slash) is the escape character
		
		// this is an example of the tab escape character \t
		System.out.println("This is a tab character ->\t<-");
		
		// basic formatting with tabs
		System.out.println("1\t0ne\t\tCol3");
		System.out.println("10\tTen\t\tCol3");
		
		// this one is long so it only needs 1 tab for the 3rd column
		System.out.println("100\t0ne Hundred\tCol3");
		
		// this is an example of a new line character \n
		System.out.println("This is line 1\nThis is line 2");
		System.out.println("This is line 3");
		System.out.println("This is line 4");
		
		// what happens if I want to print just a \ (back slash)
		System.out.println("To get a back slash to print we need 2 of them \\");
		
		// what happens if I want a " in my string
		System.out.println("This is a quote \" in a string");
		
	}

}
