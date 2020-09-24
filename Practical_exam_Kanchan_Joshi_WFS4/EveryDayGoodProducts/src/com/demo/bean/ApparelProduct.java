package com.demo.bean;

// CHILD CLASS OF PRODUCT
public class ApparelProduct extends Product {
      private String size;
      private String material;
      
	 //DEFAULT CONSTRUCTOR
	   public ApparelProduct() {
		System.out.println("In Apparel class");
	}
     
	 //PARAMETRIZED CONSTRUCTOR
	public ApparelProduct(int itemCode, String itemName, double unitPrice, int quantity,String size, String material) {
		super(itemCode, itemName, unitPrice,quantity);
		this.size = size;
		this.material = material;
	}
      
	
    //toString overriden method
    public String toString() {
    	return super.toString()+"\nSize: " +size +"\nMaterial: "+material;
    }

}
