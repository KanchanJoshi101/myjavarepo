package com.demo.bean;
import java.util.Date;

public class CurrentAccount extends Account{
	 private  int noOfTransactions;
	 private double interest;
	    //default constructor
	    public CurrentAccount() {
	    	System.out.println("In SavingAccount default constructor");
	    }
	    //parametrized constructor
	    public CurrentAccount(String accName,String accType,Date oDate, int pinNumber,double interestRate, double balance) {
	    	super(accName,accType,oDate,pinNumber,interestRate,balance);//parametrized of CurrentAccount
	    	System.out.println("Current Account is created");
	        //this.noOfTransactions=noOfTransactions;
	    }
	    //withdraw overriden method
	    public void withdraw(double withdrawBal) {
	  		if(this.getAccBalance()>=withdrawBal)
	  		{
	  			this.setAccBalance(this.getAccBalance()-withdrawBal);
	  		}
	  		else {
	  			System.out.println("Withdrawn amount is greater than the minimum balance");
	  		}		
	  	}
	    //calculate interest overriden method
		public void calcInterest(double interestRate) {
			interest=this.getAccBalance()*this.getinterestRate();	
		}
	    //toString overriden method
	    public String toString() {
	    	return super.toString()+"\nNo. Of Transactions: " +noOfTransactions +"\nInterest: "+interest;
	    }
    
}
