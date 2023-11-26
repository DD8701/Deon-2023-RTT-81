package jpa.service;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.util.HibernateUtil;

public class CourseService extends HibernateUtil implements CourseDAO {

	public void createCourseTable() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Course course = new Course();
		session.save(course);
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

		session.persist(c1);
		session.persist(c2);
		session.persist(c3);
		session.persist(c4);
		session.persist(c5);
		session.persist(c6);
		session.persist(c7);
		session.persist(c8);
		session.persist(c9);
		session.persist(c10);

		t.commit();
		System.out.println("Courses created");
		factory.close();
		session.close();

	}

	@Override
	public List<Course> getAllCourses() {

		try (Session session = HibernateUtil.getConnection()) {
			Query<Course> query = session.createQuery("FROM Course", Course.class);
			return query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}
}