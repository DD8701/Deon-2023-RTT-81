/*
 * Step 2: Creating a View
 * 
 * The View presents the model’s data to the user. 
 * The View knows how to access the model’s data, 
 * but it does not know what the data means or 
 * what the user can do to manipulate it.
 */

package com.davis.MVC;

public class StudentView {

	public void printStudentDetails(String studentName, String studentRollNo) {

		System.out.println("Student :");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
