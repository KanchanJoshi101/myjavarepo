package com.demo.test;

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
		System.out.println("4. search by by id\n 5. Display all\n 6. Exit");
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
			break;
		case 3:
			System.out.println("enter Id");
			int id=sc.nextInt();
			System.out.println("enter new desg");
			String ds=sc.next();
			boolean flag;
			try {
				flag = employeeService.updateEmp(id,ds);
				if(flag) {
					System.out.println("updation done");
				}
				
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
			Employee[] emparr=employeeService.getAllEmp();
			for(Employee e1:emparr) {
				System.out.println(e1);
			}
			break;
		case 6:
			sc.close();
			System.exit(0);
			break;
		}
		}while(choice!=6);
	}

}
