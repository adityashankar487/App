package org.com.emids.services;

import java.util.Scanner;

public class Admin {
	public static boolean logInValidation(String username, String password) {
		boolean match = false;
		if (username.equals("admin") && password.equals("admin")) {
			match = true;
		}
		return match;
	}

	public static void adminLogIn() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("To change book details please login");
		System.out.println("Enter username");
		String username = scanner.nextLine();
		System.out.println("Enter password");
		String password = scanner.nextLine();
		if (Admin.logInValidation(username, password)) {
        System.out.println("You have successfully logged in ");
        Product.editExistingProduct();
		} else {
			System.out.println("invalid username or password");
			adminLogIn();
		}
		scanner.close();
	}
}
