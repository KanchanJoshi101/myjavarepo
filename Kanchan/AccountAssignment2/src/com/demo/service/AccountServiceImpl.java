package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.demo.bean.Account;
import com.demo.bean.CurrentAccount;
import com.demo.bean.SavingAccount;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;
import com.demo.exception.AccountNotFoundException;
import com.demo.exception.InvalidAccountTypeException;

public class AccountServiceImpl implements AccountService {
	static {
		sc=new Scanner(System.in);
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	private  AccountDao  accountDao;
	private Account a;
	public  AccountServiceImpl() {
		this.accountDao = new  AccountDaoImpl();
	}
	static Scanner sc;
    static SimpleDateFormat sdf;
	static String accType="";
	double interestRate=0.0;
	static Date bdate;
    
	//CREATE ACCOUNT FUNCTION
	@Override
	public void acceptAccountData( int accTypeChoice)throws InvalidAccountTypeException{
    	System.out.println("Enter name");
    	String nm=sc.next();
    	System.out.println("Enter date : (dd/mm/yy)");
    	String dt=sc.next();
    	try {
    		bdate=sdf.parse(dt);
    	}catch(ParseException e) {
    		e.printStackTrace();
    	}
    	System.out.println("Enter PIN");
    	int pin=sc.nextInt();
    	System.out.println("Enter account balance");
    	double bal=sc.nextDouble();
    	
    	if(accTypeChoice == 1)
    	{   accType="Savings";
    	    System.out.println("Enter interest rate for savings account");
    	    double interestRate=sc.nextDouble();
    		System.out.println("Enter your cheque book no.");
    		String chequebookNo=sc.next();
    		a=new SavingAccount(nm,accType,bdate,pin,interestRate,bal,chequebookNo);
    		accountDao.addAccount(a);
    	}
    	else
    	{   
    		accType="Current";
    		System.out.println("Enter interest rate for current account");
     	    double interestRate=sc.nextDouble();
    		a=new CurrentAccount(nm,accType,bdate,pin,interestRate,bal);
    		accountDao.addAccount(a);
    	}	
    	
	}
	
	//SEARCH BY ID
	@Override
	public Account searchById(String id)  throws AccountNotFoundException{
		return accountDao.searchByAccId(id);
		
	}
	
	//WITHDRAW MONEY
	@Override
	public boolean withdrawMoney(String id, double amount)throws AccountNotFoundException{
		a=accountDao.searchByAccId(id);
		if(a!=null) {
		 a.withdraw(amount);
		 System.out.println("Amount Successfully Withdrawn");
		 return true;
		}
		return false;
		
	}
	
	//DEPOSIT MONEY
	@Override
	public boolean depositMoney(String id, double amount)throws AccountNotFoundException{
		Account a=accountDao.searchByAccId(id);
		if(a!=null) {
		a.deposit(amount);
		System.out.println("Amount Successfully Deposited");
		return true;
		}
		return false;
		
	}
	
	//TRANSFER MONEY
	@Override
	public boolean transferMoney(String id,String id1,double amount)throws AccountNotFoundException{
		Account a=accountDao.searchByAccId(id);
		Account a1=accountDao.searchByAccId(id1);
		if(a!=null) {
		a.withdraw(amount);	
		a1.deposit(amount);
		System.out.println("Amount Successfully Transferred");
		return true;
		}
		return false;
		
	}
	
	//CHANGE PIN
	@Override
	public boolean changePin(String id)throws AccountNotFoundException{
		Account a=accountDao.searchByAccId(id);
	    if(a!=null)
		{	
	    	System.out.println("Enter old PIN");
	    	int pin=sc.nextInt();	
		    System.out.println("Enter new PIN");
	    	int pin1=sc.nextInt();
	    	a.setNewPin(id,pin1);
			System.out.println("Pin changed Successfully");
		}	    
		return false;
		}
	
	//CHECK BALANCE
	@Override
	public void checkBalance(String id)throws AccountNotFoundException{
		Account a=accountDao.searchByAccId(id);
	    if(a!=null)
		{	
	    	System.out.println(a.showBalance());
		}	    
	}
	
	//DISPLAY ALL ACCOUNTS
	@Override
	public void displayAccount(String id) throws AccountNotFoundException{
		Account a=accountDao.searchByAccId(id);
	    if(a!=null)
		{	
	    	System.out.println(a.toString());
		}	 
	}
}
