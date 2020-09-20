package com.demo.dao;
import com.demo.bean.Account;
import com.demo.exception.AccountNotFoundException;


public interface AccountDao {
	Account searchByAccId(String id) throws AccountNotFoundException;
	void addAccount(Account a);
	Account[] getAllAccounts();	
}
