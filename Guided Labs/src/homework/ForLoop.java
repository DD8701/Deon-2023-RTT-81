package homework;

public class ForLoop {

	public static void main(String[] args) {
		// use letters.split(",") to make an array of letters
		// loop over the array and count the number of letters that are not vowels

		String letters = ("a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"); //comma delimited string 
		String vowels = "aeiou";
		
		String[] lettersArray = letters.split(","); // " [] " is an array. The "String.split()" method returns an array of strings (String[])
		int numberOfLetters = 0;
		for (int i = 0; i < lettersArray.length; i++) { // array split
		for ( int pos = 0; pos < lettersArray.length; pos++) {
			if (lettersArray[pos].equals("a")) {
				continue;
			}else if (lettersArray[pos].equals("e")) {
				continue;
			}else if (lettersArray[pos].equals("i")) {
				continue;
			}else if (lettersArray[pos].equals("o")) {
				continue;
			}else if (lettersArray[pos].equals("u")) {
				continue;
			}
			numberOfLetters = numberOfLetters + 1;
		}
		System.out.println(lettersArray[i]);
		}
		
		// System.out.println("========================="); for separating programs
		System.out.println("=========================");
		
		// Using an enhanced loop and much less code
		String vowel = "aeiou";
		
		int numberOfLettersEnhanced = 0;
		for ( String letter : lettersArray) {
			if ( !vowel.contains(letter)) {
				numberOfLettersEnhanced = numberOfLettersEnhanced + 1;
			}
			
		}
		System.out.println("Number of letters = " + numberOfLettersEnhanced);
	}

}
