package com.davis.project.abcinc.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Date;
import com.davis.project.abcinc.model.Customer;
import com.davis.project.abcinc.model.Order;

public class OrderService {
	
	public void createOrderTable() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Order order = new Order();
		t.commit();
		System.out.println("Successfully created customer table");
		factory.close();
		session.close();
		
	}
	public void createOrder() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Order o1 = new Order();
			o1.setOrderId(101);
			o1.setProductName("Halloween mask");
			o1.setOrderDate(null);//?
		
		
		
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
