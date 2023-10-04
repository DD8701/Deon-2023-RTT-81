// Example 2: Display Sum of n Natural Numbers

package guidedlabs;

public class LoopDemoTwo {

	public static void main(String[] args) {
		// The value of sum is 0 initially. 
		// Then the for loop is iterated from i = 1 to 1000.
		//  In each iteration, i is added to the sum and its value is increased by 1.

	    int sum = 0;
	    int n = 1000;
	    // for loop
	    
	    // When i becomes 1001, the test condition is false,
	    // and the sum will be equal to 0 + 1 + 2 + .... + 1000.
	    for (int i = 1; i <= n; ++i) {
	      // body inside for loop
	      sum += i;     // sum = sum + i
	    }
	    System.out.println("Sum = " + sum);
	  }
	}