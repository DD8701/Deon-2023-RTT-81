package stringsmethods;

public class equalsOperator {

	public static void main(String[] args) {
		// Create a class named Teststringcomparison2.java and write the code below to it. 

	       String s1="Perscholas";
	       String s2="Perscholas";
	       String s3=new String("Perscholas");
	       System.out.println(s1==s2);//true (because both refer to same instance)
	       System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
	   }

	}
		// The above code demonstrates the use of == operator used for comparing two String objects.