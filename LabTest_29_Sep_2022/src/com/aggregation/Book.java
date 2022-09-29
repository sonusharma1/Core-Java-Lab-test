package com.aggregation;

// creating class of book
public class Book {

	// instance variable -> book details
	private String bookName;
	private double price;
	private Author author;

	// default constructor
	public Book() {
		super();
	}

	// parameterized constructor
	public Book(String bookName, double price, Author author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

	// getter and setter method
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}
