package org.com.emids.main;

import java.util.Scanner;

import org.com.emids.services.Admin;
import org.com.emids.services.User;

public class OnlineBookShop {

	public static void main(String[] args) {
		System.out.println("welcome to online book shop");
		System.out.println("Press 1 to view admin page");
		System.out.println("press 2 to view user page");
		Scanner scanner = new Scanner(System.in);
		int value=  scanner.nextInt(); 
		switch (value) {
		case 1:
			Admin.adminLogIn();
			break;
		case 2:
			User.userLogIn();
			break;
			default:
				System.out.println("invalid entry");
			break;
		}
		scanner.close();
	}

}
