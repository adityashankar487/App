package org.com.emids.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.com.emids.domain.Book;


public class Inventory {
	static Scanner scanner = new Scanner(System.in);
	static List<Book> listForAllBook = new ArrayList<>();

	public List<Book> searchByBookName() {
		listForAllBook.addAll(Product.addNewProduct());
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the book name ");
		String bookname = scanner.next();
		Iterator<Book> iterator = listForAllBook.iterator();
		bookName(scanner, bookname, iterator);
		return listForAllBook;
	}

	private void bookName(Scanner scanner, String bookname, Iterator<Book> iterator) {
		boolean flag = false;
		while (iterator.hasNext()) {
			flag = checkPresenceOfBook(iterator, null, bookname);
			Book book = iterator.next();
			if (flag) {
				System.out.println("press 1 to add cart\n" + "press 2 to buy book");
				int key = scanner.nextInt();
				switch (key) {
				case 1:
					ShoppingCart.addToCart(book);
					break;
				case 2:
					ShoppingCart.buyBook(book);
					break;
				default:
					System.out.println("invalid entry");
					break;
				}
				System.out.println("book is available");
			} else
				System.out.println("book is not available");
			break;
		}
	}

	public List<Book> searchByBookAuthor() {
		listForAllBook.addAll(Product.addNewProduct());
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the book author name");
		String bookauthor = scanner.next();
		Iterator<Book> iterator = listForAllBook.iterator();
		bookAuthor(scanner, bookauthor, iterator);
		return listForAllBook;

	}

	private void bookAuthor(Scanner scanner, String bookauthor, Iterator<Book> iterator) {
		boolean flag = false;
		while (iterator.hasNext()) {
			flag = checkPresenceOfBook(iterator, bookauthor, null);
			Book book = iterator.next();
			if (flag) {
				System.out.println("press 1 to add bookshelf\n" + "press 2 to buy books\n");
				int key = scanner.nextInt();
				switch (key) {
				case 1:
					ShoppingCart.addToCart(book);;
				
				case 2:
					ShoppingCart.buyBook(book);
					break;
				default:
					System.out.println("Invalid entry");
					break;
				}
				System.out.println("the book author is present");
			} else
				System.out.println("the book author is not present");
		}
	}

	private boolean checkPresenceOfBook(Iterator<Book> iterator, String bookauthor, String bookName) {
		boolean flag = false;
		while (iterator.hasNext()) {
			Book book = iterator.next();
			if (null != bookauthor && bookauthor.equalsIgnoreCase(book.getBookAuthor())) {
				flag = true;
				System.out.println("Book details");
				System.out.println("Book name: " + book.getName() + " Book author: " + "" + book.getBookAuthor()
						+ "Book price: " + book.getPrice());
				break;
			} else if (null != bookName && bookName.equalsIgnoreCase(book.getName())) {
				flag = true;
				System.out.println("Book details");
				System.out.println("Book name: " + book.getName() + " Book author: " + "" + book.getBookAuthor()
						+ "Book price: " + book.getPrice());
				break;
			}
		}
		return flag;
	}

}
