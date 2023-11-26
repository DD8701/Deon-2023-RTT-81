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

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the School Management System!");

		while (true) {
			System.out.println("Select an option:");
			System.out.println("1. Student");
			System.out.println("2. Quit");

			int option = scanner.nextInt();

			switch (option) {
			case 1:
				handleStudentOption(scanner);
				break;
			case 2:
				System.out.println("Thank you for using the School Management System. Goodbye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option. Please select again.");
			}
		}
	}

	private static void handleStudentOption(Scanner scanner) {
		System.out.println("Enter your email:");
		String email = scanner.next();

		System.out.println("Enter your password:");
		String password = scanner.next();

		StudentService studentService = new StudentService();

		if (studentService.validateStudent(email, password)) {
			System.out.println("Login successful!");

			displayStudentCourses(email);

			while (true) {
				System.out.println("Select an option:");
				System.out.println("1. Register to class");
				System.out.println("2. Logout");

				int studentOption = scanner.nextInt();

				switch (studentOption) {
				case 1:
					registerToClass(email, scanner);
					break;
				case 2:
					System.out.println("Logout successful. Goodbye!");
					return;
				default:
					System.out.println("Invalid option. Please select again.");
				}
			}
		} else {
			System.out.println("Invalid email or password. Exiting program.");
		}
	}

	private static void displayStudentCourses(String email) {
		StudentService studentService = new StudentService();
		List<Course> sCourses = studentService.getStudentCourses(email);

		System.out.println("Registered Courses:");
		if (sCourses != null && !sCourses.isEmpty()) {
			for (Course course : sCourses) {
				System.out.println(course.getCourseName() + " - " + course.getInstructorName());
			}
		} else {
			System.out.println("No courses registered.");
		}
	}

	private static void registerToClass(String email, Scanner scanner) {
		CourseService courseService = new CourseService();

		List<Course> allCourses = courseService.getAllCourses();

		System.out.println("Available Courses:");

		for (Course course : allCourses) {
			System.out.println(course.getId() + ". " + course.getCourseName() + " - " + course.getInstructorName());
		}

		System.out.println("Enter the ID of the course you want to register for:");
		int cId = scanner.nextInt();

		if (cId == 0) {
			System.out.println("Logout successful!");
			return;
		}

		 StudentService studentService = new StudentService();
		    List<Course> studentCourses = studentService.getStudentCourses(email);

		    boolean isAlreadyRegistered = studentCourses.stream().anyMatch(course -> course.getId() == cId);

		    if (isAlreadyRegistered) {
		        System.out.println("You are already registered in that course!");
		    } else {
		        studentService.registerStudentToCourse(email, cId);
		        displayStudentCourses(email);
		        System.out.println("Registration successful!");
		    }

		    System.out.println("Program ended.");
	    }
	}
	

