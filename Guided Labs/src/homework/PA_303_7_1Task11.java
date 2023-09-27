package homework;

import java.util.Arrays;
import java.util.Scanner;

public class PA_303_7_1Task11
{

	public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------
// 												Task 11:
//--------------------------------------------------------------------------------------------------------
		
//  Write a program that creates a String array of 5 elements and swaps the 
// first element with the middle element without creating a new array.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many favorite things? ");
		int numFavorites = scanner.nextInt();
		scanner.nextLine();
		
		String[] favorites = new String[numFavorites];
		
		for (int pos = o; pos < numFavorites; pos++) {
			System.out.println("Enter favorite thing #" + pos);
			favorites[pos] = scanner.next();
			
		}
		System.out.println(Arrays.toString(favorites));


	}

}
