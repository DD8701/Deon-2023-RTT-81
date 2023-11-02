package com.davis.project.abcinc.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.davis.project.abcinc.model.Customer;

public class CustomerService {
	
public void createCustomerTable() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Customer customer = new Customer();
		t.commit();
		System.out.println("Successfully created customer table");
		factory.close();
		session.close();
		
	}
	public void createCustomer() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Customer c1 = new Customer();
		c1.setFullname("Mercedes Perez");
		c1.setEmail("mp@email.com");
		c1.setPassword("1111");
		
		Customer c2 = new Customer();
		c2.setFullname("Devin Perez");
		c2.setEmail("dp@email.com");
		c2.setPassword("2222");
		
		Customer c3 = new Customer();
		c3.setFullname("Francis Perez");
		c3.setEmail("fp@email.com");
		c3.setPassword("3333");
		
		Customer c4 = new Customer();
		c4.setFullname("Shaun Babin");
		c4.setEmail("sb@email.com");
		c4.setPassword("4444");
		
		t.commit();
		System.out.println("Successfully added customer(s)");
		factory.close();
		session.close();
	}
	/*public void selectCustomer() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		
	}*/
}


