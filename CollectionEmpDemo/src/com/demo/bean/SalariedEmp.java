package com.demo.bean;

import java.util.Date;

public class SalariedEmp extends Employee {
	private double salary;
	private float bonus;
	public SalariedEmp() {
		salary=0.0;
		bonus=0.0f;
	}
	public SalariedEmp(int id,String name,Date bDate,String mob,String dept,String desg,double sal,float b) {
		super(id,name,bDate,mob,dept,desg);
		salary=sal;
		bonus=b;
	}
	
	public SalariedEmp(int id) {
		super(id);
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public double calculateSal() {
		return (float)salary+bonus;
	}
	
	
	
	public String toString() {
		return super.toString()+"\nSalary: "+salary+"\nBonus :"+bonus;
	}

}
