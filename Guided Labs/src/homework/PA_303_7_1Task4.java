package homework;

public class PA_303_7_1Task4 {

	public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------
// 											Task 4:
//-----------------------------------------------------------------------------------------------------
// Write a program that creates an integer array with 5 elements (i.e., numbers). 
// The numbers can be any integers. 
// Print out the value at the first index and the last index using length - 1 as the index. 
		
		
	int[] numbers = {1,2,3,4,5};
	int last = numbers.length -1;
	int first = 0;
	
	
	numbers [0] = 1; // array
	numbers [1] = 2;
	numbers [2] = 3;
	numbers [3] = 4;
	numbers [4] = 5;
			

	System.out.println(numbers[first]);
		System.out.println(numbers[last]); // finds and prints the last index of array
		
		
		
		// Now try printing the value at index = length (e.g., myArray[myArray.length] ).
		// Notice the type of exception which is produced. 
				
		
		// Now try to assign a value to the array index 5.
				
		
		// You should get the same type of exception.
	

		
	}

}
