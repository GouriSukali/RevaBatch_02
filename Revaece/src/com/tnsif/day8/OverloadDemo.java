package com.tnsif.day8;

public class OverloadDemo {

	public static void main(String[] args) {
		Point p=new Point(); //Default constructor invoked
		System.out.println(p);
		
		Point p2=new Point(10.0f); //Single argument
		System.out.println(p2);
		
		Point p3=new Point(10.0f,20.0f); //Two argument
		System.out.println(p3);
		System.out.println("...............method overloading.............");
		System.out.println("Addition of two intergers "+MethodOverloading.addition(100,200));
		System.out.println("Addition of two intergers "+MethodOverloading.addition(100,200));
		System.out.println("Addition of two intergers "+MethodOverloading.addition(100,200));
		System.out.println("Addition of two intergers "+MethodOverloading.addition(100,200));
		System.out.println("Addition of two intergers "+MethodOverloading.addition("100","200"));
		

	}

}
