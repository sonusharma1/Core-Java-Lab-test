package com.piggibank;

import java.util.Scanner;

// creating class to add amount in piggie bank
public class AddAmount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// creating object of PiggieBank
		PiggieBank pBank = new PiggieBank(50);

		System.out.println("Your Piggie Bank is created with amount $50");
		System.out.println("Total Amount : $" + pBank.getTotalAmount());

		// enless loop to add money in the Piggy bank
		while (true) {
			System.out.println("Enter Amount, you want to add");
			pBank.setTotalAmount(sc.nextDouble());
			System.out.println("------------------------\nTotal Amount : $" + pBank.getTotalAmount()+ "\n------------------------");
		}

	}

}
