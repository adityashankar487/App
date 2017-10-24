package org.com.emids.services;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import org.com.emids.domain.Book;
import org.com.emids.domain.Customer;

public class ShoppingCart {
	public static void addToCart(Book book) {
	    ArrayList<Book> booklist = new ArrayList<>();
		booklist.add(book);
		System.out.println(" your book is successfully added to cart");
		System.out.println(" press 1 to buy book \n press 2 to exit");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			ShoppingCart.buyBook(book);
			break;
		default:
			System.out.println("thank you visit again");
			break;
		}
		scanner.close();
	}

	public static void buyBook(Book book) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your deatils");
		System.out.println("Enter your Id");
		String customerId = scanner.nextLine();
		System.out.println("Enter your Name");
		String customerName = scanner.next();
		System.out.println("Enter your  customerStreet");
		String customerStreet = scanner.next();
		System.out.println("Enter your  customerCity");
		String customerCity = scanner.next();
		System.out.println("Enter your Customer Zipcode");
		int customerZipCode = scanner.nextInt();
		Customer customer = new Customer(customerId, customerName, customerStreet, customerCity, customerZipCode);
		System.out.println("please enter the no of copies");
		int noofcopies = scanner.nextInt();
		double totalprice = book.getPrice() * noofcopies;
		DecimalFormat decimal = new DecimalFormat("0.00");
		System.out.println("Please pay: " + decimal.format(totalprice) + " \n order is place to " + customer);
		scanner.close();
	}
}