package com.cts.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {
	@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "CS_ID")
	private Integer id;
	
	//@Column(name = "CS_NAME")
	private String name;
	
//	@Column(name = "CS_ADD1")
	private String addressLine1;
	
	//@Column(name = "CS_ADD2")
	private String addressLine2;
	
	//@Column(name = "CS_POSTCODE")
	private Integer postcode;
	
	//@Column(name = "CS_AGE")
	private Integer age;
	
	
	public Customer()
	{
		
	}
	public Customer(Integer id, String name, String addressLine1, String addressLine2, Integer postcode, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postcode = postcode;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public Integer getPostcode() {
		return postcode;
	}
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
