package com.lambda_thread;

public class TestLambdaThread {

	public static void main(String[] args) {

		// To print the sum of a table of 2
		Runnable task1 = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += 2 * i;
			}
			System.out.println("Sum of 2's Table = " + sum);
		};

		// To print the sum of a table of 3
		Runnable task2 = () -> {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum += 3 * i;
			}
			System.out.println("Sum of 3's Table = " + sum);
		};

		// given task1 to thread1
		Thread t1 = new Thread(task1);

		// given task2 to thread2
		Thread t2 = new Thread(task2);

		// starting all thread
		t1.start();
		t2.start();

	}

}
