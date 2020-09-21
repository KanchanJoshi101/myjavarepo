package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeNotFoundException;
import com.demo.exception.InvalidSalaryException;

public interface EmployeeService {
	void addNewEmployee() throws InvalidSalaryException;

	Employee searchById(int id) throws EmployeeNotFoundException ;

	boolean updateEmp(int id,String ds) throws EmployeeNotFoundException;

	List<Employee> getAllEmp();

	boolean deleteEmloyee(int id) throws EmployeeNotFoundException;

	List<Employee> sortOnBalance();
}
