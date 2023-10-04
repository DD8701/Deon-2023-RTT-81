package inClassPractice;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int[] numbers = { 0, 1, 2, 3, 4, 5 }; // the array
		
		System.out.println("Original = " + Arrays.toString(numbers));// a for loop
		System.out.println("=========================");

		int positionToDelete = 1;
		for (int pos = positionToDelete; pos < numbers.length - 1; pos++) {
			numbers[pos] = numbers[pos + 1];
		}
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("=========================");
		System.out.println("after move = " + Arrays.toString(numbers));
		System.out.println("=========================");

		// make a new array that is one smaller than the original
		int[] target = new int[numbers.length - 1];
		for (int pos = 0; pos < target.length; pos++) {
			target[pos] = numbers[pos];
		}
		System.out.println(Arrays.toString(target));
		
		System.out.println("=========================");
		System.out.println("after copy = " + Arrays.toString(target));
	}
}
