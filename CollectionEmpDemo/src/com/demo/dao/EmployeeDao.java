package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeNotFoundException;

public interface EmployeeDao{
	void addEmployee(Employee e);

	Employee searchByEmpId(int id) throws EmployeeNotFoundException;

	boolean updateEmployee(String ds,Employee ob);

	List<Employee> getAllEmployees();

	boolean deletEmployee(Employee e);

	List<Employee> sortData();

}
