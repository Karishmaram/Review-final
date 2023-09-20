package com.skcet.SuperMarket.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customer;
    private String dept;
    private String product;
	public Market() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Market(Long id, String customer, String dept, String product) {
		super();
		this.id = id;
		this.customer = customer;
		this.dept = dept;
		this.product = product;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomer() { 
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
    
    
    
    
  
}