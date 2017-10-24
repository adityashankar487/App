package org.com.emids.domain;

public class Book {
	private String bookName;
	private double bookPrice;
	private String bookAuthor;

	public Book(String name, double price, String bookAuthor) {

		this.bookName = name;
		this.bookPrice = price;
		this.bookAuthor = bookAuthor;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getName() {
		return bookName;
	}

	public void setName(String name) {
		this.bookName = name;
	}

	public double getPrice() {
		return bookPrice;
	}

	public void setPrice(double price) {
		this.bookPrice = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookAuthor=" + bookAuthor + "]";
	}


}
