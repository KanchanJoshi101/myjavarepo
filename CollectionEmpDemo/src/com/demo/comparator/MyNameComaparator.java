package com.demo.comparator;

import java.util.Comparator;

import com.demo.bean.Employee;
import com.demo.bean.SalariedEmp;

public class MyNameComaparator implements Comparator<Employee>{

	@Override
	public int compare(Employee ob1, Employee ob2) {
		return ((SalariedEmp)ob1).getPerName().compareTo(((SalariedEmp)ob2).getPerName());
			
		
		
	}
	

}
