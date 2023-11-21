package jpa.service;

import java.sql.Connection;
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
import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.util.HibernateUtil;


public class CourseService implements CourseDAO {

	public void createCourseTable() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Course course = new Course();
		t.commit();
		System.out.println("Course table created");
		factory.close();
		session.close();

	}

	public void createCourses() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Course c1 = new Course("English", "Anderea Scamaden");
		Course c2 = new Course("Mathematics", "Eustace Niemetz");
		Course c3 = new Course("Anatomy", "Reynolds Pastor");
		Course c4 = new Course("Organic Chemistry", "Odessa Belcher");
		Course c5 = new Course("Physics", "Dani Swallow");
		Course c6 = new Course("Digital Logic", "Glenden Reilingen");
		Course c7 = new Course("Object Oriented Programming", "Giselle Ardy");
		Course c8 = new Course("Data Structures", "Carolan Stoller");
		Course c9 = new Course("Politics", "Carmita De Maine");
		Course c10 = new Course("Art", "Kingsly Doxsey");
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);
		session.save(c5);
		session.save(c6);
		session.save(c7);
		session.save(c8);
		session.save(c9);
		session.save(c10);
		
		t.commit();
		System.out.println("Courses created");
		factory.close();
		session.close();

	}

	@Override
	public List<Course> getAllCourses() {
		try {
			Connection connection = ConnectionDAO.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM course");
			List<Course> courses = new ArrayList<>();

			while (rs.next()) {
				Course course = new Course();
				course.setId(rs.getInt("cId"));
				course.setCourseName(rs.getString("cName"));
				course.setInstructorName(rs.getString("cInstructorName"));
				courses.add(course);
			}
			return courses;

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		}
		return null;
	}


	
	
//	public Course getCourseById(int cId) {
//		try {
//			Session session = HibernateUtil.getConnection();
//			String sqlQuery = "SELECT c FROM Course c WHERE c.id = : cId";
//			TypedQuery<Course> query = session.createQuery(sqlQuery, Course.class);
//			return query.getSingleResult();
//
//		} catch (NoResultException e) {
//			return null;
//
//		}
//	}
}
