package com.assign.bean;

import java.util.Date;
public class Account {
	static {
		cnt=100;
	}
	public static int cnt;
	private final String ifsc= "PUNB";
	private final String bCode= "L003";
    private String accId;
    private String accName;
    private Date oDate;
    private String accType;
    private double accBalance;


//Default Constructor
    public Account() {
    	accId      = null;
    	accName    = null;
    	oDate      = null;
    	accType    = null;
    	accBalance = 0.0;
    }
//Parametrized Constructor
    public Account(String accName, Date oDate, String accType, double balance) {
    	this.accId      = ifsc+bCode+(++cnt);
    	this.accName    = accName;
    	this.oDate      = oDate;
    	this.accType    = accType;
    	this.accBalance = balance;	
    }
 //getter and setter methods
    
    public String getAccId() {
    	return this.accId;
    }
    public void setAccName(String accName) {
    	this.accName = accName;
    }
    public String getAccName() {
    	return this.accName;
    }
    public void setoDate(Date oDate) {
    	this.oDate = oDate;
    }
    public Date getoDate() {
    	return this.oDate;
    }
    public void setAccType(String accType) {
    	this.accType = accType;
    }
    public String getAccType() {
    	return this.accType;
    }
    public void setAccBalance(double balance) {
    	this.accBalance = balance;
    }
    public double getAccBalance() {
    	return this.accBalance;
    }

     @Override
    public String toString() {
        return "Id : "+accId+" \nName : "+accName+" \ndate : "+oDate+" \nAccount Type : "+accType+ "\nAccount Balance : "+accBalance;
    }
    //withdraw method
	public void withdraw(double withdrawBal) {
		if(accBalance-10000>=withdrawBal)
		{
			accBalance=accBalance-withdrawBal;
			System.out.println("Amount Successfully Withdrawn");
		}
		else {
			System.out.println("Withdrawn amount is greater than the minimum balance");
		}		
	}
	//deposit method
	public void deposit(double depositBal) {
		accBalance=accBalance+depositBal;
		System.out.println("Amount Successfully Deposited");
	}
}