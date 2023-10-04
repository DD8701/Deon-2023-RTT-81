package inClassPractice;

// 									Will provide answer on KBA

public class StringJoiner {

	public static void main(String[] args) {

		String[] arr = { "a", "b", "c", "d", "e" };

		// in the box was a tire, a saw, and a pig -- a concept that occurs in
		// engineering

		for (int pos = 0; pos < arr.length; pos++) {
			System.out.print(arr[pos]);
			if (pos < arr.length - 1) { // to remove the last comma
				System.out.print(",");
			}

		}
		
	}

}
