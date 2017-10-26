package org.com.emids.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.com.emids.domain.Book;
import org.com.emids.main.OnlineBookShop;

public class CustomerBookShelf {

	static Scanner scanner=new Scanner(System.in);
	 static List<Book>bookLists=new ArrayList<>();
	 static Iterator<Book>iterator=Product.viewAvailableProducts();
		public static void addTo() {
			System.out.println("enter book name to add ?");
			String name=scanner.next();
			while(iterator.hasNext())
			{
				Book book=iterator.next();
				if(name.equalsIgnoreCase(book.getName())) {
					bookLists.add(book);
					System.out.println("book added succesfully.");
					displayBookShelf();
					return;
				}
				
				}
				System.out.println("book not found in bookStore.\n");
				new OnlineBookShop();
			
			
		}
		public static void displayBookShelf()
		{
			if(bookLists.isEmpty()) {
				System.out.println(bookLists+"\nBookShelf is empty.add books from Availble book store.\n");
				Product.viewAvailableProducts();
			}
			else {
				for(int i=0;i<bookLists.size();i++)
					System.out.println(bookLists.get(i)+"\n");
			}
	}

	}





