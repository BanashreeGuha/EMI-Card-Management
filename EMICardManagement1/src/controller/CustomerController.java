package controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Customer;
import service.CustomerService;
@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	public CustomerService getCustomerService() {
		return customerService;
	}
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showForm(ModelMap model) {
		model.put("customerData", new Customer());
		return "register/register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String saveForm(ModelMap model,@ModelAttribute("customerData")
	@Valid Customer customer, BindingResult br, HttpSession session ) {
		return null;
		
	}
	

	
	
	
	
	
	

	
	
	
	
}



