package com.davis.project.abcinc.myinterface;

import java.util.List;

import com.davis.project.abcinc.model.Customer;

public interface CustomerDAO {
	List<Customer> getAllCustomers();
	Customer getCustomerByEmail(String email);
	List<Customer> getCustomerOrders(Customer customer);



/*public void selectCustomer() {

SessionFactory factory = new Configuration().configure().buildSessionFactory();
Session session = factory.openSession();
Transaction t = session.beginTransaction();


}*/
}
