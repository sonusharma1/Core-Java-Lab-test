package com.aggregation;

public class TestBook {

	// main method
	public static void main(String[] args) {

		// creating object of Book class
		Book book[] = new Book[3];

		// adding book details
		book[0] = new Book("Clean Code", 179.00, new Author("Robert Martin", "Spain"));
		book[1] = new Book("Design Patterns", 279.00, new Author("Erich Gama", "US"));
		book[2] = new Book("Refactoring", 379.00, new Author("Martin Fowler", "UK"));

		// displaying book details
		for (int i = 0; i < book.length; i++) {
			System.out.println(book[i].getBookName() + "     " + book[i].getAuthor().getAuthorName() + "     "
					+ book[i].getPrice());
		}
	}

}
