package com.demo.test;

import com.demo.service.Interface1;
import com.demo.service.Interface2;
import com.demo.service.MyService;

public class TestInterface {
	public static void main(String[] args) {
		MyService ob=new MyService();
		//((MyService)ob).f11();
		//ob.f12();
		System.out.println(Interface1.i);
	}

}
