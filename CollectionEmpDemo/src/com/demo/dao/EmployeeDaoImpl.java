package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

import com.demo.bean.Employee;
import com.demo.bean.SalariedEmp;
import com.demo.comparator.MySalaryComparator;
import com.demo.exception.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao{
	static List<Employee> elist=null;
	static {
		elist=new ArrayList<>();
	}
	@Override
	public void addEmployee(Employee e) {
		elist.add(e);
		
	}
	@Override
	public Employee searchByEmpId(int id) throws EmployeeNotFoundException {
		Employee e=null;
		if(id<100) {
		  e=new SalariedEmp(id);
		}
		else {
		  //e=new ContractEmp();
		}
		int pos=elist.indexOf(e);
		//index of function will by default call the equals function in Product class
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		throw new EmployeeNotFoundException("not found");
	}
	@Override
	public boolean updateEmployee(String ds, Employee ob) {
		ob.setDesg(ds);
		return true;
	}
	@Override
	public List<Employee> getAllEmployees() {
		return elist;
	}
	@Override
	public boolean deletEmployee(Employee e) {
		return elist.remove(e);
	}
	@Override
	public List<Employee> sortData() {
		Collections.sort(elist, new MySalaryComparator());
		return elist;
	}

}
