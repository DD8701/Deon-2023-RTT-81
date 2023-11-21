package jpa.dao;
import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;


public interface StudentDAO {

	List<Student> getAllStudents();
	boolean validateStudent(String sEmail, String sPass);
	void registerStudentToCourse(String sEmail, int cId);
	List<Course> getStudentCourses(String sEmail);
	Student getStudentByEmail(String sEmail);
	
}
