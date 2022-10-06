package com.demo;

/**
Program : Write a code to check a string is palindrome or not	
@author : Sonu Sharma
@date   : 6 Oct 2022
*/

import java.util.Scanner;

public class StringDemo {

	// method to check string is palindrome or not
	static void isPalindrome(String inputString) {

		String reverseString = "";

		// reversing inputString and store its value into reverseString
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverseString += inputString.charAt(i);
		}

		// comparing values of reverseString and inputString
		if (inputString.equals(reverseString)) {
			System.out.println(inputString + " is a Palindrome");
		} else {
			System.out.println(inputString + " is not a Palindrome");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");

		// calling method and also taking input from user
		isPalindrome(sc.next());

	}

}
