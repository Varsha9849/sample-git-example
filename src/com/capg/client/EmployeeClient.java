package com.capg.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.service.EmployeeService;

//@Component
public class EmployeeClient {
//@Autowired
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	    context.scan("com.capg");
	    context.refresh();
	    EmployeeService employeeservice =(EmployeeService) context.getBean("employeeservice");
	    employeeservice.getAllEmployee();    	
	}

}
