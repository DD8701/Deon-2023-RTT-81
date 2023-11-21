package jpa.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import jpa.dao.ConnectionDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.util.HibernateUtil;

public class StudentService extends ConnectionDAO implements StudentDAO {

	public void createStudentTable() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Student student = new Student();
		session.save(student);
		t.commit();
		System.out.println("Student table created");
		factory.close();
		session.close();

	}

	public void createStudents() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Student s1 = new Student("hluckham0@google.ru", "Hazel Luckham", "X1uZcoIh0dj");
		Student s2 = new Student("sbowden1@yellowbook.com", "Sonnnie Bowden", "SJc4aWSU");
		Student s3 = new Student("qllorens2@howstuffworks.com", "Quillan Llorens", "W6rJuxd");
		Student s4 = new Student("cstartin3@flickr.com", "Clem Startin", "XYHzJ1S");
		Student s5 = new Student("tattwool4@biglobe.ne.jp", "Thornie Attwool", "Hjt0SoVmuBz");
		Student s6 = new Student("hguerre5@deviantart.com", "Harcourt Guerre", "OzcxzD1PGs");
		Student s7 = new Student("htaffley6@columbia.edu", "Holmes Taffley", "xowtOQ");
		Student s8 = new Student("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j");
		Student s9 = new Student("ljiroudek8@sitemeter.com", "Laryssa Jiroudek", "bXRoLUP");
		Student s10 = new Student("cjaulme9@bing.com", "Cahra Jaulme", "FnVklVgC6r6");
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		session.save(s5);
		session.save(s6);
		session.save(s7);
		session.save(s8);
		session.save(s9);
		session.save(s10);

		t.commit();
		System.out.println("Students created");
		factory.close();
		session.close();
	}

	@Override
	public List<Student> getAllStudents() {

		try {
			Connection connection = ConnectionDAO.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM student");
			List<Student> students = new ArrayList<>();

			while (rs.next()) {
				Student student = new Student();
				student.setEmail(rs.getString("sEmail"));
				student.setFullname(rs.getString("sName"));
				student.setPassword(rs.getString("sPass"));
				students.add(student);
			}
			return students;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("SQL State: %s\n%s", e.getSQLState(), e.getMessage());

		}
		return null;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			String sqlQuery = "SELECT * FROM student WHERE sEmail = ?";

			try (PreparedStatement ps = connection.prepareStatement(sqlQuery)) {
				ps.setString(1, sEmail);
				ResultSet rs = ps.executeQuery();

				if (rs.next()) {
					Student student = new Student();
					student.setEmail(rs.getString("sEmail"));
					student.setFullname(rs.getString("sName"));
					student.setPassword(rs.getString("sPass"));

					return student;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}
		return null;
	}

	@Override
	public boolean validateStudent(String sEmail, String sPass) {
		try {
			Connection connection = ConnectionDAO.getConnection();
			String TypedQuery = "SELECT * FROM student WHERE sEmail = ? AND sPass = ?";

			try (PreparedStatement ps = connection.prepareStatement(TypedQuery)) {
				ps.setString(1, sEmail);
				ps.setString(2, sPass);
				ResultSet rs = ps.executeQuery();

				return rs.next();

			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}
		return false;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		try {
			Student student = getStudentByEmail(sEmail);
			if(student != null) {
				Course course = getCourseById(cId);
				
				if(course != null) {
					if(!isStudentAttendingCourse(sEmail, cId)) {
						List<Course> sCourses = student.getsCourses();
						sCourses.add(course);
						
						updateStudent(student);
						System.out.println("Registration successful!");
						
						}else {
							System.out.println("You are already registered in that course!");
						}
				}else {
					System.out.println("Course not found with ID: " + cId);
				}
			}else {
				System.out.println("Student not found with email: " + sEmail);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error registering student to course.");
		}
		
	}

	private Course getCourseById(int cId) {
		// TODO Auto-generated method stub
		return null;
	}

	private void updateStudent(Student student) {
		try {
			Session session = HibernateUtil.getConnection();
			Transaction t = session.beginTransaction();
			session.update(student);
			t.commit();
			session.close();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error updating student.");
		}
		
	}

	

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		try {
			Session session = HibernateUtil.getConnection();
			Transaction t = session.beginTransaction();
			
			Student student = (Student)session.createQuery("FROM student WHERE email = :email")
			.setParameter("email", sEmail)
			.uniqueResult();
			
			if(student != null) {
				List<Course> studentCourses = student.getsCourses();
				t.commit();
				session.close();
				return studentCourses;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error retrieving student courses.");
		}

		return null;
	}

public boolean isStudentAttendingCourse(String sEmail, int cId) {
	try {
		Student student = getStudentByEmail(sEmail);
		
		if(student != null) {
			
			Session session = HibernateUtil.getConnection();
			Transaction t = session.beginTransaction();
			boolean isStudentAttendingCourse = student.getsCourses().stream().anyMatch(course -> course.getId() == cId);
			t.commit();
			session.close();
			
			return isStudentAttendingCourse;
			}
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("Error checking if student is attending a course.");
	}
	return false;
}
}
//	try {
//		Session session = HibernateUtil.getConnection();
//		Transaction t = session.beginTransaction();
//		boolean isStudentAttendingCourse = student.getsCourses().stream().anyMatch(course -> course.getId()== cId);
//		t.commit();
//		session.close();
//		return isStudentAttendingCourse;
//	}catch (Exception e) {
//		e.printStackTrace();
//		System.out.println("Error checking if student is attending course.");
//		}
//	return false;
//	}
//
//}

