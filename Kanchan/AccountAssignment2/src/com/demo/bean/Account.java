package com.demo.bean;

import java.util.Date;

public abstract class Account {
	static {
		cnt=100;
	}
	public static int cnt;
	private final String ifsc= "PUNB";
	private final String bCode= "L003";
    private String accId;
    private String accName;
    private String accType;
    private Date oDate;
    private int pinNumber;
    private double interestRate;
    private double accBalance;


//Default Constructor
    public Account() {
    	accId        = null;
    	accName      = null;
    	accType      = null;
    	oDate        = null;
    	pinNumber    = 0;
    	interestRate = 0.0;
    	accBalance   = 0.0;
    }
    
//Parametrized Constructor
    public Account(String accName,String accType,Date oDate, int pinNumber, double interestRate, double balance) {
    	this.accId        = ifsc+bCode+(++cnt);
    	this.accName      = accName;
    	this.accType      = accType;
    	this.oDate        = oDate;
    	this.pinNumber    = pinNumber;
    	this.interestRate = interestRate;
    	this.accBalance   = balance;	
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
    public void setAccType(String accType) {
    	this.accType = accType;
    }
    public String getAccType() {
    	return this.accType;
    }
    public void setoDate(Date oDate) {
    	this.oDate = oDate;
    }
    public Date getoDate() {
    	return this.oDate;
    }
    public void setPinNumber(int pinNumber) {
    	this.pinNumber = pinNumber;
    }
    public int gePinNumber() {
   	    return this.pinNumber;
    }
    public void setInterestRate(double interestRate) {
    	this.interestRate = interestRate;
    }
    public double getinterestRate() {
    	return this.interestRate;
    }
    public void setAccBalance(double balance) {
    	this.accBalance = balance;
    }
   public double getAccBalance() {
    	return this.accBalance;
    }
    @Override
    public String toString() {
    return "Id : "+accId+" \nName : "+accName+ "\n Account Type:" +accType +"\nOpening Date: "+oDate+ " \nPin Number : "+pinNumber+" \nInterest Rate : "+interestRate+ "\nAccount Balance : "+accBalance;
    }
    
  	 //withdraw method 
    abstract public void withdraw(double withdrawBal);
    
  	//deposit method
  	public void deposit(double depositBal) {
  		accBalance=accBalance+depositBal;
  	}
	//show Balance method
	public String showBalance() {
		return "Balance: "+accBalance;	
	}
	
	//calculate interest
	abstract public void calcInterest(double interestRate);
}