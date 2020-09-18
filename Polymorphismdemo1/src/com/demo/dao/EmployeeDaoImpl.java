package com.demo.dao;

import java.util.Date;

import com.demo.bean.Employee;
import com.demo.bean.SalariedEmp;
import com.demo.exception.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao{
	static Employee[] emparr;
	static {
		emparr=new Employee[20];
		emparr[0]=new SalariedEmp(12,"aaa",new Date(),"22222","hr","mgr",2134,23);
		//emparr[1]=new Salaried()
		cnt=0;
	}
	
	static int cnt;

	@Override
	public void addEmployee(Employee e) {
		emparr[cnt]=e;
		cnt++;
		
	}

	@Override
	public Employee searchByEmpId(int id) throws EmployeeNotFoundException{
		for(Employee e:emparr) {
			if(e!=null) {
			if(e.getPerId()==id) {
				return e;
			}
			}
			else {
				break;
			}
		}
		
		throw new EmployeeNotFoundException("not found");
		
		
	}

	@Override
	public boolean updateEmployee(String ds,Employee e) {
			e.setDesg(ds);
			return true;
		
	}

	@Override
	public Employee[] getAllEmployees() {
		return emparr;
	}

}
