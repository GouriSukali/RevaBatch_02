package com.tnsif.day5.second;

import com.tnsif.day5.Person;
import com.tnsif.day5.Base;


public class Executor {

public static void main(String[] args) {
		
		
		Person obj = new Person();
		
		obj.setAge(23);
		obj.setCity("Bangalore");
		obj.setName("kumar");
		
		System.out.println(obj);
		
		Base obj2 = new Base();
		
		obj2.varPublic = 100;
		obj2.methodPublic();

}
}