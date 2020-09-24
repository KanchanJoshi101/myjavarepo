package com.demo.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import com.demo.dao.ProductDaoImpl;
import com.demo.exception.ProductNotFoundException;
import com.demo.dao.ProductDao;
import com.demo.bean.Product;

//SERVICE LAYER IMPLEMENTATION
public class ProductServiceImpl implements ProductService throws ProductNotFoundException{
	
	//static block
	static {
		sc=new Scanner(System.in);
		sdf=new SimpleDateFormat("dd/MM/yyyy");
	}
	//declaring object of dao class 
	private  ProductDao  productDao;
	private Product pro;
	
	//creating object of dao class to call dao layer methods
	public  ProductServiceImpl() {
		this.productDao = new  ProductDaoImpl();
	}
	//declaring variables
	static Scanner sc;
    static SimpleDateFormat sdf;

    //to accept the product
	@Override
	public void acceptProductData() {
		System.out.println("enter item Code");
		int itemCode=sc.nextInt();
		System.out.println("enter item name");
		String itemName=sc.nextLine();
		System.out.println("enter unit Price");
		double unitPrice=sc.nextDouble();
		System.out.println("enter Quantity");
		int quantity=sc.nextInt();
		
		//pro=new Product(itemCode,itemName,unitPrice,quantity);
		productDao.addProduct(pro);
	}
	//to search the product by id
	@Override
	public Product searchById(int id)throws ProductNotFoundException {
		return productDao.searchProById(id);
	}
    
	// to get all the products
	@Override
	public Set<Product> getAllPerson() {
		return productDao.getAllProduct();
	}

}
