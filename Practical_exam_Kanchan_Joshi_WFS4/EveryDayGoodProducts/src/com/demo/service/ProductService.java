package com.demo.service;

import java.util.Set;

//SERVICE LAYER IMPLEMENTATION

import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;

public interface ProductService {
	//METHODS FOR SERVICE LAYER IMPLEMENTATION
	void acceptProductData() ;

	Product searchById(int id) throws ProductNotFoundException;

	Set<Product> getAllPerson();

}

