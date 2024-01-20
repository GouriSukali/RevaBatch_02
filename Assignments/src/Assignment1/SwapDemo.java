package Assignment1;

import java.util.Scanner;

public class SwapDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int n2=sc.nextInt();
		
		Swap nums=new Swap(n1,n2);
		
		System.out.println("Before swapping:");
		System.out.println("First Number:"+n1);
		System.out.println("Second Number:"+n2);
		
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		
		System.out.println("After swapping:");
		System.out.println("First Number:"+n1);
		System.out.println("Second Number:"+n2);
	}

}
