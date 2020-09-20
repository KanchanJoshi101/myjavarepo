package com.demo.service;
import com.demo.bean.Account;
import com.demo.exception.AccountNotFoundException;
import com.demo.exception.InvalidAccountTypeException;


public interface AccountService {
	Account searchById(String id) throws AccountNotFoundException;
	void acceptAccountData(int accTypeChoice) throws InvalidAccountTypeException;
	boolean withdrawMoney(String id,double amount) throws AccountNotFoundException;
	boolean depositMoney(String id,double amount) throws AccountNotFoundException;
	boolean transferMoney(String id,String id1,double amount) throws AccountNotFoundException;
	boolean changePin(String id) throws AccountNotFoundException;
	void checkBalance(String id) throws AccountNotFoundException;
	void displayAccount(String id) throws AccountNotFoundException;	
}
