package com.staticandfinal;

public class Department {
	
	static String company_name = "Accenture";
	private String dept_name;
	
	
	public Department(String dept_name) {
		super();
		this.dept_name = dept_name;
	}
	
	public static String getCompany_name() {
		return company_name;
	}
	public static void setCompany_name(String company_name) {
		Department.company_name = company_name;
	}
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	

}
