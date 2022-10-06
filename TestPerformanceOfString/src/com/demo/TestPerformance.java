package com.demo;

public class TestPerformance {

	static void bufferTime() {

		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < 10000000; i++) {
			strBuffer.append("Store");
		}
	}

	static void builderTime() {

		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < 10000000; i++) {
			strBuilder.append("Store");
		}
	}

	public static void main(String[] args) {

		// calculating time taken by StringBuffer
		long startTime = System.currentTimeMillis();
		bufferTime();
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time taken by StringBuffer " + elapsedTime);

		// calculating time taken by StringBuilder
		startTime = System.currentTimeMillis();
		builderTime();
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Time taken by StringBuilder " + elapsedTime);
	}

}
