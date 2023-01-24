package com.capg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//employeeDao

@Component
public class EmployeeDao {
    @Autowired
	public void getDataFromdb()
	{
		System.out.println("used to get the data from db");
	}
}
