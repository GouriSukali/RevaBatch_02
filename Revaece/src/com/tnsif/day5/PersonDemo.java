package com.tnsif.day5;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter Person Details");
		name=sc.nextLine();
		city=sc.nextLine();
		age=sc.nextInt();
		Person obj = new Person();
		obj.setName(name);
		obj.setCity(city);
		obj.setAge(age);
		System.out.println(obj);

	}

}
