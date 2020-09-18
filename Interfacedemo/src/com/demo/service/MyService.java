package com.demo.service;

public class MyService implements Interface1,Interface2 {

	@Override
	public void f11() {
		System.out.println("in f11");
		
	}

	@Override
	public void f12() {
		System.out.println("in f12");
		
	}

	@Override
	public void f21() {
		System.out.println("in f21");
		
	}

	@Override
	public int f22() {
		System.out.println("in f22");
		return 0;
	}
	public void f23() {
		System.out.println("in f23 overriden");
	}

	@Override
	public void f31() {
		System.out.println("in f31");
		
	}

	@Override
	public void f41() {
		System.out.println("in f41");
		
	}

}
