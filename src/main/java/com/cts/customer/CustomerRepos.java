package com.cts.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepos extends JpaRepository<Customer,Integer>{

}
