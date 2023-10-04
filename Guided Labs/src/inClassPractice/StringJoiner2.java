package inClassPractice;



public class StringJoiner2 {

	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); 

		joinNames.add("Java");
		joinNames.add("Python");
		joinNames.add("C Sharp");
		joinNames.add("Javascript");
				
		System.out.println(joinNames);
	}

}
