package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.capg.dao.EmployeeDao;
@Component
public class EmployeeService {

	@Autowired
	EmployeeDao employeedao;
	@Autowired
	public void getAllEmployee()
	{
		employeedao.getDataFromdb();
		System.out.println("this is service");
	}
}

