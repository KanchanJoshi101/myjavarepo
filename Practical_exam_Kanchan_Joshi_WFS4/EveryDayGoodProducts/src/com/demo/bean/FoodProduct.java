package com.demo.bean;
import java.util.Date;

// CHILD CLASS OF PRODUCT
public class FoodProduct extends Product{
     private Date dateOfManufacture;
     private Date dateOfExpiry;
     private boolean vegetarian;
     
    //DEFAULT CONSTRUCTOR
	public FoodProduct() {
		System.out.println("In Food Product");
	}
    
	//PARAMETRIZED CONSTRUCTOR
	public FoodProduct(int itemCode, String itemName, double unitPrice, int quantity,Date dateOfManufacture, Date dateOfExpiry, boolean vegetarian) {
		super(itemCode, itemName, unitPrice,quantity);
		this.dateOfManufacture = dateOfManufacture;
		this.dateOfExpiry = dateOfExpiry;
		this.vegetarian = vegetarian;
	}
	
    //toString overriden method
    public String toString() {
    	return super.toString()+"\nDate Of Manufacture: " +dateOfManufacture +"\nDate Of Expiry: "+dateOfExpiry +"\nVegetarian"+vegetarian;
    }

}
