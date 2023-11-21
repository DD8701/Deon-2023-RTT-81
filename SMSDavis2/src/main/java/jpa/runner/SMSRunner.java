package jpa.runner;

import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		
//		StudentService studentService = new StudentService();
//		studentService.createStudentTable();
		
//		StudentService studentService = new StudentService();
//		studentService.createStudents();
		
//		CourseService courseService = new CourseService();
//		courseService.createCourses();
		
//		StudentService studentService = new StudentService();
//		List<Student> allStudents = studentService.getAllStudents();
//		
//		if(allStudents != null) {
//			System.out.println("List of students: ");
//			for(Student student : allStudents) {
//				System.out.println(student);
//			}
//		}
		
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
		CourseService courseService = new CourseService();
		StudentService studentService = new StudentService();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("Select an option:");
            System.out.println("1. Student");
            System.out.println("2. Quit");
            
            int option = scanner.nextInt();
            
            switch (option) {
            case 1:
                studentLogin(scanner, studentService);
                break;
            case 2:
                System.out.println("Exiting program. Goodbye!");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
    }
}

	 private static void studentLogin(Scanner scanner, StudentService studentService) {
	        System.out.println("Enter your email:");
	        String email = scanner.nextLine();
	        System.out.println("Enter your password:");
	        String password = scanner.nextLine();
	        
	        boolean isValidStudent = studentService.validateStudent(email, password);
	        
	        if(isValidStudent) {
	        	Student student = studentService.getStudentByEmail(email);
	            List<Course> registeredCourses = studentService.getStudentCourses(email);
	            System.out.println("You are logged in. Registered Courses:");
	            registeredCourses.forEach(System.out::println);
	            
	            while(true) {
	            	System.out.println("Select an option:");
	                System.out.println("1. Register to Class");
	                System.out.println("2. Logout");
	                
	                int additionalOption = scanner.nextInt();
	                scanner.nextLine();
	                
	                switch (additionalOption) {
	                case 1:
                        registerStudentToCourse(scanner, studentService, student);
                        break;
                    case 2:
                        System.out.println("Logout successful!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        } else {
            System.out.println("Invalid credentials. Exiting program.");
            System.exit(0);
        }
    }

	private static void registerStudentToCourse(Scanner scanner, StudentService studentService, Student student) {
		// TODO Auto-generated method stub
		
	}
	                
  
	}

