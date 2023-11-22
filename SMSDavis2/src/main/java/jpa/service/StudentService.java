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
			Session session = HibernateUtil.getConnection();
			Query<Student> query = session.createQuery("FROM Student", Student.class);
			List<Student> students = query.getResultList();
			session.close();
			return students;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean validateStudent(String sEmail, String sPass) {
		Student student = getStudentByEmail(sEmail);
		if ((student != null) && (sPass.equals(student.getPassword())))
			;
		return true;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByEmail(String sEmail) {
		return null;
	}

}