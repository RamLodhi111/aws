package com.ram.demo;

public class Employee {

	private String name;

	// age of employee 
	private int age;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
