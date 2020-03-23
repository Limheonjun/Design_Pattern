package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Customer> customers = new ArrayList<>();
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void deliverFood(String chef, String food) {
		for(Customer customer : customers) {
			customer.receiveFood(chef, food);
		}
	}
}
