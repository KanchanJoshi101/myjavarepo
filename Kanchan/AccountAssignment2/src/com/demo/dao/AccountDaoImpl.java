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
   //TO WITHDRAW MONEY
	@Override
	public void withdraw(double amount,Account acc) {
        acc.withdraw(amount);
	}
   //TO DEPOSIT MONEY
	@Override
	public void  deposit(double amount,Account acc) {
        acc.deposit(amount);
	}
   //TO TRANSFER MONEY
	@Override
	public void  transfer(double amount,Account acc,Account acc1) {
        acc.withdraw(amount);
        acc1.deposit(amount);
	}
   // TO CHANGE THE PIN
	@Override
	public void  changePin(Account acc,int pin) {
		acc.setPinNumber(pin);
	}
   // TO CHECK THE BALANCE
	@Override
	public String checkBalance(Account acc) {
		return acc.showBalance();
		
	}
   // TO DISPLAY ACCOUNT BY ID
	@Override
	public String displayAccount(Account acc) {
		return acc.toString();		
	}
}
