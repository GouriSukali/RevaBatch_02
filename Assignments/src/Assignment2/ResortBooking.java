package Assignment2;

public class ResortBooking {
	public void Booking(String input) {
		String[] detail=input.split(":");
		
		String customername = detail[0];
		int noofadults = Integer.parseInt(detail[1]);
		int noofchildren =Integer.parseInt(detail[2]);
		int noofdays =Integer.parseInt(detail[3]);
		
		if (noofadults<=0) {
			System.out.println("Invalid input for number of adults");
			return;
		}
		if (noofchildren<0) {
			System.out.println("Invalid input for number of children");
			return;
		}
		if (noofdays<=0) {
			System.out.println("Invalid input for number of days");
			return;
		}
		
		double totalcost=bookingcost(noofadults,noofchildren,noofdays);
		System.out.println(customername+" your booking is confirmed and the total cost is "+totalcost);
		
				
		
				
	}
	
	private int bookingcost(int noofadults,int noofchildren,int noofdays) {
		
		return (noofadults*1000+noofchildren*650)*noofdays;
		
	}
		

}
