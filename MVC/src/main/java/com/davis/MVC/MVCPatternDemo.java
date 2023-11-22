/*
 * Step 4: Create Main() Method
 * 
 * Create a class named MVCPatternDemo.java and specify the main() method 
 * to execute the program.
 * 
 * Use the StudentController method to demonstrate MVC design pattern usage.
 * 
 * 
 * Step 5: Verify Output
 * Run program...
 * Output= Student: Name: Robert Roll No: 10, Student: Name: John Roll No: 10
 */

package com.davis.MVC;

public class MVCPatternDemo {

	private static Student retriveStudentFromDatabase() {
		Student stu = new Student();
		stu.setName("Robert");
		stu.setRollnum("10");
		return stu;
	}

	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();

		// update model data
		controller.setStudentName("John");
		controller.updateView();
	}

}
