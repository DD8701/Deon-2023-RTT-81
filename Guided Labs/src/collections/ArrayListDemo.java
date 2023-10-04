package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> mylist = new ArrayList<String>();

		mylist.add("New Jersey");
		mylist.add("Dallas");
		mylist.add("New York");
		mylist.add("Chicago");
		mylist.add("LA");
		//output is true because mylist contains "Chicago"
		System.out.println("Return boolean: " + mylist.contains("Chicago"));
		
		//output is "3" because "Chicago is is pos 3.
		System.out.println("Return index value of Element: " + mylist.indexOf("Chicago"));
		
		//output is "New York" because New York is in pos 2
		System.out.println("Returns the actual Element at the given index: " + mylist.get(2));
		
		//output is "5" because there are five in the list including zero.
		System.out.println("Returns the length of the arraylist :" + mylist.size());

		// Remove the element at the given index. Returns the removed element.
		// Removes element at index 3
		String removedElement = mylist.remove(3);
		System.out.println("Removed Element: " + removedElement);
		
		// remove all elements
		mylist.clear();
		System.out.println("ArrayList after clear(): " + mylist);

	}

}
