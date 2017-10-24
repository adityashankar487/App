package org.com.emids.domain;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerStreet;
	private String customerCity;
	private int customerZipCode;

	public Customer(String customerId, String customerName, String customerStreet, String customerCity,
			int customerZipCode) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerStreet = customerStreet;
		this.customerCity = customerCity;
		this.customerZipCode = customerZipCode;
	}

	public String getId() {
		return customerId;
	}

	public void setId(String id) {
		this.customerId = id;
	}

	public String getName() {
		return customerName;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public String getCustomerStreet() {
		return customerStreet;
	}

	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public int getCustomerZipCode() {
		return customerZipCode;
	}

	public void setCustomerZipCode(int customerZipCode) {
		this.customerZipCode = customerZipCode;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerStreet="
				+ customerStreet + ", customerCity=" + customerCity + ", customerZipCode=" + customerZipCode + "]";
	}
}

