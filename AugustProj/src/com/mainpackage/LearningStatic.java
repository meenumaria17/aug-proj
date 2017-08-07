package com.mainpackage;

import com.staticandfinal.Department;
import com.staticandfinal.Employee;

public class LearningStatic {

	
	public void TestingStaticVariables()
	{
		Employee employee_one = new Employee("Meenu", 25, "H&PS");
		//System.out.println("Current company : " + employee_one.getCompany_name());
		System.out.println("Current company : " + Employee.getCompany_name());
		/*
		 * Company_name being a static variable - belongs to a class and not an object.
		 * Every object of Department class and its sub classes will have a single instance of 
		 * Company_name , which will be shared among all its objects
		 */
		
		
		//change company name and Department;
		employee_one.setDept_name("FS");
		Employee.setCompany_name("Delloite");
		System.out.println("After company and dept changed"+ Employee.getCompany_name());
		
		Department FS_department = new Department("FS");
		System.out.println("Comapany is " + FS_department.getCompany_name() + " and " + Department.getCompany_name() + " also " + Employee.getCompany_name());

	}
}
