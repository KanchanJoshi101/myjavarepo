package com.demo.dao;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeNotFoundException;

public interface EmployeeDao{
	void addEmployee(Employee e);

	Employee searchByEmpId(int id) throws EmployeeNotFoundException;

	boolean updateEmployee(String ds,Employee ob);

	Employee[] getAllEmployees();

}
