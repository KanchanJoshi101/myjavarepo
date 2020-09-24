package com.demo.service;

import java.util.Set;

import com.demo.bean.Product;

public interface ProductService {

	boolean addProduct();

	

	Set<Product> getProductList();



	void readData(String string);



	void writeData(String string);



	boolean deleteProduct(int id);



	boolean updateProduct(int id, double price,int qty);



	Product getProduct(int id);

}
