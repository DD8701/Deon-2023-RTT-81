package jpa.dao;

import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

/*
 * This is an interface. Defines methods for performing CRUD operations on Student
 * MySQL connection
 */
public interface StudentDAO {	
	
	
	List<Student> getAllStudents();
	Student getStudentByEmail(String sEmail);
	boolean validateStudent(String sEmail, String sPass);
	void registerStudentToCourse(String sEmail, int cId);
	List<Course> getStudentCourses(String sEmail);
	

	
	
}
