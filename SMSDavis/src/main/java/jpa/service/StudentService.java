package jpa.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
/*
 * This is a controller class, implements the interface
 * can use CRUD operations
 * This is the StudentDAO Implementation class.
 */

public class StudentService implements StudentDAO {

	String dburl = "jdbc:mysql://localhost:3306/SMSDavis";// ?createDatabaseIfNotExist=true"
	String user = "root";
	String password = "De310966!";

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection(dburl, user, password);
				PreparedStatement ps = connection.prepareStatement("SELECT * FROM Student");
				ResultSet resultSet = ps.executeQuery()) {
			while (resultSet.next()) {
				Student student = new Student();
				student.getsEmail();
				student.setsName(resultSet.getString("sName"));
				student.setsPass(resultSet.getString("sPass"));
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;

	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		Student student = null;
		try (Connection connection = DriverManager.getConnection(dburl, user, password);
				PreparedStatement ps = connection.prepareStatement("SELECT * FROM Student WHERE sEmail = ?")){
				ps.setString(1, sEmail);
				
				try (ResultSet resultSet = ps.executeQuery()) {
					
				while (resultSet.next()) {
					student = new Student();
					student.setsEmail(resultSet.getString("sEmail"));
					student.setsName(resultSet.getString("sName"));
					student.setsPass(resultSet.getString("sPass"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return student;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPass) {
		Student student = getStudentByEmail(sEmail);
		return student != null && student.getsPass().equals(sPass);
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		Transaction t = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			t = session.beginTransaction();

			Student student = session.get(Student.class, sEmail);
			Course sCourse = session.get(Course.class, cId);

			if (student != null && sCourse != null) {
				student.getsCourses().add(sCourse);
				session.update(student);
			}

			t.commit();
			session.close();
		} catch (Exception e) {
			if (t != null) {
				t.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		Session session = null;
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			Student student = getStudentByEmail(sEmail);

			if (student != null) {
				return student.getsCourses();
			} else {
				return Collections.emptyList();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void registerStudentToCourse(String getsEmail, Course newCourse) {
		Transaction t = null;
		try{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				Session session = sessionFactory.openSession();
				t = session.beginTransaction();
				
				Student student = session.get(Student.class, sEmail);
				
				  if (student != null) {
		                // Check if the student is already registered for the course
		                if (!student.getsCourses().contains(newCourse)) {
		                    student.getsCourses().add(newCourse);

		                    // Update the student with the new course
		                    session.update(student);
		                } else {
		                    // Student is already registered for this course
		                    System.out.println("You are already registered in that course!");
		                }

		                t.commit();
		            } else {
		                System.out.println("Student not found");
		            }
		        } catch (HibernateException e) {
		            if (t != null) {
		                t.rollback();
		            }
		            e.printStackTrace();
			
		}
		
	}

}
