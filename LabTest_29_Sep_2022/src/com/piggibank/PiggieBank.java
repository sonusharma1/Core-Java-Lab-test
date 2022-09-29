package com.piggibank;

/*
Program : Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class 		    'AddAmount' with a data member named 'amount' with an initial value of $50. 

@author : Sonu Sharma
@Date	: 22 Sep 2022
*/

// declare piggieBank class
public class PiggieBank {

	// declaring instance variable
	private double totalAmount = 0;

	// default constructor
	public PiggieBank() {
		super();
	}

	// constructor
	public PiggieBank(double totalAmount) {
		super();
		this.totalAmount += totalAmount;

	}

	// getter and setter method of totalamount
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount += totalAmount;
	}

}
