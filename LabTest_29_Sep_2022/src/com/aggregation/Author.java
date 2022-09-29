package com.aggregation;

// creating Author class to store author details
public class Author {

	// Author details
	private String authorName;
	private String authorAddr;
	// private Date DOB;

	// default constructor
	public Author() {
		super();
	}

	// parameterized constructor
	public Author(String authorName, String authorAddr) {
		super();
		this.authorName = authorName;
		this.authorAddr = authorAddr;
	}

	// getter and setter method
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorAddr() {
		return authorAddr;
	}

	public void setAuthorAddr(String authorAddr) {
		this.authorAddr = authorAddr;
	}

}
