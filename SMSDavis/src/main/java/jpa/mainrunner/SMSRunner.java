package jpa.mainrunner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

/*
 * This is the main ACCESS class where we can invoke any operation
 */

public class SMSRunner {
	
	private Scanner sin;
	private StringBuilder sb;
	
	private CourseService courseService; //indicates that courseService will hold an instance of the CourseService class
	private StudentService studentService;//indicates that studentService will hold an instance of the StudentService class
	private Student currentStudent;//indicates that currentStudent will hold an instance of the Student class.
	
	public SMSRunner() {
		sin = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
	}
	
	public static void main(String[] args) throws SQLException {
		
		SMSRunner sms = new SMSRunner();
		sms.run();//calling thre run method
	}
		private boolean run() {
			boolean success = false;
			switch (menu1()) {//used to perform actions based on input
			case 1:
				if (studentLogin()){
				registerMenu();
				success = true;
			}
				break;
			case 2: 
			System.out.println("Thank you!");
			success = true;
			break;
			
			default:
			}
			return success;
		}

		private int menu1() {
			sb.append("\n1.Student Login\n2. Quit Application\nPlease Enter Selection: ");//appends menu to StringBuilder, then prints menu.
			System.out.print(sb.toString());
			sb.delete(0, sb.length());
		
			return sin.nextInt();
		}
		
		private boolean studentLogin() {
			boolean retValue = false;
			System.out.println("Enter your email: ");
			String email = sin.next();
			System.out.print("Enter your password: ");
			String password = sin.next();
		}

			List<Student> students = studentService.getStudentByEmail(sEmail);
			
			if (students != null && !student.isEmpty()) {
				Student currentStudent = students.get(0);
		
			if (currentStudent.getsPass().equals(sPass)) {
				List<Course> courses = studentService.getStudentCourses(sEmail);
				System.out.println("MyClasses");
				for (Course course : courses) {
					System.out.println(course);
				}
		 
			boolean retValue = true;
			}	 else {
				System.out.println("User Validation failed. GoodBye!");
			} 
			}else {
					System.out.println("Invalid");
				}
			return retValue;
}
}

		private void registerMenu() {
			sb.append("\n1.Register a class\n2. Logout\nPlease Enter Selection: ");
			System.out.print(sb.toString());
			sb.delete(0, sb.length());

			switch (sin.nextInt()) {
			case 1:
				List<Course> allCourses = courseService.getAllCourses();
				List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getsEmail());
				allCourses.removeAll(studentCourses);
				System.out.printf("%5s%15S%15s\n", "ID", "Course", "Instructor");
				for (Course course : allCourses) {
					System.out.println(course);
				}
				System.out.println();
				System.out.print("Enter Course Number: ");
				int number = sin.nextInt();
				Course newCourse = courseService.GetCourseBycId(number).get(0);

				if (newCourse != null) {
					studentService.registerStudentToCourse(currentStudent.getsEmail(), newCourse);
					Student temp = studentService.getStudentByEmail(currentStudent.getsEmail()).get(0);
					
					CourseService scService = new CourseService();
					List<Course> sCourses = scService.getAllStudentCourses(temp.getsEmail());
					

					System.out.println("MyClasses");
					for (Course course : sCourses) {
						System.out.println(course);
					}
				}
				break;
			case 2:
			default:
				System.out.println("Goodbye!");
			}
		
	
			
//		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction t = session.beginTransaction();
				
//		t.commit();
//		factory.close();
//		session.close();
				
//		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Course.class).buildSessionFactory();
//		sf.close();
		

//		 String dburl = "jdbc:mysql://localhost:3306/SMSDavis";//?createDatabaseIfNotExist=true"
//		 String user = "root";
//		 String password = "De310966!";
//		 System.out.println("Connected");

	//}	 
//		 Connection connection = DriverManager.getConnection(dburl, user, password);
//		 String selectSQL = "Select * From Student";
		 
//		 Statement stmt = connection.createStatement();
//		 ResultSet result = stmt.executeQuery(selectSQL);
//		 while(result.next()) {
//			 
//			 String sEmail = result.getString("sEmail");
//			 String sName = result.getString("sName");
//			 String sPass = result.getString("sPass");
		// }
		 
		 
//		 List<Integer> cIds = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		 List<String> cNames = List.of("English", "Mathematics", "Anatomy", "Organic Chemistry", "Physics", "Digital Logic", "Object Oriented Programming", "Data Structures", "Politics", "Art");
//		 List<String> cInstructorNames = List.of("Anderea Scamaden","Eustace Niemetz","Reynolds Pastor","Odessa Belcher","Dani Swallow","Glenden Reilingen","Giselle Ardy","Carolan Stoller","Carmita De Maine","Kingsly Doxsey");
//		 
//		 try {
//			 Connection connection = DriverManager.getConnection(dburl, user, password);
//			 String insertQuery2 = "INSERT INTO Course (cId, cName, cInstructorName) VALUES (?,?,?)";
//			 
//			 try(PreparedStatement ps = connection.prepareStatement(insertQuery2)){
//				 for (int i = 0; i < cIds.size(); i++){
//					 ps.setInt(1,  cIds.get(i));
//					 ps.setString(2, cNames.get(i));
//					 ps.setString(3, cInstructorNames.get(i));
//					 
//					 int rowsAffected = ps.executeUpdate();
//					 
//					 if (rowsAffected > 0) {
//						 System.out.println("data insert successful " + (i+1));
//					 }else {
//						 System.out.println("data insert failed " + (i+1));
//					 }
//				 }
//			 }
//		 } catch(SQLException e) {
//			 e.printStackTrace();
//		 }
//		 
//		 List<String> sEmails = List.of("hluckham0@google.ru", "sbowden1@yellowbook.com", "qllorens2@howstuffworks.com", "cstartin3@flickr.com", "tattwool4@biglobe.ne.jp", "hguerre5@deviantart.com", "htaffley6@columbia.edu", "aiannitti7@is.gd", "ljiroudek8@sitemeter.com", "cjaulme9@bing.com");
//		 List<String> sNames = List.of("Hazel Luckham", "Sonnnie Bowden", "Quillan Llorens", "Clem Startin", "Thornie Attwool", "Harcourt Guerre", "Holmes Taffley", "Alexandra Iannitti", "Laryssa Jiroudek", "Cahra Jaulme");
//		 List<String> sPasss = List.of("X1uZcoIh0dj", "SJc4aWSU", "W6rJuxd", "XYHzJ1S", "Hjt0SoVmuBz", "OzcxzD1PGs", "xowtOQ", "TWP4hf5j", "bXRoLUP", "FnVklVgC6r6");
//		 
//		 
//		 try {
//		      Connection connection = DriverManager.getConnection(dburl, user, password);
//		      String insertQuery = "INSERT INTO Student (sEmail, sName, sPass) VALUES (?,?,?)";
//		      
//		      try(PreparedStatement ps = connection.prepareStatement(insertQuery)){
//		    	  for (int i = 0; i <sEmails.size(); i++) {
//		    		  ps.setString(1, sEmails.get(i));
//		    		  ps.setString(2, sNames.get(i));
//		    		  ps.setString(3, sPasss.get(i));
//		    		  
//		    		  int rowsAffected = ps.executeUpdate();
//		    		  
//		    		  if (rowsAffected > 0) {
//		    			  System.out.println("Data insert successful " + (i+1));  
//		    		  }else {
//		    			  System.out.println("Data insert failed " + (i + 1));
//		    		  }
//		    	  }
//		      }
//		   
//		   }catch(SQLException e) {
//		       e.printStackTrace();
//
//
//		   }

	   
	}

}
	


