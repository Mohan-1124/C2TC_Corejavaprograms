package DayThreee;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerAddress;
	
	public Customer() {
	System.out.println("Default Constructor");}
	
	public Customer(String customerName, int customerId, String customerAddress) {
		this();
		System.out.println("Parameterized Constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "customer[customerName=" +customerName + ":customerId=" +customerId+ ":customerAddress=" +customerAddress+ "]" ;
	}

}
