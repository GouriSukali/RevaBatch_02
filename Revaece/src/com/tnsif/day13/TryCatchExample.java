package com.tnsif.day13;

public class TryCatchExample {

	static void performDivision(int x , int y)
	{
		int z;
		try {
			System.out.println("I am in try block");
			z = x / y;
			
			System.out.println("Result is "+z);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Iam in catch block" +e.getMessage());
			
		}
	}
}
