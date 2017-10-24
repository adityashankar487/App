package org.com.emids.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.com.emids.domain.Book;


public class Product {
	public static final String availableProduct = null;

	public static void viewAvailableProducts() {
		System.out.printf("\n List of the books available");
		System.out.println();
		List<Book> availableProduct = new ArrayList<Book>(Product.addNewProduct());
				
		Iterator<Book> iterator = availableProduct.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName() + " " + book.getBookAuthor()+ " " + + book.getPrice());
		}
	}

	public static List<Book> addNewProduct() {
		List<Book> addNewProduct = new ArrayList<Book>();
		Book book1 = new Book("Java", 200.0, "herbit schidt");
		Book book2 = new Book("Os",300.0,"aaddi");
		Book book3 = new Book("unix",400.0,"shivam");
		addNewProduct.add(book1);
		addNewProduct.add(book2);
		addNewProduct.add(book3);	
		return addNewProduct;
	}
	
	public static void editExistingProduct() {
		Book book1 = new Book("Java", 200.0, "herbit schidt");
	     book1.setPrice(150);
		 System.out.println(book1.getPrice());
		}
}
