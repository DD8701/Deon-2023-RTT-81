package jpa.service;

import java.util.ArrayList;

/* This is a controller class, implements the interface
 * can use CRUD operations
 * This is the CourseDAO implementation class
 */

import java.util.List;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;


public class CourseService implements CourseDAO{
	
	//List<Course> courses = new ArrayList<>();
	
	public void CourseTable() {
	
}
	@Override
	public List<Course> getAllCourses() {
		Session session = null;
		
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			session = sessionFactory.openSession();
			
			String hql = "FROM Course";
			TypedQuery<Course> query = session.createQuery(hql, Course.class);
			List<Course> sCourses = query.getResultList();
			
			return sCourses;
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
	}
	public List<Course> getAllStudentCourses(String getsEmail) {
		List<Course> courses = new ArrayList<>();
		Transaction t = null;
		try(Session session = sessionFactory.openSession()){
			t = session.beginTransaction();
			
			Student student = getStudentByEmail(sEmail);
			
			if (student != null) {
				courses.addAll(student.getsCourses());
			}else {
				System.out.println("Student not found");
			}
			t.commit();
		}
		return null;
	}
	public List<Student> GetCourseBycId(int number) {
		// TODO Auto-generated method stub
		return null;
	}

}