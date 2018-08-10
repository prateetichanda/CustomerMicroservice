package com.cts.customer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMicroserviceApplicationTests {

       @Mock
       private CustomerRepos customerRepository;
       
       @InjectMocks
       private CustomerController customerController;
       
       @Before
       public void setup(){
              MockitoAnnotations.initMocks(this);
       }
       
       @Test
       public void testGetCustomers(){
              List<Customer> customerList = new ArrayList<Customer>();
              customerList.add(new Customer(1,"adi","xyz","abc",123654,23));
              customerList.add(new Customer(2,"adi","xyz","abc",123654,23));
              customerList.add(new Customer(3,"adi","xyz","abc",123654,23));
              when(customerRepository.findAll()).thenReturn(customerList);
              
              List<Customer> result = customerController.findAllCustomers();
              assertEquals(3, result.size());
       }
       
         
       
       @Test
       public void deleteCustomer(){
              Customer customer = new Customer(1,"adi","xyz","abc",123654,23);
              customerController.deleteCustomerDetails(customer.getId());
        verify(customerRepository, times(1)).deleteById(customer.getId());
       }

}

