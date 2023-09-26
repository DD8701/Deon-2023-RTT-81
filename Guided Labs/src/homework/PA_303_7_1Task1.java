package homework;

// In this Assignment, we test your knowledge of using arrays in Java.
// In this assignment, you will create a Java program.
//------------------------------------------------------------------------------
//                               Task 1: 
//------------------------------------------------------------------------------
//Write a program that creates an array of integers with a length of 3. 
//Assign the values 1, 2, and 3 to the indexes. 
//Print out each array element.

public class PA_303_7_1Task1 {

	public static void main(String[] args) {

		int[] stringArray;
		stringArray = new int[3];

		stringArray[0] = 1;
		stringArray[1] = 2;
		stringArray[2] = 3;
		
		for (int element = 0; element < stringArray.length; element++)
			System.out.println(stringArray[element]);
	}



}