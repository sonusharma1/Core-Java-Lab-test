package com.synchronize;

public class Account {

	private double balance = 4800;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void withdraw(double balance) {
		this.balance -= balance;
	}
}
