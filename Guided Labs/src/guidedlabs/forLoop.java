package guidedlabs;

public class forLoop {

	public static void main(String[] args) {
		//
		int i;
		for (i = 0; i < 2; i++) { // Declare and initialize i; i is now 0.
			System.out.println("Welcome to Java!");
		}
		System.out.println("Goodbye!");
	}

	{
// Nested Loop syntax: 
		// --- outer loop ---
		for (int i = 1; i <= 5; ++i) {
		}
		// --- inner loop ---
		for (int j = 1; j <= 2; ++j) {
		}

		int weeks = 3;
		int days = 7;

		// outer loop prints weeks
		for (int i = 1; i <= weeks; ++i) {
			System.out.println("Week: " + i);

			// inner loop prints days
			for (int j = 1; j <= days; ++j) {
				System.out.println("  Day: " + j);
			}

		}

	}
}