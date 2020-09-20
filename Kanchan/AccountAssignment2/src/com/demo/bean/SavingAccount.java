package com.demo.bean;
import java.util.Date;

public class SavingAccount extends Account {
	 private String chequebookNo;
	 double interest;
	    //default constructor
	    public SavingAccount() {
	    	System.out.println("In SavingAccount default constructor");
	    	chequebookNo=null;
	    }
	    
	    //parametrized constructor
	    public SavingAccount( String accName, String accType,Date oDate,int pinNumber,double interestRate,double balance,String chequebookNo) {
	    	super(accName,accType,oDate,pinNumber,interestRate,balance);//parametrized of Account
	    	System.out.println("Saving Account is created");
	    	this.chequebookNo=chequebookNo;
	    }
	    
	    //withdraw overriden method
	    public void withdraw(double withdrawBal) {
	  		if(this.getAccBalance()-10000>=withdrawBal)
	  		{
	  			this.setAccBalance(this.getAccBalance()-withdrawBal);
	  		}
	  		else {
	  			System.out.println("Withdrawn amount is greater than the minimum balance");
	  		}		
	  	}
	    
	    //calculate interest overriden method
		public void calcInterest(double interestRate) {
			if(this.getAccBalance()>50000.0) {
				interest=(this.getAccBalance()*this.getinterestRate())+(0.02*this.getAccBalance());		
			}else {
				interest=(this.getAccBalance()*this.getinterestRate());	
			}
			
		}
		
	    //toString overriden method
	    public String toString() {
	    	return super.toString()+"\nChequebook No: " +chequebookNo+"\nInterest: "+interest;
	    }
}
