package com.demo;

/**
 * Program : Compare string builder and string Buffer using performance test *
 * 
 * @author : Sonu Sharma
 * @date : 6 Oct 2022
 */

public class TestPerformance {

	// method to perform stress test on StringBuffer class
	static void bufferTime() {

		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < 10000000; i++) {
			strBuffer.append("Store");
		}
	}

	// method to perform stress test on StringBuilder class
	static void builderTime() {

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < 10000000; i++) {
			strBuilder.append("Store");
		}
	}

	public static void main(String[] args) {

		// calculating time taken by StringBuffer
		double startTime = System.currentTimeMillis();
		bufferTime();
		double stopTime = System.currentTimeMillis();

		double elapsedTime = (stopTime - startTime) / 1000;
		System.out.println("Time taken by StringBuffer " + elapsedTime + " sec");

		// calculating time taken by StringBuilder.
		startTime = System.currentTimeMillis();
		builderTime();
		stopTime = System.currentTimeMillis();

		elapsedTime = (stopTime - startTime) / 1000;
		System.out.println("Time taken by StringBuilder " + elapsedTime + " sec");
	}

}
