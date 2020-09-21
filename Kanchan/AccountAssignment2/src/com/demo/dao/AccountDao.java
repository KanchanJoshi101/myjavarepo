package com.demo.dao;
import com.demo.bean.Account;
import com.demo.exception.AccountNotFoundException;


public interface AccountDao {
	Account searchByAccId(String id) throws AccountNotFoundException;
	void addAccount(Account acc);
	void withdraw(double amount,Account acc) ;
	void deposit(double amount,Account acc) ;
	void transfer(double amount,Account acc,Account acc1) ;
	void changePin(Account acc,int pin);
	String checkBalance(Account acc) ;
	String displayAccount(Account acc) ;	
	Account[] getAllAccounts();	
}
