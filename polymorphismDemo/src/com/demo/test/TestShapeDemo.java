package com.demo.test;

import java.util.Scanner;

import com.demo.bean.Circle;
import com.demo.bean.Shape;
import com.demo.bean.Triangle;

public class TestShapeDemo {

	public static void main(String[] args) {
		int choice=0;
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		Shape[] s=new Shape[10];
		do {
			System.out.println("1.Triangle");
			System.out.println("2.Circle");
			System.out.println("3.Exit");
			System.out.println("choice");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				s[i]=new Triangle(12,13,14,12,5);
				break;
			case 2:
				s[i]=new Circle(12);
				//System.out.println("area: "+s.area());
				//System.out.println("perimeter: "+s.perimeter());
				break;
			case 3:
				break;
			default:
				System.out.println("wrong choice to exit press 3");
		}
			if(choice!=3) {
			System.out.println("area: "+s[i].area());
			System.out.println("perimeter: "+s[i].perimeter());
			i++;}
			
			
		}while((i<s.length) && (choice!=3));
		int cntt=0,cntc=0;
		
		
		for(Shape s1:s) {
			if(s1!=null) {
			if (s1 instanceof Triangle) {
				((Triangle)s1).t1();
				cntt++;
			}
			else {
				((Circle)s1).c1();
			    cntc++;
		    }
		}	
		
	}
		sc.close();
	System.out.println("out of for");
	Triangle t=new Triangle();
	if(t instanceof Shape) {
		System.out.println("yes");
	}
	else {
		System.out.println("No");
	}
	
 }

}
