package inClassPractice;

public class StringBufferExample {

	public static void main(String[] args) {

		// The string buffer is immutable. The string is not.
		
		String x ="abc";
		String y = x.toUpperCase();
		
		// you cannot insert into a string have to make an new string with the value you want to insert/change
		// change x to be abc123xyz
		// String x1 = "abc123xyz"; //output: 123zyxcba
		
		
		String x1 = x.substring(0,3) + "123" + x.substring(3); // adds it all together
				 // this is the substring of "x" (x.substring(0,3)
		
		StringBuffer buffer = new StringBuffer(); // Altering the string buffer
		buffer.append("abc"); // 
		buffer.append("xyz");
		
		buffer.reverse(); // Will be asked on the KBA.
		

				
		// you can insert into the string buffer anywhere
		buffer.insert(0,  "123");// at pos "0" insert "123"
		buffer.insert(3,  "123");// at pos "3" insert "123"
		
		
		//StringBuffer substring does the same thing as String substring.
		String sub = buffer.substring(0, 3);
		
		//you can insert into the string buffer anywhere
		buffer.insert(3, "123");
		
		//remove from string buffer
		buffer.delete(3, 6);
		
		
		// replace some characters in the string buffer
	    StringBuffer sT = new StringBuffer("Java");
	    sT.replace(0, 2, "Hello"); //starts at pos 0 and stops at/not inclusive to pos 2. Output = "Hellova" 
	    System.out.println(sT);

	    
		
		System.out.println(buffer.toString());
		
		
		//StringBuffer is more efficient for memory
	}
	



public static void main1(String[] args) {


	StringBuffer sb = new StringBuffer("135");
    System.out.println(sb.toString());
    sb.replace(0, 5, "6789");
    System.out.println(sb.toString());
    sb.insert(0, "12345");
    System.out.println(sb.toString());
    sb.reverse();
    System.out.println(sb.toString());
    sb.delete(0, 5);
    System.out.println(sb.toString());
}
}
