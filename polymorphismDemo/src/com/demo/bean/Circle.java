package com.demo.bean;

//circle class extending Shape
public class Circle extends Shape{
	//constant for calculation
	final float pi=3.142f;
	private float radius;
	
	public Circle() {
		super();
	}
	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	public float area() {
		return pi*radius*radius;
	}
	public float perimeter() {
		return 2*pi*radius;
	}
	public void c1() {
		System.out.println("in circle c1");
		
	}
}
