package com.demo.test;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.demo.bean.Employee;
import com.demo.exception.EmployeeNotFoundException;
import com.demo.exception.InvalidSalaryException;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmloyee {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		EmployeeService employeeService=new EmployeeServiceImpl();
		do {
		System.out.println("1. add new emplyee\n 2. Delete Employee \n3. update desg");
		System.out.println("4. search by by id\n 5. Display all\n6. sort data based on balance\n 7. Exit");
		System.out.println("choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			try {
				employeeService.addNewEmployee();
			} catch (InvalidSalaryException e3) {
				System.out.println(e3.getMessage());
				//e3.printStackTrace();
			}
			break;
		case 2:
			System.out.println("enter Id");
			int id=sc.nextInt();
			boolean flag;
			try {
				flag = employeeService.deleteEmloyee(id);
				if(flag) {
					System.out.println("deletion done");
				}
			} catch (EmployeeNotFoundException e4) {
				System.out.println(e4.getMessage());
				//e4.printStackTrace();
			}
			
			break;
		case 3:
			System.out.println("enter Id");
			id=sc.nextInt();
			System.out.println("enter new desg");
			String ds=sc.next();
			try {
				flag = employeeService.updateEmp(id,ds);
				if(flag) {
					System.out.println("updation done");
				}
				/*else {
					throw new EmployeeNotFoundException("Employee not found");
				}*/
			} catch (EmployeeNotFoundException e3) {
				// TODO Auto-generated catch block
				System.out.println(e3.getMessage());
			}
			
			break;
		case 4:
			
			Employee e;
			try {
				System.out.println("enter Id");
				id=sc.nextInt();
				e = employeeService.searchById(id);
				if(e!=null) {
					System.out.println("employee found"+e);
				}
				
			} catch (EmployeeNotFoundException e2) {
				// TODO Auto-generated catch block
				//e2.printStackTrace();
				System.out.println(e2.getMessage());
			}
			
			
			break;
		case 5:
			List<Employee> emparr=employeeService.getAllEmp();
			for(Employee e1:emparr) {
				System.out.println(e1);
			}
			break;
		case 6:	
			List<Employee> elist=employeeService.sortOnBalance();
			Iterator<Employee> it=elist.iterator();
			//ListIterator<Employee> lstiterator=elist.listIterator();
			
			while(it.hasNext()) {
				Employee e5=it.next();
				System.out.println(e5);
			}
			break;
			
			/*for(Employee e1:emparr) {
				System.out.println(e1);
			}*/
			//elist.forEach(e1->{System.out.println(e1);});  //consumer
			//elist.forEach(System.out::println);
		case 7:
			sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=7);
	}

}
