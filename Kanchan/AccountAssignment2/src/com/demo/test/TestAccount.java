package com.demo.test;
import java.util.Date;
import java.util.Scanner;

import com.demo.bean.Account;
import com.demo.service.AccountService;
import com.demo.bean.CurrentAccount;
import com.demo.bean.SavingAccount;
import com.demo.exception.AccountNotFoundException;
import com.demo.exception.InvalidAccountTypeException;
import com.demo.service.AccountServiceImpl;
public class TestAccount {
     public static void main(String args[]){
    	//creating object of service class to call service layer methods
    	 AccountService accountService=new AccountServiceImpl();
    	 int choice=0;
    	 do {
    	 
    	 System.out.println("Press 1.Create new account");
    	 System.out.println("Press 2.Withdraw amount");
    	 System.out.println("Press 3.Make a deposit");
    	 System.out.println("Press 4.Transfer fund");
    	 System.out.println("Press 5.Change pin");
    	 System.out.println("Press 6.Check Balance");
    	 System.out.println("Press 7. Display account by id");
    	 System.out.println("Press 8.Exit");
    	 Scanner sc=new Scanner(System.in);
    	 choice=sc.nextInt();
    	 String id=" ", id1=" ";
    	 double amount=0;
    	 int accTypeChoice=0; 
    	 switch(choice) {
    	 case 1:
    		 System.out.println("Do you want to open the savings account or the current account?");
        	 System.out.println("Press 1. Savings Account");
        	 System.out.println("Press 2.Current Account");
        	 try {
        	    accTypeChoice=sc.nextInt();
        	    accountService.acceptAccountData(accTypeChoice);
        	 } catch (InvalidAccountTypeException  e3) {
 				System.out.println(e3.getMessage());
 			}
        	 break;
    	 case 2:
    		 System.out.println("Enter the account id in which you want to withdraw the amount");
     		 id=sc.next();
     		 System.out.println("Enter the amount to be withdrawn");
     		 amount=sc.nextDouble();
     		 try {
     		    accountService.withdrawMoney(id,amount); 
     		 }catch (AccountNotFoundException a1) {
  				System.out.println(a1.getMessage());
  			}
     		 break;
    	 case 3:
    		 System.out.println("Enter the account id in which you want to deposit the amount");
     		 id=sc.next();
     		 System.out.println("Enter the amount to be deposited");
     		 amount=sc.nextDouble();
     		 try {
     		    accountService.depositMoney(id,amount);
     		 }catch (AccountNotFoundException a1) {
  				System.out.println(a1.getMessage());
  			}
     		 break;
    	 case 4:
    		 System.out.println("Enter the account id from which you want to transfer the amount");
     		 id=sc.next();
     		 System.out.println("Enter the account id to which you want to transfer the amount");
     		 id1=sc.next();
     		 System.out.println("Enter the amount to be transfered");
    		 amount=sc.nextDouble();
    		 try {
    		    accountService.transferMoney(id,id1,amount);
    		 }catch (AccountNotFoundException a1) {
  				System.out.println(a1.getMessage());
  			}
    		 break;
    	 case 5:
    		 System.out.println("Enter the account id of which you want to change the pin");
     		 id=sc.next();
     		 try {
     		    accountService.changePin(id);
     		 }catch (AccountNotFoundException a1) {
  				System.out.println(a1.getMessage());
  			}
     		 break;
    	 case 6:
    		 System.out.println("Enter the account id of which you want to check the balance");
    		 id=sc.next();
    		 try {
    		    accountService.checkBalance(id);
    		 }catch (AccountNotFoundException a1) {
  				System.out.println(a1.getMessage());
  			}
     		 break;
    	 case 7: 
    		 System.out.println("Enter the account id of which you want to display the details");
     		 id=sc.next();
     		 try {
     		    accountService.displayAccount(id);	
     		 }catch (AccountNotFoundException a1) {
  				System.out.println(a1.getMessage());
  			}
     	     break;
    	 case 8:
    		 System.exit(0);
    		 break;
    	 default:
    		 System.out.println("Wrong Choice");
    	   }
    	 }while(choice<=8);
     }
}
