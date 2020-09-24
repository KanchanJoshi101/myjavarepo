//DAO LAYER

package com.demo.dao;

import java.util.Set;
import java.util.TreeSet;
import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;

//PRODUCT DAO IMPLEMENTATION CLASS
public class ProductDaoImpl implements ProductDao{
	
	//DECLARING TREESET COLLECTION
	static Set<Product> pset;
	//STATIC BLOCK
	static {
		pset=new TreeSet<>();
	}

	//TO ADD A PRODUCT 
	@Override
	public void addProduct(Product p) {
		System.out.println("in Dao add");
		pset.add(p);
		
	}

	//TO SERACH FOR THE PRODUCT
	@Override
	public Product searchProById(int id)throws ProductNotFoundException {
		//for loop for traversing the product tree set
		for(Product p:pset) {
			if(p.getItemCode()==id) {
				return p;
			}
		}
		throw new ProductNotFoundException("Account Not Found");
	}

	//TO GET THE LIST OF ALL THE PRODUCTS
	@Override
	public Set<Product> getAllProduct(){
		return pset;
	}
}
