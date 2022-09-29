package com.evenodd;

import java.util.Scanner;

/*
Program :  Write a program to print sum of even and odd numbers using varargs.
@author : Sonu Sharma
@Date	: 22 Sep 2022
*/

public class SumOfEvenOdd {

	// mathod to take array elements from user
	static void inputArray() {

		Scanner sc = new Scanner(System.in);

		// taking size of an array
		System.out.println("How many elements you want to add");
		int size = sc.nextInt();

		// declare array
		int[] arr = new int[size];

		// store elements in array
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// calling method to calculate sum of even and odd numbers
		sum(arr);
	}

	// method to calculate sum of even and odd numbers
	static void sum(int... arr) {

		int sumOfEven = 0, sumOfOdd = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				sumOfEven += arr[i];
			} else {
				sumOfOdd += arr[i];
			}
		}

		System.out.println("Sum Of Even No : " + sumOfEven);
		System.out.println("Sum of Odd No : " + sumOfOdd);
	}

	public static void main(String[] args) {

		inputArray();
	}

}
