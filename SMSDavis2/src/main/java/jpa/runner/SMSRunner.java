package jpa.runner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;
import jpa.dao.StudentDAO;


public class SMSRunner {

	public static void main(String[] args) {
		
//		StudentService studentService = new StudentService();
//		studentService.createStudentTable();
		
//		StudentService studentService = new StudentService();
//		studentService.createStudents();
		
//		CourseService courseService = new CourseService();
//		courseService.createCourses();
		
		StudentService studentService = new StudentService();
		List<Student> students = studentService.getAllStudents();
		
		if(students != null) {
			System.out.println("List of students: ");
			for(Student student : students) {
				System.out.println(student);
			}
		}
		
//		StudentService studentService = new StudentService();
//		String sEmailToFind = "davis.deaundra@gmail.com";
//		Student student = studentService.getStudentByEmail(sEmailToFind);
//		
//		if(student != null) {
//		System.out.println("Found student by email: " + student);
//		}else {
//			System.out.println("Student not found: " + sEmailToFind);
//		}
		
		
//		StudentService studentService = new StudentService();
//		boolean student = studentService.validateStudent("qllorens2@howstuffworks.com", "W6rJuxd");
//		if(student) {
//			System.out.println("Student is valid");
//		}else {
//			System.out.println("Invalid");
//		}
//		
//		
}
}