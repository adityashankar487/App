package org.com.emids.services;

import java.util.Scanner;

public class User {
	public static boolean logInValidation(String username, String password) {
		boolean match = false;
		if (username.equals("aditya") && password.equals("Change123")) {
			match = true;
		}
		return match;
	}

	public static void userLogIn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String username = scanner.nextLine();
		System.out.println("Enter password");
		String password = scanner.nextLine();
		if (User.logInValidation(username, password)) {
			System.out.println("You have successfully logged in, " + "you can proceed further");
			userDetails(scanner);
		}

		else {
			System.out.println("you have entered wrong username or  password\n"+"please enter right username or password");
		}

	}

	private static void userDetails(Scanner scanner) {
		Inventory inventory = new Inventory();
		Inventory1 inventory1 = new Inventory1();
		System.out.println("press 1 to search by bookname \npress 2 to search by bookAuthor\n"
				+ "press 3 to view product details\npress 4 to exit the bookshop");
		int number = scanner.nextInt();
		switch (number) {
		case 1:
			inventory.searchByBookName();
			break;
		case 2:
			inventory1.searchByBookAuthor();
			break;
		case 3:
			Product.viewAvailableProducts();
			break;
		case 4:
			System.out.println("have a nice day");
			break;
		default:
			System.out.println("Invalid entry");
			break;
		}
		scanner.close();
	}

}
