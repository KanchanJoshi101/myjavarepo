package com.demo.bean;

public class ElectronicsProduct extends Product{
	// CHILD CLASS OF PRODUCT
	private int warranty;
	
	//DEFAULT CONSTRUCTOR
      public ElectronicsProduct() {
		System.out.println("In Electronics Class");
	}

  	//PARAMETRIZED CONSTRUCTOR
	public ElectronicsProduct(int itemCode, String itemName, double unitPrice, int quantity,int warranty) {
		super(itemCode, itemName, unitPrice,quantity);
		this.warranty = warranty;
	}
    //toString overriden method
    public String toString() {
    	return super.toString()+"\nWarranty: " +warranty;
    }

      
}
