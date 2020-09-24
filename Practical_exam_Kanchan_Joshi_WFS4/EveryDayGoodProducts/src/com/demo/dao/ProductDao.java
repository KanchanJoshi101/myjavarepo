//DAO LAYER

package com.demo.dao;

import java.util.Set;

import com.demo.bean.Product;
import com.demo.exception.ProductNotFoundException;

//DAO LAYER INTERFACE FOR PRODUCT DAO IMPLEMENTATION CLASS
public interface ProductDao {

	Product searchProById(int id) throws ProductNotFoundException;

	void addProduct(Product p);

	Set<Product> getAllProduct();
}
