package service;

import java.util.List;

import model.Customer;

public interface CustomerService {


	void addCustomer(Customer customer);



	List<Customer> getAllCustomers();



	Customer getCustomerByemailId(String emailId);

}
