package com.demo;

import java.util.Scanner;

public class Test {

	// method to calculate area of all shapes
	static void calShapeArea() {

		Scanner sc = new Scanner(System.in);
		Area shapeArea = new Area();

		// to calculate area of rectangle
		System.out.println("\nEnter length of rectangle");
		double len = sc.nextDouble();

		System.out.println("Enter Breadth of rectangle");
		double bdth = sc.nextDouble();

		System.out.println("Area of Rectangle = " + shapeArea.rectangleArea(len, bdth) + " cm");

		// to calculate area of square
		System.out.println("\n\n--------------------------------------------\n\nEnter a side of square");
		System.out.println("Area of Square = " + shapeArea.squareArea(sc.nextDouble()) + " cm");

		// to calculate area of square
		System.out.println("\n\n--------------------------------------------\n\nEnter Radius of a circle");
		System.out.print("Area of Circle = " + String.format("%.4g%n", shapeArea.circleArea(sc.nextDouble())));

		sc.close();
	}

	public static void main(String[] args) {

		calShapeArea();

	}

}
