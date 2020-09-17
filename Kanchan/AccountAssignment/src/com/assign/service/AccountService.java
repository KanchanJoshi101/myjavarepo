package com.assign.service;
import com.assign.bean.Account;
import java.util.Date;
import java.util.Scanner;

import com.assign.bean.Account;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class AccountService {
	public static Scanner sc=new Scanner(System.in);
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
	//accept data for n accounts
	public static void acceptAccountData(Account[] acc){
		for(int i=0;i<acc.length;i++) {
        	System.out.println("Enter name");
        	String nm=sc.next();
        	System.out.println("Enter account type");
        	String type=sc.next();
        	System.out.println("Enter account balance");
        	double bal=sc.nextDouble();
        	System.out.println("Enter date : (dd/mm/yy)");
        	String dt=sc.next();
        	try {
        		Date bdate=sdf.parse(dt);
        		acc[i]=new Account(nm,bdate,type,bal);
            	//System.out.println(p);
        	}catch(ParseException e) {
        		e.printStackTrace();
        	}
		}
    }
	//display data for  account by id
     public static void displayAccount(Account[] acc, String id) {
    	int pos=AccountService.searchById(acc, id);
 		if(pos!=-1)
 		{   
 			System.out.println("Hello");
 			System.out.println(acc[pos].toString());
 		}
   }
    //search by id
     public static int searchById(Account[]acc, String id) {
 		for(int i=0;i<acc.length;i++)
 		{
 			if(acc[i].getAccId().equals(id)) {
 				return i;
 			}
 		}
 		System.out.println("Account Id not found");
 		return -1;
   } 
    //withdraw money
	public static int withdrawMoney(Account[] acc, String id, double withdrawBal) {
		int pos=AccountService.searchById(acc, id);
		if(pos!=-1)
		{
			acc[pos].withdraw(withdrawBal);
			return pos;
		}
		else
		{
			return -1;
		}
	}
	//deposit money
	public static int depositMoney(Account[] acc, String id, double depositBal) {
		int pos=AccountService.searchById(acc, id);
		if(pos!=-1)
		{
			acc[pos].deposit(depositBal);
			return pos;
		}
		else
		{
			return -1;
		}	
	}
}
