package day4;
import java.util.*;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String name,id,city;
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter id:");
		id=sc.nextLine();
		System.out.println("Enter city:");
		city=sc.nextLine();
		System.out.println();
		
		//default constructor
		Customer c1=new Customer();
		c1.setCustomername(name);
		c1.setCustomerid(id);
		c1.setCustomercity(city);
		System.out.println(c1);
		
		//parameterized constructors
		Customer c2=new Customer(name,id,city);
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter id:");
		id=sc.nextLine();
		System.out.println("Enter city:");
		city=sc.nextLine();
		c2.setCustomername(name);
		c2.setCustomerid(id);
		c2.setCustomercity(city);
		
		System.out.println(c2);
		sc.close();

	}

}
