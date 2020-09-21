package com.demo.comparator;

import java.util.Comparator;

import com.demo.bean.Employee;
import com.demo.bean.SalariedEmp;

public class MySalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee ob1, Employee ob2) {
		System.out.println("in compare method");
		System.out.println(((SalariedEmp)ob1).getSalary()+"------"+((SalariedEmp)ob2).getSalary());
		if(((SalariedEmp)ob1).getSalary()<((SalariedEmp)ob2).getSalary()){
			return -1;
		}
		else if(((SalariedEmp)ob1).getSalary()==((SalariedEmp)ob2).getSalary()) {
		    return 0;	
		}
		else {
			return 1;
		}
		
	}

}
