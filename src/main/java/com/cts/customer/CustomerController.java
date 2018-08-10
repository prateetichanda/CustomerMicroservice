package com.cts.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepos customerRepos;
	
	    @PostMapping("/customer")
	    public void addCustomer(@RequestBody Customer customer)
	     {
	        	customerRepos.save(customer);
	    }
	    @GetMapping("/customer/{id}")
        public Optional<Customer> findById(@PathVariable Integer id)
        {
        return customerRepos.findById(id);
        }
	    @DeleteMapping("/customer/{id}")
        public void deleteCustomerDetails(@PathVariable Integer id)
        {
	    	customerRepos.deleteById(id);;
        }
	    @PostMapping("/updatecustomer")
        public void updateCustomerDetails(@RequestBody Customer customer)
        {
	    	customerRepos.save(customer);
        }
	    
	    @GetMapping("/customer/getAll")
        public List<Customer> findAllCustomers()
        {
        return customerRepos.findAll();
        }
}
