package Assignment2;
import java.util.Scanner;

public class ResortBookingDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the customer details");
		String input=scanner.nextLine();
		ResortBooking b=new ResortBooking();
		b.Booking(input);
		
		

	}

}
