package com.demo.bean;

public class Triangle extends Shape {
	final float data=0.5f;
	private float s1,s2,s3,base,height;
	
	
	public Triangle() {
		super();
	}
	
	public Triangle(float s1, float s2, float s3, float base, float height) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.base = base;
		this.height = height;
	}

	public float area() {
		return data*base*height;
	}
	public float perimeter() {
		return s1+s2+s3;
	}
	public void t1() {
		System.out.println("in triangle t1");
		
	}
}
