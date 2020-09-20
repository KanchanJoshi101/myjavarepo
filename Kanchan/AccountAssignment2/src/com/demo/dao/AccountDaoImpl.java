package com.demo.dao;

import java.util.Date;

import com.demo.bean.Account;
import com.demo.bean.CurrentAccount;
import com.demo.bean.SavingAccount;
import com.demo.exception.AccountNotFoundException;

public class AccountDaoImpl implements AccountDao {
	static Account[] acc;
	//STATIC BLOCK
	static {
		acc=new Account[20];
		cnt=0;
	}
	
	static int cnt;

	//TO CREATE NEW ACCOUNT
	@Override
	public void addAccount(Account a) {
		acc[cnt]=a;
		cnt++;
		
	}
    
	//SEARCH BY ID
	@Override
	public Account searchByAccId(String id)throws AccountNotFoundException{
		for(Account a:acc) {
			if(a!=null) {
			if(a.getAccId().equals(id)) {
				return a;
			}
			}
			else {
				break;
			}
		}
		throw new AccountNotFoundException("not found");
		//return null;
}
	
	//TO VIEW ALL ACCOUNTS
	@Override
	public  Account[] getAllAccounts() {
		return acc;

}
}
