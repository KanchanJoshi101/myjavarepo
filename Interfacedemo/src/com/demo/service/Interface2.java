package com.demo.service;

public interface Interface2 extends Interface3,Interface4{
  void f21();
  int f22();
  default void f23() {
	  System.out.println("in f23");
  }
}
