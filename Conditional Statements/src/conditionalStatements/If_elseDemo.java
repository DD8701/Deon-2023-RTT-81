package conditionalStatements;

public class If_elseDemo {
   public static void main(String[] args) {
int radius = 10;
if (radius >= 0) {   
	double area = radius * radius * 3.14159;
 	System.out.println("The area of a circle of radius " +  
		radius + " is " + area);
} // close if body
else {
  System.out.println("A negative radius is not possible.");
   } // close else body
  } // close main body
} // close class body
