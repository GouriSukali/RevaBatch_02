package day4;

public class Customer {
	//data members
	private String customerName;
	private String customerCity;
	private String customerId;
	
	
	//default constructor
	public Customer() {
		System.out.println("Default Constructor");

	}
	
	//parameterized constructor
	public Customer(String customerName, String customerCity,String customerId) {
			System.out.println("Parametrized Constructor");
			this.customerName=customerName;
			this.customerCity=customerCity;
			this.customerId=customerId;

		}

		public String getCustomername() {
			return customerName;
		}

		public void setCustomername(String customername) {
			this.customerName = customername;
		}

		public String getCustomercity() {
			return customerCity;
		}

		public void setCustomercity(String customercity) {
			this.customerCity = customercity;
		}

		public String getCustomerid() {
			return customerId;
		}

		public void setCustomerid(String customerid) {
			this.customerId = customerid;
		}

		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", customerCity=" + customerCity + ", customerId="
					+ customerId + "]";
		}
		
}
