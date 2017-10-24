package org.com.emids.services;

import org.com.emids.domain.Customer;

public class Order {
	public void placeOrder(Customer customer1) {
		System.out.println("your order is successfully placed to the following ");
		System.out.println("ID------> " + customer1.getId());
		System.out.println("Name-----> " + customer1.getName());
		System.out.println("Street-----> " + customer1.getCustomerStreet());
		System.out.println("City----->" + customer1.getCustomerCity());
		System.out.println("zipCode---->" + customer1.getCustomerZipCode());

	}
}



