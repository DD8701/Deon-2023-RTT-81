package homework;

public class PA_303_7_1Task2 {
	
	public static void main(String[] args) {

//-----------------------------------------------------------------------------
//									Task 2:									
//-----------------------------------------------------------------------------
//Write a program that returns the middle element in an array. 
//Give the following values to the integer array: {13, 5, 7, 68, 2}
//and produce the following output: 7
		
	int [] array = {13,5,7,68,2}; //syntax for arrays

	int high = array.length -1; // low is always 0 so don'need low
			
	int mid = (high/2); // high would be divided by two
	System.out.println("Mid Value is " + array[mid]); //array[mid] because mid represents a string in an array
	
}
}