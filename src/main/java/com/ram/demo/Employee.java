package com.ram.demo;

public class Employee {

	private String names;

	// age of employee 
	private int age;
	
	
	public String getName() {
		return names;
	}

	public void setName(String name) {
		this.names = name;
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
