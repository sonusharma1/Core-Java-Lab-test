package com.synchronize;

import java.util.Scanner;

public class TestThread implements Runnable {

	Account account = new Account();

	@Override
	public void run() {

		System.out.println("Enter the amount to withdraw :");
		Scanner sc = new Scanner(System.in);
		makeWithdrawl(sc.nextDouble());

	}

	void viewBalanace() {
		System.out.println("\n-----------------------------------------");
		System.out.println("Main Account Balance : " + account.getBalance());
		System.out.println("-----------------------------------------");
	}

	synchronized private void makeWithdrawl(double amount) {

		if (account.getBalance() > amount) {
			account.withdraw(amount);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n" + Thread.currentThread().getName() + ", you have withdrawn " + amount + "rs");
			System.out.println("Balance : " + account.getBalance());
		} else {
			System.out.println("\n" + Thread.currentThread().getName() + ", Insufficient Balance :(");
			System.out.println("Balance : " + account.getBalance());
		}
	}

	public static void main(String[] args) {

		TestThread myThread = new TestThread();
		myThread.viewBalanace();

		Thread t0 = new Thread(myThread, "Sujal");
		Thread t1 = new Thread(myThread, "Lucy");

		t0.start();
		t1.start();
	}

}
