package homework;

import java.util.Arrays;

public class PA_303_7_1Task8 {

	public static void main(String[] args) {
//-------------------------------------------------------------------------------------------------------
// 													Task 8:
//-------------------------------------------------------------------------------------------------------
		// Write a program that creates a String array of 5 elements and  
		// swaps the first element with the middle element without creating a new array.
		
		String[] strings = {"1", "2", "3", "4", "5"};
		
		Arrays.toString(strings); // NEED A TEMP VARIABLE TO DO THE SWITCH
			
		
		String temp = strings[0]; // Move the first string to temp
		strings[0] = strings[2];  // Assign the first string with prev middle string at pos (0)
		strings[2] = temp;  // Then REPLACE the the middle string with the temp string.
		
		System.out.println(Arrays.toString(strings));
		
		


	}

}
