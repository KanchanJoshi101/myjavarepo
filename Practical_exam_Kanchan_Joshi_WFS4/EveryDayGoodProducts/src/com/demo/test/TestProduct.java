package com.demo.test;

//importing packages
import java.util.Date;
import java.util.Scanner;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;
//Test Class -------> To start the execution
public class TestProduct {
     public static void main(String args[]){
    	 
    	//creating object of service class to call service layer methods
    	 
    	 ProductService productService=new ProductServiceImpl();
    	 int choice=0;
    	 do {
    	 
    	 System.out.println("Press 1.Create new product");
    	 System.out.println("Press 2.Exit");
    	 Scanner sc=new Scanner(System.in);
    	 int accTypeChoice=0; 
    	 switch(choice) {
    	 case 1:
        	      productService.acceptProductData();
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
