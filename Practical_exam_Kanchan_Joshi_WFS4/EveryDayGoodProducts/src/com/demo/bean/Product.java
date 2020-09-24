package com.demo.bean;

//PARENT PRODUCT CLASS TO STORE THE PRODUCT ENTITY
public abstract class Product implements Comparable<Product>{
	//DECLARING VARIABLES
	
    private int itemCode;
    private String itemName;
    private double unitPrice;
    private int quantity;
    
    //DEFAULT CONSTRUCTOR OF CLASS PRODUCT
	public Product() {
		super();
		this.itemCode = 0;
		this.itemName = null;
		this.unitPrice = 0.0;
		this.quantity = 0;
	}

	//PARAMETRIZED CONSTRUCTOR OF CLASS PRODUCT
	public Product(int itemCode, String itemName, double unitPrice, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
    
	//GETTER SETTER METHODS OF CLASS PRODUCT
	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	//OVERRIDEN TOSTRING() TO DISPLAY THE DETAILS
	@Override
	public String toString() {
		return "Item Code" +itemCode +"\nItem Name" +itemName+"\nUnit Price" +unitPrice +"\nQuantity"+quantity;
	}
	
	@Override
	public int compareTo(Product ob) {
		System.out.println("In person compareTo"+itemCode+"----"+ob.itemCode);
		if(this.itemCode<ob.itemCode) {
			return -1;
		}else if(this.itemCode==ob.itemCode) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
}
