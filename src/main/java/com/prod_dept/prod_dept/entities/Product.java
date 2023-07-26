package com.prod_dept.prod_dept.entities;

public class Product {
	
	private Long id;
	private String name;
	private Double price;
	
	private Department department;
	
	public Product() {
		
	}
	
	public Product(Long id, String name, Double price, Department department) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
		this.setDepartment(department);
	}
	
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Department getDepartment() {
		return this.department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

}
