package jpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;

class StudentServiceTest {


		@Test
		public void testValidateStudent() {
			StudentService studentService = new StudentService();
						
			boolean result = studentService.validateStudent("hluckham0@google.ru", "X1uZcoIh0dj");
			
			assertTrue(result);
		}
		@Test
		public void testRegisterStudentToCourse() {
			StudentService studentService = new StudentService();
			
			studentService.registerStudentToCourse("qllorens2@howstuffworks.com", 1);
			
			List<Course> registeredCourses = studentService.getStudentCourses("qllorens2@howstuffworks.com");
			assertNotNull(registeredCourses);
			assertTrue(registeredCourses.stream().anyMatch(course -> course.getId() == 1));
			
		}
	 
}