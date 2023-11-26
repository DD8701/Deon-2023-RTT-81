package jpa.service;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.util.HibernateUtil;

public class StudentService extends HibernateUtil implements StudentDAO {

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
		session.persist(s1);
		session.persist(s2);
		session.persist(s3);
		session.persist(s4);
		session.persist(s5);
		session.persist(s6);
		session.persist(s7);
		session.persist(s8);
		session.persist(s9);
		session.persist(s10);

		t.commit();
		System.out.println("Students created");
		factory.close();
		session.close();
	}

	@Override
	public List<Student> getAllStudents() {
		try (Session session = HibernateUtil.getConnection()) {
			Query<Student> query = session.createQuery("FROM Student", Student.class);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean validateStudent(String sEmail, String sPass) {
		try {
			Session session = HibernateUtil.getConnection();
			Query<Student> query = session.createQuery("FROM Student WHERE email = :sEmail AND password = :sPass",
					Student.class);
			query.setParameter("sEmail", sEmail);
			query.setParameter("sPass", sPass);
			List<Student> students = query.getResultList();

			return !students.isEmpty();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		Transaction t = null;

		try (Session session = HibernateUtil.getConnection()) {
			t = session.beginTransaction();

			Query<Student> studentQuery = session.createQuery("FROM Student WHERE email = :sEmail", Student.class);
			studentQuery.setParameter("sEmail", sEmail);
			List<Student> students = studentQuery.getResultList();

			if (!students.isEmpty()) {
				Student student = students.get(0);

				Course course = session.get(Course.class, cId);

				if (!student.getsCourses().contains(course)) {
					student.getsCourses().add(course);

					session.save(student);

					t.commit();
					System.out.println("Student with email " + sEmail + " registered for course with ID " + cId);
				} else {
					System.out.println("You are already registered in that course!");
				}
			} else {
				System.out.println("Student with email " + sEmail + " not found.");
			}
		} catch (Exception e) {
			if (t != null) {
				t.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {

		try (Session session = HibernateUtil.getConnection()) {
			Query<Student> studentQuery = session.createQuery("FROM Student WHERE email = :sEmail", Student.class);
			studentQuery.setParameter("sEmail", sEmail);
			List<Student> students = studentQuery.getResultList();

			if (!students.isEmpty()) {
				Student student = students.get(0);

				List<Course> studentCourses = student.getsCourses();

				return studentCourses;
			} else {
				System.out.println("Student with email " + sEmail + " not found.");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		try (Session session = HibernateUtil.getConnection()) {
			Query<Student> query = session.createQuery("FROM Student WHERE email = :sEmail", Student.class);
			query.setParameter("sEmail", sEmail);
			List<Student> students = query.getResultList();

			if (!students.isEmpty()) {
				return students.get(0);
			} else {
				System.out.println("Student with email " + sEmail + " not found.");
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}