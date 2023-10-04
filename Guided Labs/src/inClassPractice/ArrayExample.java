package inClassPractice;

public class ArrayExample {

	public static void main(String[] args) {
		int arraySize = 10;
// this creates a new array of type double with 10 elements ... 0 to 9
		
		
		double[] doubleArray = new double[arraySize];

		String[] stringArray = new String[arraySize];
		stringArray[1] = "one";
		stringArray[2] = "two";
		stringArray[0] = "zero";
		stringArray[9] = "nine";

		// this is going to fail and cause code execution to stop
		// stringArray[11] = "eleven";

		// loop over the entire array and print the value in each location
		// its important to know that you can ask an array how long it is using .length
		for (int pos = 0; pos < stringArray.length; pos++) {
			System.out.println("The value in position " + pos + " is " + stringArray[pos]);
		}

		System.out.println("=========================");

		// enhanced for loop
		for (String value : stringArray) {
			System.out.println("The value = " + value);
		}

		System.out.println("=========================");

		// write a for loop that counts the number of nulls in the array
		// after the loop completes print that number
		int nullCount = 0;
		for (String str : stringArray) {
			if (str == null) {
				nullCount = nullCount + 1;
			}
		}
		System.out.println("Number of nulls is " + nullCount);

		// write a for loop that tells me the location of the first null in the array
		// this is going to use the non-enhanced for loop
		int firstNull = 0;
		for (int pos = 0; pos < stringArray.length; pos++) {
			if (stringArray[pos] == null) {
				firstNull = pos;
				break;
			}
		}
		System.out.println("=========================");
		System.out.println("Position of the first null is " + firstNull);

		// write a for loop that tells me how many values are not null
		int notNullCount = 0; // Start with a position of assumption so set int "notNull" = 0.
		for (String str : stringArray) {
			if (str != null) {
				notNullCount = notNullCount + 1;
			}
		}
		System.out.println("=========================");
		System.out.println("Number of NOT nulls is " + notNullCount);

		System.out.println("=========================");

		// write a for loop that starts at the final position in the array and counts
		// down to the first

		
		
		
		
		System.out.println("=========================");
		// write a for loop that tells me the last position of null in the array
		int lastNullPosition = 0;
		for (int pos = 0; pos < stringArray.length; pos++) { // .length? -- Checking the size of the array.
			if (stringArray[pos] == null) {
				lastNullPosition = pos;

			}

		}
		System.out.println("Position of the last null is " + lastNullPosition);
		System.out.println("=========================");
		
		// more efficient because it cane break the loop once it found its answer
		int lastNullPositionReverse = -1;
		for (int pos = stringArray.length - 1; pos >= 0; pos--) {
			if (stringArray[pos] == null) {
				lastNullPositionReverse = pos;
				break;
			}

		}
		if (lastNullPositionReverse == -1) {
			System.out.println("The array does not have a null");
		} else {
			System.out.println("The last null of the array is in position " + lastNullPositionReverse);
		}
	}
}
