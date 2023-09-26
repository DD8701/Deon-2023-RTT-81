package guidedlabs;

public class PyramidExample {

// In this example, we are going to see another application of "for" loop, which is a nested "for" loop. 
// A nested "for" loop refers to a "for" loop within a "for" loop. 
// This means that two "for"-loops are inside each other. 
// They are generally used to print complex patterns on a Java platform.
// An example of a nested "for" loop is shown below.

// Here, the class name is PyramidExample. The main() is declared. 
// After that, the two loop control variables are declared. 
// One is the loop control variable “i,” and the other is the loop control variable “j.”
// Then the “*” is printed in the loop control.

// The new line is given so that the given format of the pyramid structure is maintained. 		
// In this code, the program runs five times. 
// However, by increasing the value of the letter “i,” we can make sure that the pyramid is bigger.
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}
	}
}
