package javalearning;

public class Customer {
	private int customerId;
	private String Name;
	

	public static void main(String[] args) {
		
		Customer cust= new Customer();
		cust.setCustomerId(12);
		cust.setName(" praveen");
		System.out.println(" CustomerId---->"+cust.getCustomerId());
		System.out.println(" Name-----"+ cust.getName());
		System.out.println(" this is committed by Ravi varma");
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}

}
