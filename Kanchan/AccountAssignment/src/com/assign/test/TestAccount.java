package com.assign.test;

import java.util.Date;
import java.util.Scanner;

import com.assign.bean.Account;
import com.assign.service.AccountService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestAccount {
    public static void main(String args[]) {
    	Scanner sc=new Scanner(System.in);
    	Account[] a=new Account[2];
    	String id;
    	double withdrawBal,depositBal;
    	Boolean quit=false;
    	while(!quit){
    		System.out.println("Enter your choice:\n 1. Create new Account \n 2. Withdraw \n 3. Deposit \n 4. Display Details \n 5. Exit");
        	int ch=sc.nextInt();
    		switch(ch) {
        	case 1:
        		AccountService.acceptAccountData(a);
        		break;
        	case 2:
        		System.out.println("Enter the account id in which you want to withdraw the amount");
        		id=sc.next();
        		System.out.println("Enter the amount to be withdrawn");
        		withdrawBal=sc.nextDouble();
        		AccountService.withdrawMoney(a,id,withdrawBal);
        		break;
        	case 3:
        		System.out.println("Enter the account id in which you want to deposit the amount");
        		id=sc.next();
        		System.out.println("Enter the amount to be deposited");
        		depositBal=sc.nextDouble();
        		AccountService.depositMoney(a,id,depositBal);
        		break;
        	case 4:
        		System.out.println("Enter the account id of which you want to display the details");
        		id=sc.next();
        		AccountService.displayAccount(a,id);	
        	    break;
        	case 5:
        		System.out.println("Thank you for your Time");
        		quit=true;
        		System.exit(0);
        	default:
        		System.out.println("Invalid choice");
        	} 	
         }
    }	
}

