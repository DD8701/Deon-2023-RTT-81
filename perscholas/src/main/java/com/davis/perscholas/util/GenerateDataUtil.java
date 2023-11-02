package com.davis.perscholas.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.davis.perscholas.model.Address;
import com.davis.perscholas.model.Cohort;
import com.davis.perscholas.model.Department;
import com.davis.perscholas.model.Department1M;
import com.davis.perscholas.model.Person;
import com.davis.perscholas.model.Teacher;
import com.davis.perscholas.model.Teacher1M;
import com.davis.perscholas.model.TeacherMM;


public class GenerateDataUtil {
	
	public void createDataManyToOne() {
		
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
		//create departments
		Department dep = new Department();
		dep.setDeptName("IT");
		
		Department dep2 = new Department();
		dep2.setDeptName("HR");
		
		
		//Create teacher
		
		Teacher t1 = new Teacher();
		t1.setDepartment(dep);
		t1.setSalary("1000");
		t1.setTeacherName("MHaseeb");
		
		Teacher t2 = new Teacher();
		t2.setDepartment(dep);
		t2.setSalary("2200");
		t2.setTeacherName("Shahparan");
		
		Teacher t3 = new Teacher();
		t3.setDepartment(dep2);
		t3.setSalary("30000");
		t3.setTeacherName("James");
		
		Teacher t4 = new Teacher();
		t4.setDepartment(dep2);
		t4.setSalary("40000");
		t4.setTeacherName("Joseph");
		
		//Store Departments in database
		session.persist(dep);
		session.persist(dep2);
		
		//Store Teachers in database
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		session.persist(t4);
		t.commit();	
	}
	
	public static void createDataOneToMany() {
		
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
		Teacher1M t1 = new Teacher1M();
		t1.setTeacherName("Haseeb");
		t1.setSalary("100");
		
		Teacher1M t2 = new Teacher1M();
		t2.setTeacherName("Jenny Finch");
		t2.setSalary("10000");
		
		Teacher1M t3 = new Teacher1M();
		t3.setTeacherName("James");
		t3.setSalary("25000");
		
		Teacher1M t4 = new Teacher1M();
		t4.setTeacherName("Sid Rose");
		t4.setSalary("3000");
		
		Teacher1M t5 = new Teacher1M();
		t5.setTeacherName("Ali");
		t5.setSalary("200");
		
		//Add teacher entity object to a list
		List<Teacher1M> teacherList = new ArrayList<Teacher1M>();
		
		teacherList.add(t1);
		teacherList.add(t2);
		teacherList.add(t3);
		teacherList.add(t4);
		teacherList.add(t5);
		
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		session.persist(t4);
		session.persist(t5);
		
		//Create Departments
		Department1M department = new Department1M();
		
		department.setDeptName("Development");
		department.setTeacherList(teacherList);
		
		//Store department
		session.save(department);
		t.commit();
		
		
		
		
		
		
	}

	

	public static void createDataOneToOne() {
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
		Address a1 = new Address();
		a1.setCity("NYC");
		a1.setState("NY");
		a1.setStreet("27th Street");
		a1.setZipcode(11103);
		
		Address a2 = new Address();
		a2.setCity("Atlanta");
		a2.setState("GA");
		a2.setStreet("Peachtree Street");
		a2.setZipcode(30303);
		
		Person p1 = new Person();
		p1.setAge(25);
		p1.setEmail("e.jon@gmail.com");
		p1.setName("Albert Adam");
		p1.setAddress(a1);
		
		Person p2 = new Person();
		p2.setAge(45);
		p2.setEmail("jane@gmail.com");
		p2.setName("Jane Doe");
		p2.setAddress(a2);
		
		session.persist(p1);
		session.persist(p2);
		session.persist(a1);
		session.persist(a2);
		
		t.commit();	
		
	}
	
	public static void createDataManyToMany() {
		
		Session session = HibernateUtil.getConnection();
		Transaction t = session.beginTransaction();
		
		//----Create Cohort/class Entity set one----
    	Cohort Class1 = new Cohort("Java Developer", "14 weeks");
	    Cohort Class2 = new Cohort("FullStack Developer", "7 Weeks");
	    Cohort Class3 = new Cohort("Python Developer", "12 Weeks");
		//------  Store Cohort/ Class  --------
		session.persist(Class1);
		session.persist(Class2);
		session.persist(Class3);
		//-----Create Cohort/Class one --------
		Set<Cohort> ClassSet1 = new HashSet<Cohort>();
		ClassSet1.add(Class1);
		ClassSet1.add(Class2);
		ClassSet1.add(Class3);
		//-----Create Cohort/Class two --------
		Set<Cohort> ClassSet2 = new HashSet<Cohort>();
		ClassSet2.add(Class2);
		ClassSet2.add(Class3);
		ClassSet2.add(Class1);
		//-----Create Cohort/Class three --------
		Set<Cohort> ClassSet3 = new HashSet<Cohort>();
		ClassSet3.add(Class3);
		ClassSet3.add(Class1);
		ClassSet3.add(Class2);
		TeacherMM t1 = new TeacherMM("100", "Haseeb", ClassSet1);
		TeacherMM t2 = new TeacherMM("200", "Jenny", ClassSet2);
		TeacherMM t3 = new TeacherMM("200", "Charlie", ClassSet3);
		session.persist(t1);
		session.persist(t2);
		session.persist(t3);
		t.commit();	 

	}
}