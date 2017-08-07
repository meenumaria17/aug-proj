package com.staticandfinal;

public class Employee extends Department{
	
	public Employee(String name, int age, String dept_name) {
		super(dept_name);
		this.name = name;
		this.age = age;
	}

	private String name;
	
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
	
	

}
