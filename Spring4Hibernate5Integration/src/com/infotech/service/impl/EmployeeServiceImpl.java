package com.infotech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;
import com.infotech.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
   // @Autowired
	private EmployeeDAO employeeDAO;
	
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.createEmployee(employee);
	}

	public EmployeeServiceImpl() {
		super();
		System.out.println("default constructor service");
		System.out.println("hello");
	}

	@Override
	public Employee fetchEmployeeById(int employeeId) {
		return employeeDAO.getEmployeeById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployeesInfo() {
		return employeeDAO.getAllEmployeesDetails();
	}

}
